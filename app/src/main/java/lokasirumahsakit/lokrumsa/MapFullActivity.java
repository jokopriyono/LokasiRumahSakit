package lokasirumahsakit.lokrumsa;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapFullActivity extends AppCompatActivity implements GoogleMap.OnMarkerClickListener, GoogleMap.OnMapClickListener {
    private MapView mMapView;
    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_full);


        //inisialisasi peta di dalam fragment
        mMapView = findViewById(R.id.map);
        mMapView.onCreate(savedInstanceState);
        mMapView.onResume(); // needed to get the map to display immediately
        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap mMap) {
                googleMap = mMap;
                LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
                Criteria criteria = new Criteria();
                if (ActivityCompat.checkSelfPermission(MapFullActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MapFullActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                Location location = locationManager.getLastKnownLocation(locationManager.getBestProvider(criteria, false));

                LatLng dest = new LatLng(-6.2148254,106.6282637);
                MarkerOptions markdest = new MarkerOptions().position(dest).title("Rumah Sakit Awal Bros Tangerang");
                googleMap.addMarker(markdest);

                dest = new LatLng(-6.2148208,106.5602341);
                markdest = new MarkerOptions().position(dest).title("Rumah Sakit Anak dan Bunda Sari Asih");
                googleMap.addMarker(markdest);

                dest = new LatLng(-6.1716437,106.6066094);
                markdest = new MarkerOptions().position(dest).title("Rumah Sakit Umum Sari Asih Sangiang");
                googleMap.addMarker(markdest);

                dest = new LatLng(-6.1842755,106.6453992);
                markdest = new MarkerOptions().position(dest).title("Rumah Sakit Usada Insani");
                googleMap.addMarker(markdest);

                dest = new LatLng(-6.25914,106.6493459);
                markdest = new MarkerOptions().position(dest).title("Rumah Sakit Islam As Shobirin");
                googleMap.addMarker(markdest);

                // camera zoom letak marker nya
                googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                googleMap.setMyLocationEnabled(true);
                googleMap.setOnMarkerClickListener(MapFullActivity.this);
                googleMap.setOnMapClickListener(MapFullActivity.this);

                if (location != null){
                    googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), 13));
                    CameraPosition cameraPosition = new CameraPosition.Builder()
                            .target(new LatLng(location.getLatitude(), location.getLongitude())).zoom(12).build();
                    googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                }

                googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                    @Override
                    public void onInfoWindowClick(Marker marker) {
                        startActivity(new Intent(MapFullActivity.this, MapRouteActivity.class));
                    }
                });
            }
        });
    }

    @Override
    public void onMapClick(LatLng latLng) {

    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        return false;
    }


}
