package ders14_methodOlusturma;

public class C02_StringConcate {

    // verilen iki Stringi parametre olarak kabul edip
    // bu iki Stringi aralarinda bir bosluk olan tekbir String olarak main method'a donduren bir method olusturun

    public static void main(String[] args) {

        String str1= "Java";
        String str2= "Candir";

        System.out.println(birlestirMetodu(str1, str2));

        System.out.println(birlestirMetodu("buda","oldu"));

        System.out.println(birlestirMetodu("anladiniz","mi"));


    }

    public static String birlestirMetodu (String str1, String str2) {

        return str1 + " " + str2;

    }

}
