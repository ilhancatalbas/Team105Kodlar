package ders09_stringManipulations;

public class C06_SubString {

    public static void main(String[] args) {

        String str = "Java ogren, isi kap";

        System.out.println(str.substring(5));

        System.out.println(str.substring(0));

        // str imizin length i kacmis onu ogrenelim

        System.out.println(str.length());       // 19  mus

        // son karakteri String olarak kaydedin
        // str.charAt(str.length()-1);   // yaparsam char olarak bize verir
        // String sonHarf = str.charAt(str.length()-1); yaparsam itiraz eder sen string istiyorsun. bu taraf char veriyor der
        // basina "" (hiclik) ekleyerek yapabilirsin string lestirmeyi

        String sonharf=""+str.charAt(str.length()-1);
        sonharf=str.substring(str.length()-1);
        System.out.println(sonharf);

        // son indexdeki karakteri upper case olarak yazdirin

        System.out.println(str.substring(str.length()-1).toUpperCase());   // 3 method kullandik.

        // son 3 harfi buyuk harf olarak yazdirin

        System.out.println(str.substring(str.length()-3).toUpperCase());

        // -3 de niye sondan ucu aldi. sebebi charAt olsaydi sadece sonra 3. yu alirdi
        // ama bu subtsring olunca sondan 3. den basliyor sonuna kaar devam ediyor








    }
}
