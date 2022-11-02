package ders14_methodOlusturma;

public class C04_Tekrar {

    public static void main(String[] args) {

        int a=10;
        int b=20;

        // bu iki sayinin carpim sonucunu yeni kod yazmadan konsolo yazdirin
        System.out.println(C01_Carpim.carpimMethodu(a, b));


        String c="Nasil";
        String d= "yani";
        // bu iki String'i aralarinda bir bosluk birakarak yazdirin
        System.out.println(C02_StringConcate.birlestirMetodu(c, d));


        String e = "Bu da mi oldu?";
        // e String'ini tersten yazdirin
        System.out.println(C03_StringTerseCevirme.stringiTerseCevir(e));


        // "Bu cumleyi terse cevirin"
        System.out.println(C03_StringTerseCevirme.stringiTerseCevir("Bu cumleyi terse cevirin"));


        String str="java cok guzel";
        // str'i buyuk harf yazdirin
        System.out.println(str.toUpperCase());


    }
}
