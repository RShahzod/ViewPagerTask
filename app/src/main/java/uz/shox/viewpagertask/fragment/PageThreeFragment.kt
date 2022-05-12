package uz.shox.viewpagertask.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.shox.viewpagertask.R
import uz.shox.viewpagertask.adapter.PagerThreeAdapter
import uz.shox.viewpagertask.adapter.PagerTwoAdapter
import uz.shox.viewpagertask.model.PostData
import uz.shox.viewpagertask.model.User

class PageThreeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_page_three, container, false)
        initView(view)
        return view
    }

    private fun initView(view: View) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView2)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val postData: ArrayList<PostData> = ArrayList()
        postData.add(
            PostData(
                "Shohjahon",
                "Ushbu maqolada dunyodagi eng mashhur operatsion tizimlardan biri bo'lgan - Anroid operatsion tizimi haqida 33 eng qiziq faktlar keltirilgan.\n" +
                        "\n" +
                        "1. 2003-yilda Endi Rubin, Nik Sirs va Kris Uaytlar Kaliforniyada Android Inc kompaniyasini ro'yxatdan o'tkazishgan.\n" +
                        "\n" +
                        "2. Googleda norasmiy ravishda operatsion tizim logotipini Android emas \"Bugdroid\" deb nomlashadi.\n" +
                        "\n" +
                        "3. Android nomini operatsion tizimi asoschisi Endi Rubin taklif etgan.\n" +
                        "\n" +
                        "4. 2008-yilda ko'plab mutaxassislar Android operatsion tizimining muvafaqqiyatiga ishonishmagan.")
        )
        postData.add(
            PostData(
                "Sherzod",
                "5. Android 4.2 talqinidan boshlab Goole Android qurilmalarda dasturchilar imkoniyatlari funksiyasini o'chib qo'yishni boshlagan. Uni yoqish uchun operatsion tizim versiyasiga yetti marta bosish kerak.\n" +
                        "\n" +
                        "6. Dunyoda sotiladigan Android qurilmalar soni Microsoft Windows, iOS va macOS qurilmalarining birgalikdagi umumiy sonidan ko'pdir.\n" +
                        "\n" +
                        "7. Android platformasi uchun maxsus Droid va Roboto shriftlar oilasi yaratilgan.\n" +
                        "\n" +
                        "8. Android operatsion tizimining 4.3 talqinidan boshlab ko'pfoydalanuvchilik rejimi qo'shilgan.\n" +
                        "\n" +
                        "9. Android operatsion tizimi ARM, MIPS va x86 kabi apparat platformalari uchun mavjud.\n" +
                        "\n" +
                        "10. Android ochiq kodli operatsion tizim bo'lib, uni kodining hajmi 250 GB(gigabayt)dan ko'pdir.")
        )
        postData.add(PostData("Bekzod","11. Google Play do'konining bir nechta raqobatchilari mavjud: Amazon Appstore, Opera Mobile Store, Yandex Store, GetUpps!, Mobogenie, F-Droid, 1Mobile market.\n" +
                "\n" +
                "12. Android operatsion tizimi Linux operatsion tizimi asosida yaratilgan.\n" +
                "\n" +
                "13. Dunyodagi smartfonlarning 88%i Android operatsion tizimida ishlaydi.\n" +
                "\n" +
                "14. Android operatsion tizimi aslida raqamli kameralar uchun maxsus operatsion tizim sifatida yaratilgan.\n" +
                "\n" +
                "15. Googe kompaniyasi Androidni yaratmagan, uni 2005-yilda 50 million AQSH dollariga sotib olgan.\n" +
                "\n" +
                "16. Microsoft kompaniyasi o'zining patentlari evaziga Androiddan 2 milliard AQSH dollari foyda oladi.\n" +
                "\n" +
                "17. Birinchi Android smartfoning ko'rinishi Blackberryni eslatgan."))
        postData.add(PostData("Shahzod","18. Samsung komopaniyasida 2004-yilda Androidni sotib olish imkoni tug'ilgan. Lekin Samsungdagilar Android operatsion tiziming kelajagi yo'q deb hisoblashgan va sotib olishmagan.\n" +
                "\n" +
                "19. Android operatsion tizimi erkak jinsli robot deb hisoblanadi, chunki ayol jinsli robotlar Gynoid deb nomlanadi.\n" +
                "\n" +
                "20. Google kompaniyasining bosh qarorgohida Android operatsion tizimining har bir talqini uchun kichik haykallar o'rnatilgan."))
        postData.add(PostData("Shahboz","22. Android tizimi hamma foydalanuvchi-xatolarini qayt etib boradi va bunda u \"What a Terrible Falure - WTF\"(\"Qanday rasvo omadsizlik\") metodidan foydalanadi.\n" +
                "\n" +
                "23. 2010-yilda Nokia kompaniyasining rahbari Anssi Van'oki \"Android - isinish maqsadida kiyimini bulg'ayotgan fin bolachasi\" degan.\n" +
                "\n" +
                "24. 2010-yilda Sony Ericsson kompaniyasi LiveView deb nomlangan soatlarini ishlab chiqqan. Bu soatlar Android qurilmalargan ulangan va uning yordamida mediaplayerni boshqarish, Twitterda yangiliklar tasmasini yurgazish mumkin bo'lgan.\n" +
                "\n" +
                "25. Android nafaqat smartfon va planshetlarda balki, boshqa qurilmalarda ham qo'llaniladi. Masalan, Google Glass.\n" +
                "\n" +
                "26. Iste'molchilar elektronikasi CES 2011 Xalqaro Ko'rgazmasida Android 3.0 Honeycomb talqini e'lon qilingan. U faqat planshetlarga moslab qaytadan yozib chiqilgan. Androidning bu talqini Android tarixidagi eng muvafaqqiyatsiz talqini deb hisoblanadi."))
        postData.add(PostData("Shohruh","27. Android logotipi rossiyalik dizayner Irina Blok tomonidan yaratilgan bo'lib, unga aynan shunday logotip yaratishda xojatxonadagi inson obrazi ilhom bag'ishlagan.\n" +
                "\n" +
                "28. 2009-yilda Googlening bosh direktori Erik Shmidt qiziqishlarining har xilligi sababli Applening direktorlar kengashidan ketishga majbur bo'lgan.\n" +
                "\n" +
                "29. Birinchi Android qurilmalarda musiqa eshitish uchun maxsus qismi bo'lmagan. Va bunda musiqa eshitish uchun alohida adapterdan foydalanish talab etilgan.\n" +
                "\n" +
                "30. Andorid 1.0 va 1.1 talqinlaridan boshqa hamma talqinlari shirinliklar va desertlar nomlari bilan nomlanadi.\n" +
                "\n" +
                "31. Google o'zining xaritalarida avtomobil yo'llaridagi tirbandliklarni hisoblash uchun Android qurilmalaridan keladigan ma'lumotlardan foydalanadi.\n" +
                "\n" +
                "32. Android operatsion tizimida ishlaydigan birinchi qurilmani HTC kompaniyasi ishlab chiqqan va u HTC Dream deb nomlangan. Uning narxi 179 AQSH dollariga teng bo'lgan.\n" +
                "\n" +
                "33. Android operatsion tizimida ishlaydigna qurilmalardan ayollarga nisbatan ko'proq erkaklar foydalanishadi."))

        val pagerAdapter = PagerThreeAdapter(requireContext(), postData)
        //aa
        recyclerView.adapter = pagerAdapter


    }
}