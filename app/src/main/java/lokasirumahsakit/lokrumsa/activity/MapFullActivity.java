package lokasirumahsakit.lokrumsa.activity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lokasirumahsakit.lokrumsa.DataRumahSakit;
import lokasirumahsakit.lokrumsa.LocalDB;
import lokasirumahsakit.lokrumsa.R;

public class MapFullActivity extends AppCompatActivity implements PermissionListener {
    private static final int REQUEST_GPS = 100;
    private GoogleMap googleMap;
    private List<DataRumahSakit> dataRumahSakit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_full);

        new TedPermission(this)
                .setPermissionListener(this)
                .setDeniedMessage(R.string.need_permission)
                .setPermissions(
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION)
                .check();

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //inisialisasi peta di dalam fragment
        MapView mMapView = findViewById(R.id.map);
        mMapView.onCreate(savedInstanceState);
        mMapView.onResume(); // needed to get the map to display immediately
        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap mMap) {
                googleMap = mMap;
                LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
                Criteria criteria = new Criteria();
                if (ActivityCompat.checkSelfPermission(MapFullActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MapFullActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(MapFullActivity.this,
                            new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                            REQUEST_GPS);
                    return;
                }
                Location location = locationManager.getLastKnownLocation(locationManager.getBestProvider(criteria, false));

                LocalDB localDB = new LocalDB(getApplicationContext());
                SQLiteDatabase db = localDB.getReadableDatabase();
                Cursor cursor = db.rawQuery("SELECT * FROM rumah_sakit", null);
                cursor.moveToFirst();
                if (cursor.getCount()!=0){
                    dataRumahSakit = localDB.getAllRumahSakit(cursor, location);
                    Collections.sort(dataRumahSakit, new Comparator<DataRumahSakit>() {
                        @Override
                        public int compare(DataRumahSakit dataRumahSakit, DataRumahSakit t1) {
                            return Double.compare(dataRumahSakit.getJarak(), t1.getJarak());
                        }
                    });

                    if (dataRumahSakit.size() < 5){
                        for (int a = 0; a< dataRumahSakit.size(); a++){
                            LatLng dest = new LatLng(dataRumahSakit.get(a).getLatitude(),
                                    dataRumahSakit.get(a).getLongitude());
                            MarkerOptions markdest = new MarkerOptions().position(dest)
                                    .title(dataRumahSakit.get(a).getNama())
                                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker));
                            googleMap.addMarker(markdest).setTag(dataRumahSakit.get(a).getNo());
                        }
                    } else {
                        for (int a=0; a<5; a++){
                            LatLng dest = new LatLng(dataRumahSakit.get(a).getLatitude(),
                                    dataRumahSakit.get(a).getLongitude());
                            MarkerOptions markdest = new MarkerOptions().position(dest)
                                    .title(dataRumahSakit.get(a).getNama())
                                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker));
                            googleMap.addMarker(markdest).setTag(dataRumahSakit.get(a).getNo());
                        }
                    }
                }
                cursor.close();
                db.close();
                localDB.close();

                // camera zoom letak marker nya
                googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                googleMap.setMyLocationEnabled(true);

                if (location != null){
                    googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), 13));
                    CameraPosition cameraPosition = new CameraPosition.Builder()
                            .target(new LatLng(location.getLatitude(), location.getLongitude())).zoom(12).build();
                    googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                }

                googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                    @Override
                    public void onInfoWindowClick(Marker marker) {
                        Intent intent = new Intent(MapFullActivity.this, MapRouteActivity.class);
                        if (marker.getTag()!=null)
                            intent.putExtra("no", marker.getTag().toString());
                        startActivity(intent);
                    }
                });
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case REQUEST_GPS: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    recreate();
                } else {
                    Toast.makeText(this, "Maaf anda harus memberikan izin akses GPS", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        }
    }

    @Override
    public void onPermissionGranted() {
    }

    @Override
    public void onPermissionDenied(ArrayList<String> deniedPermissions) {
        Toast.makeText(this, "Kami membutuhkan izin tersebut", Toast.LENGTH_SHORT).show();
        finish();
    }
}
