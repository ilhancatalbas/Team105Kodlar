package ders27_immutableClasses_DateAndTime;

public class C02_StringPool {

    public static void main(String[] args) {


        String str1 = "Java";

        String str2 = "Java";

        String str3 = new String("Java");

        String str4 =" ";
        str4="Java";                                // bu true veriyor           // java bakmiski String icin habire obje olusturmak zorunda kaliyor. farkli bir yontem gelistirmis
        // str4 = str4.concat ("java");             // bu false veriyor          // java heap memory'nin icinde ayri bir  string pool  olusturmus
                                                                                 // String str1 = "Java";  basit bir String olsuturduk. bunun str'ini stack memory de olusturdu.
        String str5 = "Ja";                                                      // Bunu yine heap memory'nin icinde string pool'un icine koyuyor
        str5=str5.concat("va");                                              // ayni sekilde (basit olusturmalarda) bir String daha olusturdugumuzda (String str2 = "Java";)  java referans olusturmadan omce String havuzunu gozden geciriyor
                                                                                 // ayni varmi diye bakiyor. varsa eger birdaha obje olusturmuyor. ayni referansi digerinede veriyor
        System.out.println(str1.equals(str2));      // true                      // str3 'u olusturmaya kalktigimizda,  String str3 = new String("Java");    java once sag tarafa bakiyor (='din sag tarafi)
                                                                                 // orada new String dedigi icin yeni bir String olusturoyr once (hepa memory'de), sonra icine java koyuyor. bunada bir tane referans olusturuyor: str3 yapiyor
        System.out.println(str1==str2);             // true                      // String str4 =" ";  baktigimizda stack memory de str4 olusturacak, Heap memory'de degeri hiclik "". bir alt satirda yeni bir deger atanmis.
                                                                                 // eski deger degizmez, yeni bir obje olusturulur/ deger; "java" olur. pointer heap'e alinir. onceki deger (hiclik) iptal olur
        System.out.println(str1.equals(str3));      // true             // equals dedigimiz de direk metinlere bakiyoruz.

        System.out.println(str1==str3);             // false

        System.out.println(str1.equals(str4));      // true

        System.out.println(str1==str4);             // true

        System.out.println(str1.equals(str5));      // true

        System.out.println(str1==str5);             // false


        System.out.println(str1=="java");           // true   bunuda havuzdan kontrol eder. true verir.
        System.out.println(str3=="java");           // false  str3'u new keyword'la olusturdugu icin havuzda degil. havuzda bulamayacagi icin false. new yada concat vb olusturulmussa havuza girmez

        /*
        =='in true vermesi icin hem referans hem de adress ayni olmalidir
        equals() ise sadece degerlere bakar, dolayisiyla purpriz yasamazsiniz

        */

        //NOT: Bazi kod okuma sorularinda String pool bilinmezse hata yapilabilir



    }
}
