package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C21_Sorular09 {

    public static void main(String[] args) {

        //Soru 5-Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        //       While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.



        int num = 5;

        int us = 3;

        usHesapla(5,3);


    }

    public static void usHesapla (int sayi, int us){

        int sonuc = 1;

        while (us>0){

            sonuc*=sayi;

            us--;

        }

        System.out.println(sonuc);





    }
}
