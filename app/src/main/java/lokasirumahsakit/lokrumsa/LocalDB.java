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
                "url_gambar text null" +
                ");";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://1.bp.blogspot.com/-Ttzm_LQP-iI/V5l0HajrwoI/AAAAAAAAAKA/VYdRbwijbUE0xmaXMqA38xv5h2g2QzTnwCLcB/s1600/Untitled.png'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "'poliklinik gigi'," +
                "'http://pjpksintcarolus.com/wp-content/uploads/2015/11/RS-Sari-Asih-Karawaci.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://www.sariasih.com/media/library/4-rs-sangiang.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://static.konsula.com/images/practice/0001001000/0001000036/rumah-sakit-usada-insani1.800x600.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'http://3.bp.blogspot.com/-j2vU1PzhiLg/UK96G-l64yI/AAAAAAAAAxo/oBuCN9GEHK0/s1600/Rumah+Sakit+Islam+Tangerang+ASshobirin.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://lh3.googleusercontent.com/-jQUPiXeia_I/VEniKe1crQI/AAAAAAAAABQ/OOqB2jWcSkY/w530-h398-n/DSC_0590.JPG'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'http://mayapadahospital.com/assets/images/hospital/mayapada-tangerang.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'http://harianjayapos.com/foto_berita/27RSUD-Kabupaten-Tangerang.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'http://www.aluontop.co.id/web/images/mallpekantoran/PC180157.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://asset.kompas.com/data/photo/2014/03/28/180223720140328-150302780x390.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://igx.4sqi.net/img/general/600x600/ZqloJke6AbpObbh5UQq-OdH-jDNvbO4UOTQxrxSEtig.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://s3-ap-southeast-1.amazonaws.com/static.guesehat.com/directories_thumb/41395_Rumah_Sakit_Rumkit_TK._IV_Daan_Mogot.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'http://rsqadr.co.id/wp-content/uploads/2015/03/profil2.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://s3-ap-southeast-1.amazonaws.com/static.guesehat.com/directories_thumb/11609_Rumah_Sakit_Ibu_dan_Anak_Bunda_Sejati.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://www.garnesia.com/images/vendor/v4921.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://cdn.kriminologi.id/news_picture_thumb/59e0585563258-1507874901-0afd7d657f177e8a072a53b2b626c394.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'http://medx.emedis.id/wp-content/uploads/2017/11/rs_annisa_tangerang.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://static.konsula.com/images/practice/0001001000/0001000378/rumah-sakit-hermina-serpong.800x600.png'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://lh3.googleusercontent.com/AGdFCfBLQTw8DDfvRa8dxql1Gg84ReiOR7YzL-rPxVoiU33ddSG7sHUa_7RK6xDkNF4ILupMhPdeKA=w1024-h768-rw-no'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://tangselmedia.com/wp-content/uploads/2016/07/omni-hospital-alam-sutera.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://1.bp.blogspot.com/-UC30o83DLJI/V4jVSFJFMFI/AAAAAAAAHIk/n3ifPJbVGc0sYNzOU9nKBDkhVpUwlxOLgCLcB/s1600/RSIA%2BMutiara%2BBunda.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'http://cms.usp.co.id/image/project/171.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'http://www.kasih-group.com/images/slideshow/562-IMG_3478%20-%20Copy.JPG'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'http://res.cloudinary.com/dk0z4ums3/image/upload/w_656,h_431/v1499765924/hospital_image/RS-Bintaro-Hospital-%20resize.jpg.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'http://explore.summareconserpong.com/wp-content/uploads/2014/12/St.-Carolusjpg-2-823x420.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://www.infobintaro.com/wp-content/uploads/rs_imc_bintaro_info_bintaro.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "'poliklinik gigi'," +
                "'https://www.sariasih.com/media/library/2-rs-ciputat.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://hellosehat.com/wp-content/uploads/2016/06/hospital-1496805440-435x300.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'http://1.bp.blogspot.com/_mBdxq93WoyA/TS6ppVbl00I/AAAAAAAAACw/rnmWQQOO3gc/s1600/gambar+gedung+rsu+ba.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://static.konsula.com/images/practice/0001001000/0001000163/rumah-sakit-tiara-bekasi.800x600.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://static.konsula.com/images/practice/0001001000/0001000679/rumah-sakit-grha-permata-ibu.800x600.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://lh3.googleusercontent.com/OFsooDGsMimLeDdpDCCxIKBT6IA3uJIWYs-ATrJjSB534cVRXHP_PzOjNCM9qeJnJhnT31w-doGyrA=w3264-h2448-rw-no'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://s3-ap-southeast-1.amazonaws.com/static.guesehat.com/directories_thumb/100932_Rumah_Sakit_Ibu_dan_Anak_Assyifa.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'http://1.bp.blogspot.com/-Z-5qZwf-PJw/VPQdJuau2EI/AAAAAAAAAEs/-EGsqoAeE8U/s1600/P1161097.JPG'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'http://klikalamat.com/wp-content/uploads/2016/09/RS.-Karang-Tengah-Medika.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'http://4.bp.blogspot.com/_FUyYVO0jY_0/Sa9BGP-CiPI/AAAAAAAAACo/_6yHk7WN23E/w1200-h630-p-k-no-nu/slide0001_image002.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "'poliklinik gigi'," +
                "'https://s3-ap-southeast-1.amazonaws.com/static.guesehat.com/directories_thumb/168790_Rumah_Sakit_Islam_Sari_Asih_Ar-Rahmah.jpg'" +
                ")";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO rumah_sakit (nama, alamat, latitude, longitude, fasilitas1, fasilitas2, fasilitas3, fasilitas4, fasilitas5, fasilitas6, fasilitas7, fasilitas8, fasilitas9, fasilitas10, fasilitas11, fasilitas12, fasilitas13, url_gambar) VALUES (" +
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
                "null," +
                "'https://www.garnesia.com/images/vendor/v5028.jpg'" +
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
                    getStringValue(cursor, "fasilitas13"),
                    getStringValue(cursor, "url_gambar"));
            dataRumahSakits.add(data);
            cursor.moveToNext();
        }
        return dataRumahSakits;
    }
}