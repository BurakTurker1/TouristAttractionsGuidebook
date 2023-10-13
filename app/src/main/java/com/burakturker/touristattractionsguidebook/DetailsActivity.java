package com.burakturker.touristattractionsguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import com.burakturker.touristattractionsguidebook.databinding.ActivityDetailsBinding;


public class DetailsActivity extends AppCompatActivity {
    ArrayList<Attractions> attractionsArrayList;
     ActivityDetailsBinding activityDetailsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDetailsBinding = ActivityDetailsBinding.inflate(getLayoutInflater());

        // getting our root layout in our view.
        View view = activityDetailsBinding.getRoot();

        // below line is to set
        // Content view for our layout.
        setContentView(view);
        attractionsArrayList = new ArrayList<>();


        //data
        Attractions kapadokya = new Attractions("Kapadokya","Nevşehir/Tukiye","Kapadokya, Türkiye'nin Orta Anadolu bölgesinde yer alır ve benzersiz peri bacaları, yer altı şehirleri ve kaya kiliseleri ile ünlüdür. Sıcak hava balonlarıyla yapılan turlar, bu büyüleyici bölgenin manzarasını keşfetmek için popüler bir yol sunar.",R.drawable.kapadokya);
        Attractions santorini = new Attractions("Santorini"," Yunanistan","Santorini, Ege Denizi'nde yer alan volkanik bir adadır ve beyaz badanalı evleri ile ünlüdür. Muhteşem gün batımları ve sınırsız deniz manzaraları, romantik tatiller ve balayılar için popüler bir seçenektir. Ada ayrıca lezzetli Yunan mutfağı sunar.",R.drawable.santorini);
        Attractions sedona= new Attractions("Sedona","Arizona/ABD, Arizona"," Sedona, Kızıl Kumtaşı Kanyonları ile ünlüdür. Bu büyüleyici doğal oluşumlar, açık hava aktiviteleri ve manevi enerjileri ile ünlüdür. Sedona'da bulunan enerji merkezleri, yoga meraklıları ve ruhsal arayış içinde olanlar için cazip bir destinasyon haline getirir.",R.drawable.sedona);
        Attractions bali= new Attractions("bali","Endonezya","Bali, Endonezya'nın güneyinde yer alan bir tropikal cennettir. Sürf yapmak, dalış yapmak, yoga yapmak ve rahatlamak isteyenler için mükemmel bir seçenektir. Aynı zamanda Ubud'daki pirinç tarlaları ve ulu tapınakları gibi kültürel ve doğal güzelliklere ev sahipliği yapar.",R.drawable.bali);
        Attractions kyoto = new Attractions("Kyoto","Japonya"," Kyoto, geleneksel Japon kültürünün merkezidir. 1000'den fazla tapınağı, çay bahçeleri ve geleneksel el sanatlarına ev sahipliği yapar. Her yıl on binlerce turist, kimono giyen yerel halkın arasında geleneksel Japon atmosferini yaşamak için Kyoto'yu ziyaret eder.",R.drawable.kyoto);
        Attractions machu = new Attractions("Machu Picchu","Peru","Machu Picchu, Peru'nun Cusco şehrinde yer alır ve İnka İmparatorluğu'nun antik bir şehridir. Bu UNESCO Dünya Mirası alanı, mistik atmosferi ve etkileyici manzaralarıyla ünlüdür. Tarihi zenginlikleri, İnka kalıntıları ve çevresindeki doğal güzellikler, tarih ve doğa severler için cazip bir seçenek sunar.",R.drawable.machu);
        Attractions NewYork = new Attractions("New York City","ABD"," New York, dünya çapında finans, kültür ve eğlence merkezlerinden biridir. Times Square, Empire State Building, Central Park ve Metropolitan Sanat Müzesi gibi simgeleri barındırır. Aynı zamanda farklı kültürlerin harmanlandığı bir yemek cenneti olarak da ünlüdür.",R.drawable.newyork);
        Attractions paris  = new Attractions("Paris","Fransa"," Paris, romantizmin, sanatın ve zarafetin başkenti olarak bilinir. Eiffel Kulesi, Louvre Müzesi, Montmartre ve Notre-Dame Katedrali gibi simgeleri ile ünlüdür. Ayrıca dünya mutfaklarının çeşitliliği, lüks alışveriş olanakları ve şık sokaklarıyla ziyaretçileri cezbetmektedir.",R.drawable.paris);
        Attractions rio = new Attractions("Rio de Janeiro","Brezilya","Rio de Janeiro, muhteşem plajları, efsanevi Christ the Redeemer heykeli ve enerjik Carnaval festivalleri ile ünlüdür. Copacabana ve Ipanema plajları, samba dansı ve doğal güzellikleri ile bu şehri unutulmaz bir tatil destinasyonu haline getirir.",R.drawable.rio);
        Attractions roma = new Attractions("Roma","İtalya","Roma, tarih ve kültürle iç içe geçmiş bir şehirdir. Antik Roma İmparatorluğu'nun izlerini taşıyan Colosseum, Forum Romanum ve Pantheon gibi önemli tarihi yerlere ev sahipliği yapar. Ayrıca Vatikan Şehri, San Pietro Bazilikası ve Sistine Şapeli gibi dini ve sanatsal eserlere ev sahipliği yapar.",R.drawable.roma);
        attractionsArrayList.add(kapadokya);
        attractionsArrayList.add(santorini);
        attractionsArrayList.add(sedona);
        attractionsArrayList.add(bali);
        attractionsArrayList.add(kyoto);
        attractionsArrayList.add(machu);
        attractionsArrayList.add(NewYork);
        attractionsArrayList.add(paris);
        attractionsArrayList.add(rio);
        attractionsArrayList.add(roma);

    }
}