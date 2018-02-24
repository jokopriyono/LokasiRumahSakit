package lokasirumahsakit.lokrumsa.activity;

import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.ArrayList;

import lokasirumahsakit.lokrumsa.R;

public class MainActivity extends AppCompatActivity implements PermissionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCariLokasi = findViewById(R.id.btn_cari_rumah_sakit);
        btnCariLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MapFullActivity.class));
            }
        });
        TextView txtDaftarRS = findViewById(R.id.txt_daftar_rs);
        txtDaftarRS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DaftarRSActivity.class));
            }
        });
        TextView txtTentangApp = findViewById(R.id.txt_tentang_app);
        txtTentangApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TentangActivity.class));
            }
        });

        new TedPermission(this)
                .setPermissionListener(this)
                .setDeniedMessage(R.string.need_permission)
                .setPermissions(
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION)
                .check();
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
