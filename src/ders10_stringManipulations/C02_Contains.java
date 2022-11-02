package ders10_stringManipulations;

public class C02_Contains {

    public static void main(String[] args) {

        String str = "Java ile kodlama cok zevkl'";

        str.contains("cok");

        // bunun ciktisinda bisey goremezsin.
        // bu tur seyleri gormek icin ya yazdirmak lazim yada bir varibale atamak lazim ki true yada false olarak gorelim


        System.out.println(str.contains("cok"));

        System.out.println(str.contains("odla"));

        System.out.println(str.contains("a"));            // tek harf bile sorun yok sonucuc true olarak verecektir

        // System.out.println(str.contains('a'));         // parametre olarak char kabul etmez. tek tirnak. altini cizer

        System.out.println(str.contains("java"));         // false doner cunku: kucuk j  ile java yok yazilmamis


        // CharSequence : char dizisi

        String str2 = "Java";
        System.out.println(str.contains(str2));           // burdada diyorki bunun icerisinde bu varmi diyoruz. oldugu icin true gorusuyoruz
                                                          // yani biyda kelimeleri vermemis str icinde str2 varmi diye sormus

        String str3 = "234 Ali Can";

        // str3.contains(2);              // bunu kabul etmez. cunku burasi char sequence istiyor
        str3.contains("2");               // bunu kabul eder. cunku burasi artik string. cift tirnak icinde

        // char tek tirnak icerisnde olmuyormu sorusuna cevap olarak
        // 'abc'  gibi tek tirnak icerisine birden fazla char yazamayiz.
        // mecburen uc tane char birlestirirsek artik bu String olur
        // String oluncada bunu cift tirnak icerisine yaziyoruz



    }
}
