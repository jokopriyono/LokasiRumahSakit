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
                "longitude double not null);";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rumah sakit awal bros Tangerang', " +
                "'Jl.M.H. Thamrin No 3, Panunggangan utara, pinang, kota Tangerang, Banten 15117', " +
                "'-6.2148254', " +
                "'106.6282637')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rumah sakit Anak dan Bunda Sari Asih', " +
                "'Jl. Imam Bonjol No.38, Sukajadi, Karawaci, Kota Tangerang, Banten 15113', " +
                "'-6.2148208', " +
                "'106.5602341')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rumah Sakit Umum Sari Asih Sangiang', " +
                "'Jl. Moh. Toha KM. 3.5, Periuk Jaya, Periuk, Kota Tangerang, Banten 15131', " +
                "'-6.1716437', " +
                "'106.6066094')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RS. Usada Insani', " +
                "'Jl. KH. Hasyim Ashari No. 24, Cipondoh, Buaran Indah, Kec. Tangerang, Kota Tangerang, Banten 15117', " +
                "'-6.1842755', " +
                "'106.6453992')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rumah Sakit Islam Asshobirin', " +
                "'Jl. Raya Serpong No.9, RT.11/RW.8, Pd. Jagung, Serpong Utara, Kota Tangerang Selatan, Banten 15326', " +
                "'-6.25914', " +
                "'106.6493459')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rumah Sakit Mulya', " +
                "'Jalan Kyai Haji Hasyim Ashari No.18, Sudimara Pinang, Kota Tangerang, Banten 15145', " +
                "'-6.2225991', " +
                "'106.6866489')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rs Mayapada', " +
                "'Cikokol, Kec. Tangerang, Kota Tangerang, Banten 15117', " +
                "'-6.2516825', " +
                "'106.6434197 ')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RSUD Kabupaten Tangerang', " +
                "'Jalan Ahmad Yani No.9, Suka Asih, Kecamatan Tangerang, Kota Tangerang, Banten 15111', " +
                "'-6.1699497', " +
                "'106.6334878')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RS Waras', " +
                "'Jalan Raya Merdeka No.92, Pabuaran, Karawaci, Gerendeng, Karawaci, Kota Tangerang, Banten 15114', " +
                "'-6.2158417', " +
                "'106.6796001')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RSUD Kota Tangerang', " +
                "'Jalan Pulau Putri Raya, Kelapa Indah, Tangerang, Klp. Indah, Kec. Tangerang, Kota Tangerang, Banten 15117', " +
                "'-6.1852666', " +
                "'106.617781')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RB. Harapan Ibu', " +
                "'Jl. Mangga Raya No. 3, Cibodasari, Cibodas, Cibodasari, Kec. Tangerang, Kota Tangerang, Banten 15138', " +
                "'-6.2098319', " +
                "'106.6072407')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rumah Sakit Daan Mogot', " +
                "'Jalan Daan Mogot No.59, Sukarasa, Kecamatan Tangerang, Sukarasa, Kec. Tangerang, Kota Tangerang, Banten 15111', " +
                "'-6.175901', " +
                "'106.6279339')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RS Qadr', " +
                "'Jl. Qadr III, Klp. Dua, Cibodas, Kota Tangerang, Banten 15810', " +
                "'-6.226629', " +
                "'106.6147084')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rumah Sakit Ibu & Anak Bunda Sejati', " +
                "'Jalan Prabu Siliwangi No.11, Jatiuwung, Keroncong, Kota Tangerang, Banten 15134', " +
                "'-6.1898969', " +
                "'106.587144')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rumah Sakit Medika BSD', " +
                "'Jl. Letnan Soetopo Kav. Kom. IIIA No. 7, BSD City, Lengkong Wetan, Serpong, Kota Tangerang Selatan, Banten 15310', " +
                "'-6.2841915', " +
                "'106.6655434 ')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RS.Ariya Medika', " +
                "'Jalan Industri No.A/1-4, Jatake, Jatiuwung, Kota Tangerang, Banten 15136', " +
                "'-6.2011048', " +
                "'106.5705521')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RS An-Nisa Tangerang', " +
                "'Jalan Gatot Subroto No. 96, Uwung Jaya, Cibodas, Uwung Jaya, Cibodas, Kota Tangerang, Banten 15132', " +
                "'-6.1876853', " +
                "'106.6025056')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RS. Hermina Tangerang', " +
                "'Jalan Ks. Tubun No.10, Pasar Baru, Karawaci, Ps. Baru, Karawaci, Kota Tangerang, Banten 15112', " +
                "'-6.169458', " +
                "'106.6245708')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RSIA Keluarga Ibu', " +
                "'Jl. Raya Benua Indah No.58, Kel. Pabuaran Tumpeng, Kec. Karawaci, Pabuaran Tumpeng, Kec. Tangerang, Kota Tangerang, Banten 15112', " +
                "'-6.1651246', " +
                "'106.604932 ')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'OMNI Hospitals Alam Sutera', " +
                "'Jalan Alam Sutera Boulevard Kav. 25, Pakulonan, Serpong Utara, Pakulonan, Serpong Utara, Kota Tangerang Selatan, Banten 15325', " +
                "'-6.2449115', " +
                "'106.6488891 ')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RSIA Bunda Sejati ', " +
                "'Jl. Prabu Siliwangi No.3, Keroncong, Jatiuwung, Kota Tangerang, Banten 15134', " +
                "'-6.1899012', " +
                "'106.5866938')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RSIA Mutiara Bunda', " +
                "'Jl. Cipto Mangunkusumo Gg. H. Mencong No. 3, Ciledug, Sudimara Tim., Tangerang, Kota Tangerang, Banten 15151', " +
                "'-6.23019', " +
                "'106.7191767 ')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RS Sari Asih Ciledug', " +
                "'Jl. HOS Cokroaminoto No. 38, Ciledug, Sudimara Tim., Ciledug, Kota Tangerang, Banten 15151', " +
                "'-6.2281765', " +
                "'106.7164741')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RSIA Cinta Kasih', " +
                "'Jalan Ciputat Baru Raya No.10, Sawah Lama, Ciputat, Sawah Lama, Ciputat, Kota Tangerang Selatan, Banten 15413', " +
                "'-6.2990936', " +
                "'106.7375105')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RS Premier Bintaro ', " +
                "'Jl. M.H. Thamrin No. 1, Sektor 7, Bintaro Jaya, Pondok Jaya, Pondok Aren, Pd. Jaya, Pd. Aren, Tangerang, Banten 15224', " +
                "'-6.2761129', " +
                "'106.7218163')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'St. Carolus Hospital Summarecon Serpong', " +
                "'Jl. Gading Golf Boulevard Kav. 08, Gading Serpong, Cihuni, Pagedangan, Tangerang, Banten 15332', " +
                "'-6.2471031', " +
                "'106.640155')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rumah Sakit Ichsan Medical Centre Bintaro', " +
                "'Jalan Raya Jombang No.56, Bintaro, Jombang, Ciputat, Jombang, Ciputat, Kota Tangerang Selatan, Banten 15414', " +
                "'-6.2919521', " +
                "'106.703007 ')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rumah Sakit Sari Asih Ciputat', " +
                "'Jl. Sasak Tinggi No. 3, Otista Ciputat, Ciputat, Kota Tangerang Selatan, Banten 15411', " +
                "'-6.3253192', " +
                "'106.7419956')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Siloam', " +
                "'Jl. Gn. Himalaya Lippo Karawaci, Panunggangan Bar., Cibodas, Kota Tangerang, Banten 15138 ', " +
                "'-6.2202677', " +
                "'106.5526341')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RSU Bhakti Asih', " +
                "'Jalan Raden Saleh No. 10, Karang Tengah, Ciledug, Karang Tengah, Kota Tangerang, Banten 15157 ', " +
                "'-6.2212654', " +
                "'106.7034722')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RS. Tiara Tangerang', " +
                "'Jl. Beringin Raya No.5, Nusa Jaya, Karawaci, Kota Tangerang, Banten 15116', " +
                "'-6.1954908', " +
                "'106.6128764')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RS Umum Permata Ibu', " +
                "'Jalan KH. Mas Mansyur No.2, Kunciran Indah, Pinang, Kota Tangerang, Banten 15144', " +
                "'-6.2270177', " +
                "'106.6812808')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rs Dinda', " +
                "'Jl. H Aning No.40, Sangiang Jaya, Periuk, Kota Tangerang, Banten 15132 ', " +
                "'-6.1906385', " +
                "'106.5896283')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RSIA Assyifa', " +
                "'Jalan Paus Raya No. 1, Cimone, Karawaci, Karawaci Baru, Karawaci, Kota Tangerang, Banten 15116', " +
                "'-6.1991967', " +
                "'106.6123259')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'RS Ibu Dan Anak AQIDAH', " +
                "'Jl. Raden Fatah No.77, Parung Serab, Ciledug, Kota Tangerang, Banten 15153 ', " +
                "'-6.2492883', " +
                "'106.7001976')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rumah Sakit Karang Tengah Medika', " +
                "'Karang Tengah, Kota Tangerang, Banten 15157 ', " +
                "'-6.2101244', " +
                "'106.7129771')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rumah Sakit Sitanala Tangerang', " +
                "'Karang Sari, Neglasari, Kota Tangerang, Banten 15121', " +
                "'-6.1559', " +
                "'106.6357279')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rumah Sakit Islam Sari Asih Ar-Rahmah', " +
                "'Jalan Ks. Tubun No. 44, Koang Jaya, Karawaci, Koang Jaya, Kec. Tangerang, Banten, 15112', " +
                "'-6.1640123', " +
                "'106.6275611')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude) VALUES (" +
                "'Rumah Sakit Universitas Syarif Hidayatullah Ciputat', " +
                "'Jl Ir. H. Juanda No.95, Pisangan, Ciputat Timur, Kota Tangerang Selatan, Banten 15419', " +
                "'-6.3079082', " +
                "'106.7542862')";
        sqLiteDatabase.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }

    String getStringValue(Cursor cursor, String column) {
        int count=cursor.getColumnCount();
        for (int counter = 0; counter < count; counter++) {
            if (cursor.getColumnName(counter).equals(column)){
                return cursor.getString(counter);
            }
        }
        return null;
    }

    Double getDoubleValue(Cursor cursor, String column) {
        int count=cursor.getColumnCount();
        for (int counter = 0; counter < count; counter++) {
            if (cursor.getColumnName(counter).equals(column)){
                return cursor.getDouble(counter);
            }
        }
        return null;
    }

    List<DataRumahSakit> getAllRumahSakit(Cursor cursor, Location location){
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

    double hitungJarakRS(Location location, double tujuanLat, double tujuanLong) {
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
