package ders35_expection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exception {

    public static void main(String[] args) {

        // kullanicidan bir tam sayi alin
        // ve sayinin karesini yazdiran
        // kullanici ondalikli sayi girerse kullaniciya uyari yazisi yazdirip
        // tekrar sayi isteyen bir method olusturun

        sayiAlKaresiniYazdir();

    }

    public static void sayiAlKaresiniYazdir (){

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi girin");




        try {
            int girilenSayi = scan.nextInt();
            /*
               Eger ondalikli sayi girilirse 26. satir exception verecek ve
               catch bloguna kadar olan diger kodlar calismayacak
               catch blogu hata yakalandiginda ne yapmasini istedigimiz soyledigimiz bolumdur

               bu soruda istenen exception olustugunda yeniden deger istenmesi
               bizde exception olustugunda yeniden method'u calistirdik

               hata olmazsa catch blogu devreye girmez ve kod normal bir sekilde biter
             */

            System.out.println("Girdiginiz sayinin karesi : ");
            System.out.println(girilenSayi*girilenSayi);

        } catch (InputMismatchException e) {

            System.out.println("Sana tam sayi degeri gir dedik:) ");
            sayiAlKaresiniYazdir();

        }

    }
}
