package lokasirumahsakit.lokrumsa;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class LocalDB extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "LocalDB.db";
    private static final int DATABASE_VERSION = 1;
    private Context context;

    public LocalDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table rumah_sakit(" +
                "no integer primary key autoincrement, " +
                "nama text not null, " +
                "alamat text not null, " +
                "latitude double not null, " +
                "longitude double not null, " +
                "fasilitas1 text null, " +
                "fasilitas2 text null, " +
                "fasilitas3 text null, " +
                "fasilitas4 text null, " +
                "fasilitas5 text null, " +
                "fasilitas6 text null, " +
                "fasilitas7 text null, " +
                "fasilitas8 text null, " +
                "fasilitas9 text null, " +
                "fasilitas10 text null, " +
                "fasilitas11 text null, " +
                "fasilitas12 text null, " +
                "fasilitas13 text null, " +
                ");";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rumah sakit awal bros Tangerang', " +
                "'Jl.M.H. Thamrin No 3, Panunggangan utara, pinang, kota Tangerang, Banten 15117', " +
                "'-6.2148254', " +
                "'106.6282637', " +
                "'ESWL', " +
                "'Jantung & Pembuluh darah', " +
                "'Operasi Ortopedi', " +
                "'Onkologi', " +
                "'Hemodialisis', " +
                "'Bagian Kulit & Estestika', " +
                "'Pusat Ilmu Syaraf', " +
                "'Minimal Infasif', " +
                "'Pusat Wanita & Anak', " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }

    public String getStringValue(Cursor cursor, String column) {
        int count=cursor.getColumnCount();
        for (int counter = 0; counter < count; counter++) {
            if (cursor.getColumnName(counter).equals(column)){
                return cursor.getString(counter);
            }
        }
        return null;
    }

    public Double getDoubleValue(Cursor cursor, String column) {
        int count=cursor.getColumnCount();
        for (int counter = 0; counter < count; counter++) {
            if (cursor.getColumnName(counter).equals(column)){
                return cursor.getDouble(counter);
            }
        }
        return null;
    }

    public List<DataRumahSakit> getAllRumahSakit(Cursor cursor, Location location){
        List<DataRumahSakit> dataRumahSakits = new ArrayList<>();
        for (int counter = 0; counter < cursor.getCount(); counter++) {
            DataRumahSakit data = new DataRumahSakit(getStringValue(cursor, "no"),
                    getStringValue(cursor, "nama"),
                    getStringValue(cursor, "alamat"),
                    getDoubleValue(cursor, "latitude"),
                    getDoubleValue(cursor, "longitude"),
                    hitungJarakRS(location, getDoubleValue(cursor, "latitude"), getDoubleValue(cursor, "longitude")));
            dataRumahSakits.add(data);
            cursor.moveToNext();
        }
        return dataRumahSakits;
    }

    public double hitungJarakRS(Location location, double tujuanLat, double tujuanLong) {
        if (location==null)
            return 0.0;
        double earthRadius = 3958.75;
        double dLat = Math.toRadians(tujuanLat-location.getLatitude());
        double dLng = Math.toRadians(tujuanLong-location.getLongitude());
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) + Math.cos(Math.toRadians(location.getLatitude())) * Math.cos(Math.toRadians(tujuanLat)) * Math.sin(dLng/2) * Math.sin(dLng/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double dist = earthRadius * c;
        int meterConversion = 1609;
        return Double.valueOf(dist * meterConversion).floatValue();
    }
}
