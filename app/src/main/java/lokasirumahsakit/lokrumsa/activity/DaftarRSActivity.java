package lokasirumahsakit.lokrumsa.activity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import lokasirumahsakit.lokrumsa.LocalDB;
import lokasirumahsakit.lokrumsa.R;
import lokasirumahsakit.lokrumsa.RumahSakitAdapter;

public class DaftarRSActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView txtJumlahRS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_rs);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        txtJumlahRS = findViewById(R.id.txt_jumlah_rs);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ambilSemuaDataRS();
    }

    private void ambilSemuaDataRS() {
        LocalDB localDB = new LocalDB(this);
        SQLiteDatabase db = localDB.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM rumah_sakit", null);
        if (cursor.getCount()!=0){
            RumahSakitAdapter adapter = new RumahSakitAdapter(localDB.getAllRumahSakit(cursor, null), this);
            recyclerView.setAdapter(adapter);

            txtJumlahRS.setText(String.valueOf(cursor.getCount()));
            cursor.close();
        }
    }
}
