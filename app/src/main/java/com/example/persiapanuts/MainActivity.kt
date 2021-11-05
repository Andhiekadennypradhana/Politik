package com.example.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.logo_demokrat,"Mayor Inf. (Purn.) H. Agus Harimurti Yudhoyono, M.Sc., M.P.A., M.A. ","Partai Demokrat"," Partai ini didirikan pada 9 September 2001 dan disahkan pada 27 Agustus 2003. Pendirian partai ini erat kaitannya dengan niat untuk membawa Susilo Bambang Yudhoyono, yang kala itu menjadi Menteri Koordinator bidang Politik dan Keamanan di bawah Presiden Megawati, menjadi presiden. Karena hal inilah, Partai Demokrat terkait kuat dengan figur Yudhoyono.\n" +
                "\n" +
                "Pada Kongres IV Partai Demokrat yang diadakan di Hotel Shangri-La, Surabaya, 12 Mei 2015, Susilo Bambang Yudhoyono kembali terpilih menjadi Ketua Umum untuk periode 2015–2020. " +
                "Pada Kongres Luar Biasa Partai Demokrat yang diadakan di Bali tanggal 30 Maret 2013, Susilo Bambang Yudhoyono ditetapkan sebagai ketua umum Partai Demokrat, menggantikan Anas Urbaningrum.[6] Susilo Bambang Yudhoyono juga memilih Syarief Hasan sebagai Ketua Harian DPP Demokrat. Syarief Hasan di Kabinet Indonesia Bersatu II juga menjabat sebagai Menteri Koperasi dan UKM.[7] Sementara, Marzuki Alie ditunjuk sebagai Wakil Ketua Majelis Tinggi yang sebelumnya dijabat Anas Urbaningrum. Adapun Ketua Harian Dewan Pembina dijabat oleh E.E. Mangindaan (Menteri Perhubungan)."))

        data?.add(DataModel(R.drawable.logo_gerinda,"Letnan Jenderal TNI (Purn.) H. Prabowo Subianto Djojohadikusumo","Partai Gerinda", "Partai Gerakan Indonesia Raya (Gerindra) adalah partai politik di Indonesia. Dibentuk pada tahun 2008, Gerindra berfungsi sebagai kendaraan politik mantan jenderal Prabowo Subianto. Saat ini partai terbesar ketiga di DPR, di mana ia memiliki 78 kursi. Gerindra telah memposisikan dirinya sebagai partai oposisi, tetapi pada 2019 ia bergabung dengan Kabinet Indonesia Maju Presiden Joko Widodo, meskipun Prabowo telah mencalonkan diri melawan Widodo dalam pemilihan presiden Indonesia 2014 dan 2019. " +
                "Berdasarkan dokumen Manifesto Partai Gerindra,jati diri Partai Gerindra adalah:\n" +
                "\n" +
                "Kebangsaan = Partai Gerindra adalah partai yang berwawasan kebangsaan yang berpegang teguh pada karakter nasionalisme yang kuat, tangguh, dan mandiri. Wawasan kebangsaan ini menjadi jiwa dalam mewujudkan segala aspek kehidupan bernegara yang sejahtera, jaya dan sentosa .\n" +
                "\n" +
                "Kerakyatan = Partai Gerindra adalah partai yang dibentuk dari, oleh, dan untuk rakyat sebagai pemilik kedaulatan yang sah atas Republik Indonesia. Keberpihakan pada kepentingan rakyat merupakan sebuah keniscayaan dalam arti semua pihak yakin untuk mewujudkan secara optimal hak-hak seluruh rakyat dalam segala aspek kehidupannya utamanya di bidang kehidupan politiknya terlebih lagi kehidupan kegiatan ekonominya.\n" +
                "\n" +
                "Religius = Partai Gerindra adalah partai yang memegang teguh nilai‐nilai Ketuhanan Yang Maha Esa dengan kebebasan menjalankan agama dan kepercayaan masing‐ masing. Nilai‐nilai religius senantiasa menjadi landasan bagi setiap jajaran pengurus, anggota, dan kader Partai Gerindra dalam bersikap dan bertindak.\n" +
                "\n" +
                "Keadilan Sosial = Partai Gerindra adalah partai yang mencita‐citakan suatu tatanan masyarakat yang berkeadilan sosial, yakni masyarakat yang adil secara ekonomi, politik, hukum, pendidikan, dan kesetaraan gender. Keadilan sosial harus didasari atas persamaan hak, pemerataan, dan penghargaan terhadap hak asasi manusia."))

        data?.add(DataModel(R.drawable.logo_pan,"Dr. (H.C.) H. Zulkifli Hasan, S.E., M.M.","Partai PAN", "Kelahiran Partai Amanat Nasional (PAN) dibidani oleh Majelis Amanat Rakyat (MARA), salah satu organ gerakan reformasi pada era pemerintahan Soeharto, PPSK Muhammadiyah, dan Kelompok Tebet.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"PAN dideklarasasikan di Jakarta pada 23 Agustus 1998 oleh 50 tokoh nasional, di antaranya mantan Ketua umum Muhammadiyah Prof. Dr. H. Amien Rais, , Goenawan Mohammad, Abdillah Toha, Dr. Rizal Ramli, Dr. Albert Hasibuan, Toeti Heraty, Prof. Dr. Emil Salim, Drs. Faisal Basri, M.A., A.M. Fatwa, Zoemrotin, Alvin Lie Ling Piao, dan lainnya.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Sebelumnya pada pertemuan tanggal 5–6 Agustus 1998 di Bogor, mereka sepakat membentuk Partai Amanat Bangsa (PAB) yang kemudian berubah nama menjadi Partai Amanat Nasional (PAN).\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"PAN bertujuan menjunjung tinggi dan menegakkan kedaulatan rakyat, keadilan, kemajuan material, dan spiritual. Cita-cita partai berakar pada moral agama, kemanusiaan, dan kemajemukan. Selebihnya PAN menganut prinsip non-sektarian dan non-diskriminatif. Untuk terwujudnya Indonesia Baru, PAN pernah melontarkan gagasan wacana dialog bentuk negara federasi sebagai jawaban atas ancaman disintegrasi. Titik sentral dialog adalah keadilan dalam mengelola sumber daya sehingga rakyat seluruh Indonesia dapat benar-benar merasakan sebagai warga bangsa.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Pada Pemilu 2004, PAN mencalonkan pasangan Amien Rais dan Siswono Yudo Husodo sebagai calon presiden dan wakil presiden untuk dipilih secara langsung. Pasangan ini meraih hampir 15% suara nasional.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Pada 11 Desember 2011 Partai Amanat Nasional (PAN) dalam Rapat Kerja Nasional PAN 2011 di Jakarta secara resmi mendukung Ketua Umum PAN Hatta Rajasa sebagai bakal calon presiden dalam Pemilu 2014."))

        data?.add(DataModel(R.drawable.logo_nasdem,"Surya Dharma Paloh","Partai Nasdem", "Partai NasDem adalah sebuah partai politik di Indonesia yang diresmikan di Hotel Mercure Ancol, Jakarta Utara pada tanggal 26 Juli 2011. Partai ini didukung oleh Surya Paloh yang merupakan pendiri organisasi bernama sama yaitu Nasional Demokrat.\n" +
                "\n" +
                "Pada Januari 2013, KPU menetapkan 10 partai politik yang lolos tahapan verifikasi administrasi dan faktual, dan menjadikan Partai NasDem sebagai satu-satunya partai baru yang lolos sebagai peserta Pemilu 2014. Pada bulan yang sama, partai ini diramaikan oleh isu terjadinya konflik di tataran para elit partai. Ketua Majelis Tinggi Partai Nasional Demokrat," +
                " Surya Paloh, kabarnya akan dicalonkan sebagai Ketua Umum Partai NasDem pada Kongres Partai NasDem yang akan diadakan pada 25 Januari 2013 di Jakarta. Pada bulan tersebut juga terjadi aksi pemecatan terhadap Sekjen DPW DKI Garda Pemuda Nasdem, Saiful Haq, sekaligus pembekuan kepengurusan DPW tersebut. Pada kongres perdana partai ini, yang diadakan pada Januari 2013, " +
                "seluruh peserta kongres Partai NasDem yang berasal dari seluruh Indonesia secara aklamasi sepakat mengangkat Surya Paloh sebagai Ketua Umum Partai NasDem yang baru, menggantikan Patrice Rio Capella. " ))

        data?.add(DataModel(R.drawable.logo_golkar,"Dr. (H.C.) Ir. Airlangga Hartarto, M.B.A., M.M.T.","Partai Golkar", " Partai Golongan Karya (Golkar) adalah sebuah partai politik di Indonesia. Didirikan sebagai Sekber Golkar (Sekretariat Bersama Golongan Karya, Sekretariat Gabungan Golongan Karya) pada tahun 1964, dan berpartisipasi untuk pertama kalinya dalam pemilihan nasional pada 1971 sebagai Golkar (Golongan Karya). Golkar tidak resmi menjadi partai politik sampai tahun 1999, ketika itu diperlukan untuk menjadi sebuah partai untuk kontes pemilihan.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Golkar adalah kelompok politik yang berkuasa dari tahun 1971 hingga 1999, di bawah kepemimpinan Presiden Soeharto dan B.J. Habibie. Kemudian bergabung dengan koalisi yang berkuasa di bawah presiden Abdurrahman Wahid, Megawati Soekarnoputri, dan Susilo Bambang Yudhoyono. Ketika Presiden Joko Widodo dari PDI-P terpilih pada tahun 2014, Golkar awalnya memilih untuk bergabung dengan koalisi oposisi yang dipimpin oleh mantan jenderal Prabowo Subianto, yang pada akhirnya kembali mengalihkan kesetiaannya kepada Pemerintahan Joko Widodo pada tahun 2016. \" +\n" +
                "                \"Pada tahun 1964 untuk menghadapi kekuatan PKI (dan Bung Karno), golongan militer, khususnya perwira Angkatan Darat ( seperti Letkol Suhardiman dari SOKSI) menghimpun berpuluh-puluh organisasi pemuda, wanita, sarjana, buruh, tani, dan nelayan dalam Sekretariat Bersama Golongan Karya (Sekber Golkar).\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Sekber Golkar didirikan pada tanggal 20 Oktober 1964. Sekber Golkar ini lahir karena rongrongan dari PKI beserta ormasnya dalam kehidupan politik baik di dalam maupun di luar Front Nasional yang makin meningkat. Sekber Golkar ini merupakan wadah dari golongan fungsional/golongan karya murni yang tidak berada di bawah pengaruh politik tertentu. Jumlah anggota Sekber Golkar ini bertambah dengan pesat, karena golongan fungsional lain yang menjadi anggota Sekber Golkar dalam Front Nasional menyadari bahwa perjuangan dari organisasi fungsional Sekber Golkar adalah untuk menegakkan Pancasila dan UUD 1945. Semula anggotanya berjumlah 61 organisasi yang kemudian berkembang hingga mencapai 291 organisasi.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Dengan adanya pengakuan tentang kehadiran dan legalitas golongan fungsional di MPRS dan Front Nasional maka atas dorongan TNI dibentuklah Sekretariat Bersama Golongan Karya, disingkat Sekber Golkar, pada tanggal 20 Oktober 1964. Terpilih sebagai Ketua Pertama, Brigadir Jenderal (Brigjen) Djuhartono sebelum digantikan Mayor Jenderal (Mayjen) Suprapto Sukowati lewat Musyawarah Kerja Nasional (Mukernas) I, Desember 1965.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Pada awal pertumbuhannya, Sekber Golkar beranggotakan 61 organisasi fungsional yang kemudian berkembang menjadi 291 organisasi fungsional. Ini terjadi karena adanya kesamaan visi di antara masing-masing anggota. Organisasi-organisasi yang terhimpun ke dalam Sekber Golkar ini kemudian dikelompokkan berdasarkan kekaryaannya ke dalam 7 (tujuh) Kelompok Induk Organisasi (KINO), yaitu:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Koperasi Serbaguna Gotong Royong (KOSGORO)\\n\" +\n" +
                "                \"Sentral Organisasi Karyawan Swadiri Indonesia (SOKSI)\\n\" +\n" +
                "                \"Musyawarah Kekeluargaan Gotong Royong (MKGR)\\n\" +\n" +
                "                \"Organisasi Profesi\\n\" +\n" +
                "                \"Ormas Pertahanan Keamanan (HANKAM)\\n\" +\n" +
                "                \"Gerakan Karya Rakyat Indonesia (GAKARI)\\n\" +\n" +
                "                \"Gerakan Pembangunan\\n\" +\n" +
                "                \"Untuk menghadapi Pemilu 1971, 7 KINO yang merupakan kekuatan inti dari Sekber Golkar tersebut, mengeluarkan keputusan bersama pada tanggal 4 Februari 1970 untuk ikut menjadi peserta Pemilu melalui satu nama dan tanda gambar yaitu Golongan Karya (Golkar). Logo dan nama ini, sejak Pemilu 1971, tetap dipertahankan sampai sekarang.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Pada Pemilu 1971 ini, Sekber Golkar ikut serta menjadi salah satu konsestan. Pihak parpol memandang remeh keikutsertaan Golkar sebagai kontestan Pemilu. Mereka meragukan kemampuan komunikasi politik Golkar kepada grassroot level. NU, PNI dan Parmusi yang mewakili kebesaran dan kejayaan masa lampau sangat yakin keluar sebagai pemenang. Mereka tidak menyadari kalau perpecahan dan kericuhan internal mereka telah membuat tokoh-tokohnya berpindah ke Golkar.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Hasilnya di luar dugaan. Golkar sukses besar dan berhasil menang dengan 34.348.673 suara atau 62,79 % dari total perolehan suara. Perolehan suaranya pun cukup merata di seluruh provinsi, berbeda dengan parpol yang berpegang kepada basis tradisional. NU hanya menang di Jawa Timur dan Kalimantan Selatan, Partai Katholik di Nusa Tenggara Timur, PNI di Jawa Tengah, Parmusi di Sumatra Barat dan Aceh. Sedangkan Murba tidak memperoleh suara signifikan sehingga tidak memperoleh kursi DPR.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Kemudian, sesuai ketentuan dalam ketetapan MPRS mengenai perlunya penataan kembali kehidupan politik Indonesia, pada tanggal 17 Juli 1971 Sekber GOLKAR mengubah dirinya menjadi Golkar. Golkar menyatakan diri bukan parpol karena terminologi ini mengandung pengertian dan pengutamaan politik dengan mengesampingkan pembangunan dan karya.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"September 1973, Golkar menyelenggarakan Musyawarah Nasional (Munas) I di Surabaya. Mayjen Amir Murtono terpilih sebagai Ketua Umum. Konsolidasi Golkar pun mulai berjalan seiring dibentuknya wadah-wadah profesi, seperti Himpunan Kerukunan Tani Indonesia (HKTI), Himpunan Nelayan Seluruh Indonesia (HNSI) dan Federasi Buruh Seluruh Indonesia (FBSI).\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Setelah Peristiwa G30S maka Sekber Golkar, dengan dukungan sepenuhnya dari Soeharto sebagai pimpinan militer, melancarkan aksi-aksinya untuk melumpuhkan mula-mula kekuatan PKI, kemudian juga kekuatan Bung Karno.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Pada dasarnya Golkar dan TNI-AD merupakan tulang punggung rezim militer Orde Baru. Semua politik Orde Baru diciptakan dan kemudian dilaksanakan oleh pimpinan militer dan Golkar. Selama puluhan tahun Orde Baru berkuasa, jabatan-jabatan dalam struktur eksekutif, legislatif dan yudikatif, hampir semuanya diduduki oleh kader-kader Golkar.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Keluarga besar Golongan Karya sebagai jaringan konstituen, dibina sejak awal Orde Baru melalui suatu pengaturan informal yaitu jalur A untuk lingkungan militer, jalur B untuk lingkungan birokrasi dan jalur G untuk lingkungan sipil di luar birokrasi. Pemuka ketiga jalur terebut melakukan fungsi pengendalian terhadap Golkar lewat Dewan Pembina yang mempunyai peran strategis.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Setelah Soeharto mengundurkan diri pada 1998, keberadaan Golkar mulai ditentang oleh para aktivis dan mahasiswa. "))

        data?.add(DataModel(R.drawable.logo_pdip,"Prof. Dr. (H.C.) Hj. Diah Permata Megawati Setiawati Soekarnoputri ","Partai PDIP", "Pada Kongres Nasional 1993, Megawati Soekarnoputri terpilih sebagai Ketua Umum Partai Demokrasi Indonesia, salah satu dari tiga partai politik yang diakui oleh pemerintahan \"Orde Baru\" Presiden Soeharto. Hasil ini tidak diakui oleh pemerintah, yang terus mendorong Budi Harjono, calon ketua umum yang dipilihnya, untuk dipilih. Kongres Khusus diadakan di mana pemerintah mengharapkan Harjono terpilih, tetapi Megawati sekali lagi muncul sebagai pemimpin terpilih. Posisinya semakin terkonsolidasi ketika Majelis Nasional PDI meratifikasi hasil kongres.\n" +
                "\n" +
                "Pada bulan Juni 1996, Kongres Nasional kembali diadakan di Kota Medan, di mana Megawati tidak diundang; anggota anti-Megawati hadir. Dengan dukungan pemerintah, Suryadi, mantan ketua umum, terpilih kembali menjadi Ketua Umum PDI. Megawati menolak mengakui hasil kongres ini dan terus memandang dirinya sebagai pemimpin sah PDI.\n" +
                "\n" +
                "Pagi 27 Juli 1996, Suryadi mengancam akan mengambil kembali markas PDI di Jakarta.[6] Para pendukung Suryadi (kabarnya dengan dukungan Pemerintah) menyerang Markas Besar PDI dan menghadapi perlawanan dari pendukung Megawati yang ditempatkan di sana sejak Kongres Nasional di Medan. Dalam bentrokan berikutnya, pendukung Megawati berhasil bertahan di markas. Kerusuhan pun terjadi—pada tahap yang dianggap terburuk yang pernah dilihat Jakarta pada masa \"Orde Baru\"—yang disusul dengan tindakan keras pemerintah. Pemerintah kemudian menuding kerusuhan itu terjadi pada Partai Rakyat Demokratik (PRD). Meski digulingkan sebagai ketua oleh Suryadi dan pemerintah, " +
                "acara tersebut sangat mengangkat profil Megawati, memberikan simpati dan popularitas nasional.\n" +
                "\n" +
                "PDI kini terpecah menjadi dua fraksi, Megawati dan Suryadi. Yang pertama ingin berpartisipasi dalam pemilihan legislatif 1997, tetapi pemerintah hanya mengakui yang terakhir. Dalam pemilu, Megawati dan pendukungnya memberikan dukungan kepada Partai Persatuan Pembangunan dan PDI hanya meraih 3% suara. Menyusul pengunduran diri Soeharto dan pencabutan batasan \"Orde Baru\" pada partai politik nasional, Megawati mendeklarasikan pembentukan PDIP, menambahkan sufiks \"perjuangan\" untuk membedakan fraksi partainya dari fraksi yang didukung pemerintah. Dia terpilih sebagai ketua umum PDIP dan dinominasikan sebagai presiden pada tahun 1999. "))

        data?.add(DataModel(R.drawable.logo_pkb,"H. Jazilul Fawaid, S.Q., M.A. ","Partai PKB", "Partai Kebangkitan Bangsa (PKB), adalah sebuah partai politik berideologi Moderat di Indonesia. Partai ini didirikan di Jakarta pada tanggal 23 Juli 1998 (29 Rabi'ul Awal 1419 Hijriyah) yang dideklarasikan oleh para kiai-kiai Nahdlatul Ulama, seperti Munasir Ali, Ilyas Ruchiyat, Abdurrahman Wahid, A. Mustofa Bisri, dan A. Muhith Muzadi)."))


        data?.add(DataModel(R.drawable.logo_ppp,"Dr. (H.C.) Ir. H. Suharso Monoarfa ","Partai PPP", "Partai Persatuan Pembangunan (disingkat PPP atau P tiga) adalah sebuah partai politik di Indonesia. Pada saat pendeklarasiannya pada tanggal 5 Januari 1973 partai ini merupakan hasil gabungan dari empat partai keagamaan yaitu Partai Nahdlatul Ulama (NU), Partai Serikat Islam Indonesia (PSII), Persatuan Tarbiyah Islamiyah (Perti) dan Parmusi. Ketua sementara saat itu adalah Mohammad Syafa'at Mintaredja. Penggabungan keempat partai keagamaan tersebut bertujuan untuk penyederhanaan sistem kepartaian di Indonesia dalam menghadapi Pemilihan Umum pertama pada masa Orde Baru tahun 1973."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("Gambar_Parpol", item?.Gambar_Parpol)
                intent.putExtra("Ketua_Umum", item?.Ketua_Umum)
                intent.putExtra("Nama_Parpol", item?.Nama_Parpol)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}