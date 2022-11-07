package ders29_stringBuilder_accessModifier;

public class C04_AccessModifiers {

       // main methodun icerisinde olmamali class levelde olmali



        String isim = "Ali";                 // access modifier gorunmuyor, ozaman default access modifier gecerlidir
                                             // bu class'dan ve ders29 package'i icerisindeki diger class'lardan kullanilabilir

        // default int sayi = 10;           // default access modifier yazilmaz, YAZILAMAZ
                                            // yazmaya kakisirsaniz java CTE verir

       private static int sayi = 10;

    public static void main(String[] args) {

        // main method'un icerisinden ayni class'da bunu kullanabiliriz

        System.out.println(sayi);                // 10
        sayi=20;                                 // deger atayabiliriz

        System.out.println(sayi);                // deger atadiktan sonra tekrar yazdirabiliriz    // 20

    }
}
