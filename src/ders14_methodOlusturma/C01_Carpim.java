package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

    public static void main(String[] args) {

        // main method icerisinde kullanicidan 2 sayi alin
        // bu iki sayiyi parametre olarak kabul edip, carpimlarini bize dondurenbir method olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

                                                    // olusturacagimiz method main methodun disinda olur. yani asagidaki curly braces in disinda olmali
                                                    // asagida yazdigimiz methodun calismasini istiyorsak metodumu cagiracagiz. nasil cagiriyorduk?   ismini yazarak

        carpimMethodu(3.4,5.2);                     // run ettigimizde 17.0 i ekranda gormeyiz.  burasi su demek: kapici ekmegi getirdi ama ekmegi iceri almadik


        //1. ekranda gorebilmek icin bu methodu ya direk yazdiracagiz
        //2. yontem bir variable'a atayabiliriz

        System.out.println(carpimMethodu(sayi1,sayi2));                     // ekranda gorebilmek icin 1. yontem

        double carpimSonucu = carpimMethodu(6,2);                           // ekranda gorebilmek icin 2. yontem



    }

    // ustteki curly brace, main'in ici. bizi metodu main'in disinda olusturacagiz

    public static double carpimMethodu (double sayi1, double sayi2){                // return type'i; bu methodumuz bir sonuc dondurecek. 2 sayinin carpimini. double sayi
        System.out.println("carpim method'u calisti");
        return sayi1*sayi2;
    }
}
