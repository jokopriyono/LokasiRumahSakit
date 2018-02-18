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

    public LocalDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
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
                "fasilitas13 text null" +
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
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rumah sakit Anak dan Bunda Sari Asih', " +
                "'Jl. Imam Bonjol No.38, Sukajadi, Karawaci, Kota Tangerang, Banten 15113', " +
                "'-6.1792753', " +
                "'106.6260638', " +
                "'kebidanan', " +
                "'penyakit dalam', " +
                "'jantung', " +
                "'mata', " +
                "'THT', " +
                "'syaraf', " +
                "'kulit dan kelamin', " +
                "'kecantikan', " +
                "'paru', " +
                "'bedah'," +
                "'urologi'," +
                "'ortopedi'," +
                "'poliklinik gigi'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rumah Sakit Umum Sari Asih Sangiang ', " +
                "'Jl. Moh. Toha KM. 3.5, Periuk Jaya, Periuk, Kota Tangerang, Banten 15131', " +
                "'-6.1700969', " +
                "'106.6009451', " +
                "'poliklinik dokter umum', " +
                "'poliklinik gigi', " +
                "'ICU', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RS. Usada Insani', " +
                "'Jl. KH. Hasyim Ashari No. 24, Cipondoh, Buaran Indah, Kec. Tangerang, Kota Tangerang, Banten 15117', " +
                "'-6.1841928', " +
                "'106.6476389', " +
                "'IGD', " +
                "'poliklinik', " +
                "'pelayanan tindakan medis / bedah', " +
                "'MCU', " +
                "'Rehabilitas Medik', " +
                "'Konsultan Imunologi & alergi', " +
                "'Konsultan Ginjal Hipertensi', " +
                "'Konsultan Bedah Tulang Belakang', " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rumah Sakit Islam Asshobirin', " +
                "'Jl. Raya Serpong No.9, RT.11/RW.8, Pd. Jagung, Serpong Utara, Kota Tangerang Selatan, Banten 15326', " +
                "'-6.259128', " +
                "'106.6514394', " +
                "'poliklinik dokter spesialis', " +
                "'rawat inap', " +
                "'UGD', " +
                "'ICU', " +
                "'Laboraturium', " +
                "'Radiologi', " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rumah Sakit Mulya', " +
                "'Jalan Kyai Haji Hasyim Ashari No.18, Sudimara Pinang, Kota Tangerang, Banten 15145', " +
                "'-6.2225838', " +
                "'106.6887283', " +
                "'UGD', " +
                "'poliklinik dokter gigi', " +
                "'poliklinik dokter spesialis', " +
                "'klinik estetika', " +
                "'rawat inap', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rs Mayapada', " +
                "'Jl. Honoris Raya Kav. 6, Klp. Indah, Kec. Tangerang, Kota Tangerang, Banten 15117', " +
                "'-6.2049897', " +
                "'106.6413858', " +
                "'ICU', " +
                "'HCU', " +
                "'unit stroke', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RSUD Kabupaten Tangerang', " +
                "'Jalan Ahmad Yani No.9, Suka Asih, Kecamatan Tangerang, Sukaasih, Kecamatan Tangerang, Sukaasih, Kec. Tangerang, Kota Tangerang, Banten 15111', " +
                "'-6.169893', " +
                "'106.6356772', " +
                "'Rawat jalan', " +
                "'rawat inap', " +
                "'unit penunjang', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RS Melati', " +
                "'Jalan Raya Merdeka No.92, Pabuaran, Karawaci, Gerendeng, Karawaci, Kota Tangerang, Banten 15114', " +
                "'-6.1776312', " +
                "'106.625333', " +
                "'poliklinik', " +
                "'laboratorium', " +
                "'radiologi', " +
                "'ICU', " +
                "'IGD', " +
                "'perinatologi', " +
                "'USG', " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RSUD Kota Tangerang', " +
                "'Jl. Gg. kuncung No.2, Klp. Indah, Kec. Tangerang, Kota Tangerang, Banten 15117', " +
                "'-6.2023152', " +
                "'106.6333715', " +
                "'IGD', " +
                "'UGD', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RB. Harapan Ibu', " +
                "'Jl. Mangga Raya No. 3, Cibodasari, Cibodas, Kota Tangerang, Banten 15138', " +
                "'-6.2098885', " +
                "'106.6093159', " +
                "'spesialis kandungan', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rumah Sakit Daan Mogot', " +
                "'Jalan Daan Mogot No.59, Sukarasa, Kecamatan Tangerang, Kota Tangerang, Banten 15111', " +
                "'-6.172131', " +
                "'106.6313076', " +
                "'Rawat jalan', " +
                "'rawat inap', " +
                "'unit penunjang', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rs Qadr', " +
                "'Jl. Qadr III, Klp. Dua, Cibodas, Kota Tangerang, Banten 15810', " +
                "'-6.2265917', " +
                "'106.6168562', " +
                "'Spesialis Penyakit Dalam (Internist)', " +
                "'Spesialis Jantung (Cardiology)', " +
                "'Spesialis Kesehatan Anak (Pediatrics)', " +
                "'Spesialis Kebidanan & Kandungan (Obstetrics & Gynecology)', " +
                "'Spesialis THT (Ear, Nose & Throat)', " +
                "'Spesialis Mata (Opthalmologist)', " +
                "'Dokter Gigi (Dentist)', " +
                "'Spesialis Paru (Pulmonology)', " +
                "'Spesialis Kulit & Kelamin (Dermatology & Veneorology)', " +
                "'Spesialis Psikiatri (Physiciatry)'," +
                "'Spesialis Rehabilitasi Medik'," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rumah Sakit Ibu & Anak Bunda Sejati', " +
                "'Jalan Prabu Siliwangi No.11, Jatiuwung, Keroncong, Kota Tangerang, Banten 15134', " +
                "'-6.1899012', " +
                "'106.5887511', " +
                "'poliklinik', " +
                "'poli gigi', " +
                "'spesialis anak', " +
                "'spesialis penyakit dalam', " +
                "'spesialis bedah', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rumah Sakit Medika BSD', " +
                "'JL. Letnan Soetopo, No. 7, BSD Serpong, Kavling Komplek 3A, Lengkong Wetan, Tangerang, Kota Tangerang Selatan, Banten 15310', " +
                "'-6.2842202', " +
                "'106.6675813', " +
                "'MCU', " +
                "'poli mata', " +
                "'poli gigi', " +
                "'UGD', " +
                "'Fisioterapi', " +
                "'cathlab', " +
                "'cardiac center', " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RS.Ariya Medika', " +
                "'Jalan Industri No.A/1-4, Jatake, Jatiuwung, Jatake, Jatiuwung, Kota Tangerang, Banten 15136', " +
                "'-6.2011041', " +
                "'106.5727241', " +
                "'poli anak', " +
                "'spesialis kandungan', " +
                "'bedah saraf', " +
                "'paru', " +
                "'saraf', " +
                "'gigi', " +
                "'radiologi', " +
                "'THT', " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RS An-Nisa Tangerang', " +
                "'Jalan Gatot Subroto No. 96, Uwung Jaya, Cibodas, Uwung Jaya, Cibodas, Kota Tangerang, Banten 15132', " +
                "'-6.1873827', " +
                "'106.6044415', " +
                "'klinik rawat jalan', " +
                "'IGD 24 jam', " +
                "'ICU 24 ', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RS. Hermina Tangerang', " +
                "'Jalan Ks. Tubun No.10, Pasar Baru, Karawaci, Kota Tangerang, Banten 15112', " +
                "'-6.169458', " +
                "'106.6266281', " +
                "'penyakit kandungan', " +
                "'kesehatan anak', " +
                "'penyakit dalam', " +
                "'bedah', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RSIA Keluarga Ibu', " +
                "'Jl. Raya Benua Indah No.58, Pabuaran Tumpeng, Tangerang, Pabuaran Tumpeng, Karawaci, Kota Tangerang, Banten 15112', " +
                "'-6.1700182', " +
                "'106.6136824', " +
                "'rawat inap', " +
                "'rawat jalan', " +
                "'unit penunjang', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'OMNI Hospitals Alam Sutera', " +
                "'Jalan Alam Sutera Boulevard Kav. 25, Pakulonan, Serpong Utara, Pakulonan, Serpong Utara, Kota Tangerang Selatan, Banten 15325', " +
                "'-6.2449115', " +
                "'106.6509465', " +
                "'cardiology', " +
                "'neuroscience', " +
                "'oncology center', " +
                "'orthopedic', " +
                "'urology', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RSIA Mutiara Bunda', " +
                "'Jl. Cipto Mangunkusumo Gg. H. Mencong No. 3, Ciledug, Sudimara Tim., Tangerang, Kota Tangerang, Banten 15151', " +
                "'-6.2301327', " +
                "'106.7211797', " +
                "'poliklinik', " +
                "'IGD 24 jam', " +
                "'ruang operasi', " +
                "'rawat inap', " +
                "'USG dan EKG', " +
                "'laboratorium, instalasi farmasi', " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RS Sari Asih Ciledug', " +
                "'Jl. HOS Cokroaminoto No. 38, Ciledug, Sudimara Timur, Ciledug, Sudimara Tim., Ciledug, Kota Tangerang, Banten 15151', " +
                "'-6.229975', " +
                "'106.7135753', " +
                "'poliklinik dokter umum', " +
                "'poliklinik gigi', " +
                "'dokter spesialis', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RSIA Cinta Kasih', " +
                "'Jalan Ciputat Baru Raya No.10, Sawah Lama, Ciputat, Sawah Lama, Ciputat, Kota Tangerang Selatan, Banten 15413', " +
                "'-6.2990936', " +
                "'106.7395678', " +
                "'poli penyakit dalam', " +
                "'poli gigi', " +
                "'poli umum', " +
                "'poli obgyn', " +
                "'poli anak', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RS Premier Bintaro', " +
                "'Jl. M.H. Thamrin No. 1, Sektor 7, Bintaro Jaya, Pondok Jaya, Pondok Aren, Tangerang, Banten 15224', " +
                "'-6.2761129', " +
                "'106.7238736', " +
                "'MCU', " +
                "'spesialis bedah', " +
                "'spesialis anak', " +
                "'penyakit dalam', " +
                "'kesehatan anak', " +
                "'poli klinik', " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'St. Carolus Hospital Summarecon Serpong', " +
                "'Jl. Gading Golf Boulevard Kav. 08, Gading Serpong, Cihuni, Pagedangan, Tangerang, Banten 15332', " +
                "'-6.2471031', " +
                "'106.6422123', " +
                "'IGD', " +
                "'MCU', " +
                "'rehabilitasi medik', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rumah Sakit Ichsan Medical Centre Bintaro', " +
                "'Jalan Raya Jombang No.56, Bintaro, Jombang, Ciputat, Jombang, Ciputat, Kota Tangerang Selatan, Banten 15414', " +
                "'-6.2919521', " +
                "'106.7050643', " +
                "'UGD', " +
                "'poliklinik', " +
                "'rawat inap', " +
                "'MCU', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rumah Sakit Sari Asih Ciputat', " +
                "'Jl. Sasak Tinggi No. 3, Otista Ciputat, Ciputat, Kota Tangerang Selatan, Banten 15411', " +
                "'-6.3253192', " +
                "'106.7440529', " +
                "'kebidanan', " +
                "'penyakit dalam', " +
                "'jantung', " +
                "'mata', " +
                "'THT', " +
                "'syaraf', " +
                "'kulit dan kelamin', " +
                "'kecantikan', " +
                "'paru', " +
                "'bedah'," +
                "'urologi'," +
                "'ortopedi'," +
                "'poliklinik gigi'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Siloam', " +
                "'Jl. Gn. Himalaya Lippo Karawaci, Panunggangan Bar., Cibodas, Kota Tangerang, Banten 15138', " +
                "'-6.2201426', " +
                "'106.6225012', " +
                "'unit gawat darurat', " +
                "'ICU', " +
                "'ruang rawat inap', " +
                "'fasilitas kedokteran', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RSU Bhakti Asih', " +
                "'Jalan Raden Saleh No. 10, Karang Tengah, Ciledug, Karang Tengah, Kota Tangerang, Banten 15157', " +
                "'-6.2212654', " +
                "'106.7034722', " +
                "'rawat inap', " +
                "'rawat jalan', " +
                "'rawat khusus', " +
                "'MCU', " +
                "'penunjang medis', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RS. Tiara Tangerang', " +
                "'Jl. Beringin Raya No.5, Nusa Jaya, Karawaci, Kota Tangerang, Banten 15116', " +
                "'-6.1954908', " +
                "'106.6149337', " +
                "'UGD', " +
                "'ruang bersalin', " +
                "'radiologi', " +
                "'fisioterapi', " +
                "'ICU', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RS Umum Permata Ibu', " +
                "'Jalan KH. Mas Mansyur No.2, Kunciran Indah, Pinang, Kota Tangerang, Banten 15144', " +
                "'-6.2281659', " +
                "'106.6788923', " +
                "'radiologi', " +
                "'spesialis bedah', " +
                "'penyakit dalam', " +
                "'poli gigi', " +
                "'poliklinik umum', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rs Dinda', " +
                "'Jalan Gatot Subroto KM. 5, Jatiuwung, Cibodas, Jatiuwung, Cibodas, Tangerang, Banten 15137', " +
                "'-6.1919989', " +
                "'106.5914892', " +
                "'penunjang medis', " +
                "'rawat inap', " +
                "'rawat jalan', " +
                "'UGD', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RSIA Assyifa', " +
                "'Jalan Paus Raya No. 1, Cimone, Karawaci, Karawaci Baru, Karawaci, Kota Tangerang, Banten 15116', " +
                "'-6.1991967', " +
                "'106.6123259', " +
                "'ruang bersalin', " +
                "'perinatologi', " +
                "'rawat inap', " +
                "'ruang operasi', " +
                "'ICU', " +
                "'IGD', " +
                "'rawat jalan', " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'RS Ibu Dan Anak AQIDAH', " +
                "'Jalan Raden Fatah No.40, Parung Serab, Ciledug, Parung Serab, Ciledug, Kota Tangerang, Banten 15153', " +
                "'-6.2492883', " +
                "'106.7022549', " +
                "'IGD', " +
                "'radiologi', " +
                "'MCU', " +
                "'fisioterapi', " +
                "'ICU', " +
                "'poliklinik gigi', " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rumah Sakit Karang Tengah Medika', " +
                "'Karang Tengah, Kota Tangerang, Banten 15157', " +
                "'-6.2101111', " +
                "'106.7150344', " +
                "'andrologi', " +
                "'spesialis bedah', " +
                "'poli gigi', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rumah Sakit Sitanala Tangerang', " +
                "'Jalan Dr. Sitanala No. 99, Karang Sari, Neglasari, Karang Sari, Neglasari, Kota Tangerang, Banten 15121', " +
                "'-6.1621749', " +
                "'106.6343724', " +
                "'pelayanan gawat darurat', " +
                "'pelayanan rawat inap', " +
                "'pelayanan kamar operasi serta pelayanan intensive care unit (ICU)', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null," +
                "null," +
                "null," +
                "null" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rumah Sakit Islam Sari Asih Ar-Rahmah', " +
                "'Jalan Ks. Tubun No. 44, Koang Jaya, Karawaci, Koang Jaya, Kec. Tangerang, Banten, 15112', " +
                "'-6.1640123', " +
                "'106.6275665', " +
                "'kebidanan', " +
                "'penyakit dalam', " +
                "'jantung', " +
                "'mata', " +
                "'THT', " +
                "'syaraf', " +
                "'kulit dan kelamin', " +
                "'kecantikan', " +
                "'paru', " +
                "'bedah'," +
                "'urologi'," +
                "'ortopedi'," +
                "'poliklinik gigi'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13) VALUES (" +
                "'Rumah Sakit Syarif Hidayatullah Ciputat', " +
                "'Jl Ir. H. Juanda No.95, Pisangan, Ciputat Timur, Kota Tangerang Selatan, Banten 15419', " +
                "'-6.3079082', " +
                "'106.7563435', " +
                "'Rawat jalan', " +
                "'rawat inap', " +
                "'unit penunjang', " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
                "null, " +
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
        cursor.moveToFirst();
        List<DataRumahSakit> dataRumahSakits = new ArrayList<>();
        for (int counter = 0; counter < cursor.getCount(); counter++) {
            Double jarakMeter;
            if (location!=null) {
                Location lokasiRS = new Location("lokasiRS" + counter);
                lokasiRS.setLatitude(getDoubleValue(cursor, "latitude"));
                lokasiRS.setLongitude(getDoubleValue(cursor, "longitude"));
                Float jarakFloat= location.distanceTo(lokasiRS);
                jarakMeter = jarakFloat.doubleValue();
            } else {
                jarakMeter = null;
            }

            DataRumahSakit data = new DataRumahSakit(getStringValue(cursor, "no"),
                    getStringValue(cursor, "nama"),
                    getStringValue(cursor, "alamat"),
                    getDoubleValue(cursor, "latitude"),
                    getDoubleValue(cursor, "longitude"),
                    jarakMeter,
                    getStringValue(cursor, "fasilitas1"),
                    getStringValue(cursor, "fasilitas2"),
                    getStringValue(cursor, "fasilitas3"),
                    getStringValue(cursor, "fasilitas4"),
                    getStringValue(cursor, "fasilitas5"),
                    getStringValue(cursor, "fasilitas6"),
                    getStringValue(cursor, "fasilitas7"),
                    getStringValue(cursor, "fasilitas8"),
                    getStringValue(cursor, "fasilitas9"),
                    getStringValue(cursor, "fasilitas10"),
                    getStringValue(cursor, "fasilitas11"),
                    getStringValue(cursor, "fasilitas12"),
                    getStringValue(cursor, "fasilitas13"));
            dataRumahSakits.add(data);
            cursor.moveToNext();
        }
        return dataRumahSakits;
    }
}
