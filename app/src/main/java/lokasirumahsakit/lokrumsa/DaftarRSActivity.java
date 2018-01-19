package lokasirumahsakit.lokrumsa;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class DaftarRSActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView txtJumlahRS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_rs);

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
            cursor.moveToFirst();
            RumahSakitAdapter adapter = new RumahSakitAdapter(localDB.getAllRumahSakit(cursor, null));
            recyclerView.setAdapter(adapter);

            txtJumlahRS.setText(String.valueOf(cursor.getCount()));
            cursor.close();
        }
    }
}