package lokasirumahsakit.lokrumsa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
    }
}
