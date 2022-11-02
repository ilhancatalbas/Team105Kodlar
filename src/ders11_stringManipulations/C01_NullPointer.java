package ders11_stringManipulations;

public class C01_NullPointer {

    public static void main(String[] args) {

        String str1 = "";           // str1'e bir deger atanmistir

        System.out.println(str1);   // yazdirinca hiclik i yazdiriyor bize.

        System.out.println(str1.concat("Java"));   //  java


        String str2;     // str2 olusturldu ama deger atanmadi

        //  System.out.println(str2);     // str2'ye deger atamasi yapilmadigi icin yazdirilamaz. CTE hatasi verir

        //  System.out.println(str2.concat("java"));   // burdada diyorki deger atamasi yapmadinki neyle java'yi birlestireyim diyor


        str2="Java candir";
        System.out.println(str2);                     // deger atamasi yaptigimiz icin yazdirdi
        System.out.println(str2.concat("."));    // deger atamasi yaptigimiz icin yazdirdi ve concat yapip noktaida koydu


        String str3= null;    //str3'e deger atanmamistir
                             // null poiner ile javaya deger atamadigimizin farkinda oldugumuzu soyluyoruz

        System.out.println(str3);    // yazdirinca hata vermiyor. yazdiryor
                                     // yazdirinca bize null yaziyor. sen bunu null point olarak isaretledin diyor

        // System.out.println(str3.concat("Java"));     // NullPointerException  verir yazdirinca

                                                        // null atamasi yapilmaz. cunku null bir deger degil. null olarak isaretliyoruz

        System.out.println(str3 + "Java");

        System.out.println(str3.toUpperCase());         // NullPointerException


        // mesela okulda ogrenci listesi olusturdun. ama ogrenciler belli degil. bunlari null olarak isaretlersin
        // boyle yapip calisabilirsin. boylece sistem kilitlenmez








    }
}
