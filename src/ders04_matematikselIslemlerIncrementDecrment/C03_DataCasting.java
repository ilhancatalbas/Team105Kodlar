package ders04_matematikselIslemlerIncrementDecrment;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {

        // kullanicidan iki int deger alip
        // bunlari birbirine bolun ve sonucu double olarak yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 2 tam sayi giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println(sayi1/sayi2);                               // 3

        double ondalikliSonuc = (double) (sayi1/sayi2);                // 3.0 verdi ama istedimiz bu degil. (3.333 seklindeydi istegidimiz).
                                                                       // cunku java islem onceligine bakar. biz sonucun double olmasini istiyorsa, 2 sayidan birinin en az double olmasi lazim.
        System.out.println(ondalikliSonuc);


        double dogruSonuc = (double) sayi1 / sayi2;                    // biz sonucun double olmasini istiyorsa, 2 sayidan birinin en az double olmasi lazim. ust taraf double olacak, alt taraf int, java sonucu buyuk olana gore verir
                                                                       // istersek 2 sayiyida double'a cevirebiliriz, sorun ama gerekde yok
        System.out.println(dogruSonuc);



    }
}
