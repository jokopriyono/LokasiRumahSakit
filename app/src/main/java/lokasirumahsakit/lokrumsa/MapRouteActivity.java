package lokasirumahsakit.lokrumsa;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MapRouteActivity extends AppCompatActivity implements GoogleMap.OnMarkerClickListener, GoogleMap.OnMapClickListener {
    private MapView mMapView;
    private GoogleMap googleMap;
    private String no = "";
    private Toolbar toolbar;
    private TextView txtJarak;
    private TextView txtAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_route);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null)
            no = bundle.getString("no");

        toolbar = findViewById(R.id.toolbar_map);
        txtJarak = findViewById(R.id.txt_jarak);
        txtAlamat = findViewById(R.id.txt_alamat);

        //inisialisasi peta di dalam fragment
        mMapView = findViewById(R.id.map);
        mMapView.onCreate(savedInstanceState);
        mMapView.onResume(); // needed to get the map to display immediately
        try {
            MapsInitializer.initialize(getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap mMap) {
                googleMap = mMap;

                // my location button on map
                if (ActivityCompat.checkSelfPermission(MapRouteActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MapRouteActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
                Criteria criteria = new Criteria();
                Location location = locationManager.getLastKnownLocation(locationManager.getBestProvider(criteria, false));

                if (no.equals("")){
                    Toast.makeText(MapRouteActivity.this, "Bundle kosong", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    LocalDB localDB = new LocalDB(getApplicationContext());
                    SQLiteDatabase db = localDB.getReadableDatabase();
                    Cursor cursor = db.rawQuery("SELECT * FROM rumah_sakit WHERE no=" + no, null);
                    cursor.moveToFirst();
                    if (cursor.getCount()!=0) {
                        toolbar.setTitle(localDB.getStringValue(cursor, "nama"));
                        txtAlamat.setText(localDB.getStringValue(cursor, "alamat"));
                        String jarak = localDB.hitungJarakRS(location, localDB.getDoubleValue(cursor, "latitude"), localDB.getDoubleValue(cursor, "longitude")) + " Km";
                        txtJarak.setText(jarak);

                        new connectAsyncTask(makeURL(location.getLatitude(), location.getLongitude(),
                                localDB.getDoubleValue(cursor, "latitude"),
                                localDB.getDoubleValue(cursor, "longitude"))).execute();

                        LatLng dest = new LatLng(localDB.getDoubleValue(cursor, "latitude"),
                                localDB.getDoubleValue(cursor, "longitude"));

                        MarkerOptions markdest = new MarkerOptions().position(dest)
                                .title(localDB.getStringValue(cursor, "nama"))
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker));
                        googleMap.addMarker(markdest);
                        cursor.close();
                    } else {
                        Toast.makeText(MapRouteActivity.this, "Cursor kosong", Toast.LENGTH_SHORT).show();
                        cursor.close();
                        finish();
                    }
                }
                LatLng source = new LatLng(location.getLatitude(),location.getLongitude());

                // camera zoom letak marker nya
                CameraPosition cameraPosition = new CameraPosition.Builder().target(source).zoom(15).build();
                googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                googleMap.setOnMarkerClickListener(MapRouteActivity.this);
                googleMap.setOnMapClickListener(MapRouteActivity.this);
                googleMap.setMyLocationEnabled(true);
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
            }
        });
    }

    private List<LatLng> decodePoly(String encoded) {

        List<LatLng> poly = new ArrayList<LatLng>();
        int index = 0, len = encoded.length();
        int lat = 0, lng = 0;

        while (index < len) {
            int b, shift = 0, result = 0;
            do {
                b = encoded.charAt(index++) - 63;
                result |= (b & 0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);
            int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
            lat += dlat;

            shift = 0;
            result = 0;
            do {
                b = encoded.charAt(index++) - 63;
                result |= (b & 0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);
            int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
            lng += dlng;

            LatLng p = new LatLng( (((double) lat / 1E5)),
                    (((double) lng / 1E5) ));
            poly.add(p);
        }

        return poly;
    }

    public void drawPath(String  result) {

        try {
            //Tranform the string into a json object
            final JSONObject json = new JSONObject(result);
            JSONArray routeArray = json.getJSONArray("routes");
            JSONObject routes = routeArray.getJSONObject(0);
            JSONObject overviewPolylines = routes.getJSONObject("overview_polyline");
            String encodedString = overviewPolylines.getString("points");
            List<LatLng> list = decodePoly(encodedString);
            googleMap.addPolyline(new PolylineOptions()
                    .addAll(list)
                    .width(5)
                    .color(Color.parseColor("#00b5b0"))
                    .geodesic(true)
            );
           /*
           for(int z = 0; z<list.size()-1;z++){
                LatLng src= list.get(z);
                LatLng dest= list.get(z+1);
                Polyline line = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(src.latitude, src.longitude), new LatLng(dest.latitude,   dest.longitude))
                .width(2)
                .color(Color.BLUE).geodesic(true));
            }
           */
        }
        catch (JSONException e) {

        }
    }

    private class connectAsyncTask extends AsyncTask<Void, Void, String> {
        private ProgressDialog progressDialog;
        String url;
        connectAsyncTask(String urlPass){
            url = urlPass;
        }
        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();
            progressDialog = new ProgressDialog(MapRouteActivity.this);
            progressDialog.setMessage("Fetching route, Please wait...");
            progressDialog.setIndeterminate(true);
            progressDialog.show();
        }
        @Override
        protected String doInBackground(Void... params) {
            JSONParser jParser = new JSONParser();
            return jParser.getJSONFromUrl(url);
        }
        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            progressDialog.hide();
            if(result!=null){
                drawPath(result);
            }
        }
    }

    public String makeURL (double sourcelat, double sourcelog, double destlat, double destlog ){
        return "https://maps.googleapis.com/maps/api/directions/json" +
                "?origin=" +// from
                Double.toString(sourcelat) +
                "," +
                Double.toString(sourcelog) +
                "&destination=" +// to
                Double.toString(destlat) +
                "," +
                Double.toString(destlog) +
                "&sensor=false&mode=driving&alternatives=true" +
                "&key=AIzaSyCf2E1IuVtOO5NVVmvbuLy5wKR4IzSajgk";
    }

    public class JSONParser {

        InputStream is = null;
        JSONObject jObj = null;
        String json = "";
        // constructor
        public JSONParser() {
        }
        public String getJSONFromUrl(String url) {

            // Making HTTP request
            try {
                // defaultHttpClient
                DefaultHttpClient httpClient = new DefaultHttpClient();
                HttpPost httpPost = new HttpPost(url);

                HttpResponse httpResponse = httpClient.execute(httpPost);
                HttpEntity httpEntity = httpResponse.getEntity();
                is = httpEntity.getContent();

            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(
                        is, "iso-8859-1"), 8);
                StringBuilder sb = new StringBuilder();
                String line = null;
                while ((line = reader.readLine()) != null) {
                    sb.append(line + "\n");
                }

                json = sb.toString();
                is.close();
            } catch (Exception e) {
                Log.e("Buffer Error", "Error converting result " + e.toString());
            }
            return json;
        }
    }


    @Override
    public boolean onMarkerClick(Marker marker) {
        return false;
    }

    @Override
    public void onMapClick(LatLng latLng) {

    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }
}
