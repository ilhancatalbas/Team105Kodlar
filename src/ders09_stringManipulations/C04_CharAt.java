package ders09_stringManipulations;

public class C04_CharAt {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(0));      // ilk harfi verir   J
        System.out.println(str.charAt(5));      // 5. indeksteki char'i verir    C

        System.out.println(str.charAt(10));       // sonuncu karakteri yazdirir   r

        // NOT   Sifirdan saymaya baslayacaksin UNUTMA

        // bir metindeki karakter sayisi ile son index arasinda 1 fark vardir. karistirmamak lazim
        // Java Candir    Bu metin icin
        // karakter sayisi 11 ,
        // son index 10 dur.

        //  System.out.println(str.charAt(11));     //  StringIndexOutOfBoundsException  hatasi verdi
                                                    // diyorki sinirlarin disinda gibi bisey diyor












    }
}
