package ders11_stringManipulations;

public class C03_replaceAll {

    public static void main(String[] args) {

        String  str = "J1ava2 G9uzel5dir8";

        // str daki sayilari silip metni java guzeldir haline donusturelim

        // str.replaceAll() sadece bir harf veya char sequence'i degil
        // genelleme ile soyleyebilecgimiz ortak ozellikteki tum karakterleri degistirir

        System.out.println(str.replaceAll("\\d",""));        // Java Guzeldir

        System.out.println(str.replaceAll("\\D",""));        // 12958   digit olmayan herseyi yok et diyecek


        // Soru: 2 urunun fiyatini toplayin

        String s1= "ilk urun fiyati: 1250 tl";
        String s2= "ikinci urun fiyati: 1500 tl";

        s1=s1.replaceAll("\\D","");    //"1250"  yapti ama dikkat  String olarak 1250
        s2=s2.replaceAll("\\D","");    //"1500"  yapti ama dikkat  String olarak 1500

        System.out.println(s1+s2);      // boyle yazdirirsan yana yana sayiyi yazdirir   // 12501500
                                        // bunu int e ceviregiz. bunun yontemide nasildi
                                        // parse.Int methodu vardi int wrapper class'inda  yani:  Integer.parse.int
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));      // 2750





    }

}
