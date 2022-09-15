package com.example.databindingexercise.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.databindingexercise.R
import com.example.databindingexercise.model.ListImages
import com.example.databindingexercise.model.News

class NewsViewModel : ViewModel() {
    val datas = MutableLiveData<MutableList<News>>()

    private val bjorka = "Presiden Joko Widodo membentuk tim khusus menyusul sejumlah serangan siber dari hacker Bjorka ke instansi pemerintahan.\n" +
            "\n" +
            "Pembentukan tim dilakukan setelah pemerintah menggelar rapat di Istana Kepresidenan Jakarta. Tim itu akan menindaklanjuti serangan-serangan siber yang diterima beberapa waktu terakhir.\n" +
            "\n" +
            "\"Perlu ada emergency response team terkait untuk menjaga data, tata kelola data, yang baik di Indonesia dan untuk menjaga kepercayaan publik,\" kata Menteri Komunikasi dan Informatika Jhonny G Plate di Istana Kepresidenan Jakarta, Senin (12/9).\n" +
            "\n" +
            "Jhonny menyebut tim tersebut akan terdiri dari Badan Siber dan Sandi Nasional (BSSN), Kominfo, Polri, dan Badan Intelijen Negara (BIN).\n" +
            "\n" +
            "Baca artikel CNN Indonesia \"Jokowi Bentuk Tim Khusus Respons Serangan Bjorka\" selengkapnya di sini: https://www.cnnindonesia.com/nasional/20220912162500-32-846753/jokowi-bentuk-tim-khusus-respons-serangan-bjorka.\n" +
            "\n" +
            "Download Apps CNN Indonesia sekarang https://app.cnnindonesia.com/"

    private val bjorkaV2 = "Pemuda Madiun berinisial MAH (21) ditangkap oleh tim Cyber Mabes Polri. Belum ada keterangan pasti apakah penangkapan ini terkait hacker Bjorka yang sedang viral beberapa waktu terakhir." +
            "Sebelumnya akun Instagram bernama @volt_anonym dan akun lainnya @voltcyber_V2 mengklaim pemuda asal Cirebon bernama Muhammad Said Fikriansyah sebagai Bjorka. Namun Said membantah berita tersebut.\n" +
            "\n" +
            "Bjorka pada unggahannya di Breached.to buka suara terkait identifikasi tersebut. Menurutnya informasi sosok Bjorka salah.\n" +
            "\n" +
            "Dia bahkan menyebut akun Twitter Dark Tracer telah menyebarkan misinformasi dan menyalahkan Dark Tracer telah memberikan informasi yang salah terkait anak tersebut." +
            "\"Seorang idiot dari Indonesia dituduh adalah saya, dan sekarang dia menangis,\" tulis akun Bjorka."

    private val bbm = "Badan Eksekutif Mahasiswa Universitas Indonesia (BEM UI) menyatakan menolak kenaikan harga bahan bakar minyak (BBM) jenis Pertalite hingga Solar.\n" +
            "\n" +
            "Koordinator Sosial Politik BEM UI Melki Sedek Huang mengatakan kenaikan BBM berdampak secara signifikan terhadap berbagai sektor kehidupan krusial masyarakat.\n" +
            "\n" +
            "\"Seperti mengakibatkan kenaikan harga (inflasi) berbagai sektor krusial yang mempengaruhi daya untuk memenuhi kehidupan sehari-hari rakyat,\" kata Melki dalam keterangan tertulis, Selasa (13/9).\n" +
            "\n" +
            "Dia mengungkapkan bahwa Pusat Informasi Harga Pangan Strategis Nasional (PIHPSN) mencatat telah terjadi kenaikan harga di berbagai komoditas pangan secara signifikan, seperti komoditas cabai.\n" +
            "\n" +
            "Melki menyebut komoditas cabai mengalami peningkatan harga hingga 15,76 persen imbas kenaikan harga BBM. Menurut BEM UI, kenaikan harga komoditas pangan itu akan terus terjadi."


    val listData = mutableListOf(
        News("Presiden Jokowi membentuk tim khusus untuk menangangi kasus hacker bjorka","13 Sep 2022", mutableListOf(ListImages(R.drawable.bjorka),ListImages(R.drawable.bjorkaii)),
            bjorka,"CNN Indonesia"),
        News("Remaja Madiun Ditangkap, Bjorka: 'Idiot Salah Informasi'","15 Sep 2022", mutableListOf(ListImages(R.drawable.bjorka),ListImages(R.drawable.bjorkaii),ListImages(R.drawable.bjorkaiii),ListImages(R.drawable.bjorkaiv)),
            bjorkaV2,"CNBC Indonesia"),
        News("BBM naik, gada duit","15 Sep 2022", mutableListOf(ListImages(R.drawable.bbm),ListImages(R.drawable.tolak_bbm_naik),ListImages(R.drawable.demo_bbm_naik)),
            bbm,"Detik.com"),
        News("Danilla Musisi Senja terkenal","15 Sep 2022", mutableListOf(ListImages(R.drawable.danilla)),
            bjorka,"Faizal"),
        News("Presiden Jokowi membentuk tim khusus untuk menangangi kasus hacker bjorka","13 Sep 2022", mutableListOf(ListImages(R.drawable.bjorka),ListImages(R.drawable.bjorkaii)),
            bjorka,"CNN Indonesia"),
        News("Remaja Madiun Ditangkap, Bjorka: 'Idiot Salah Informasi'","15 Sep 2022", mutableListOf(ListImages(R.drawable.bjorka),ListImages(R.drawable.bjorkaii),ListImages(R.drawable.bjorkaiii),ListImages(R.drawable.bjorkaiv)),
            bjorkaV2,"CNBC Indonesia"),
        News("BBM naik, gada duit","15 Sep 2022", mutableListOf(ListImages(R.drawable.bbm),ListImages(R.drawable.tolak_bbm_naik),ListImages(R.drawable.demo_bbm_naik)),
            bbm,"Detik.com"),
        News("Danilla Musisi Senja terkenal","15 Sep 2022", mutableListOf(ListImages(R.drawable.danilla)),
            bjorka,"Faizal"),
    )

    fun getData(){
        datas.value = listData
    }
}