package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C12_Sorular03 {

    public static void main(String[] args) {

        // kullanicidan toplanmak uzere tam  sayilar alin.
        // kullanici 0'a basarsa sayi alma islemini bitirin.
        // kullanicinin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin

        int girilenSayi = 5;
        int sayac = 0;
        int toplam = 0;

        while (girilenSayi !=0){

            Scanner scan = new Scanner(System.in);

            System.out.println("Lutfen sayi giriniz  \nbitirmek icin 0'a basin");

            girilenSayi = scan.nextInt();

           if (girilenSayi !=0){
               sayac++;
               toplam+=girilenSayi;

           }

        }

        System.out.println("Girilen " + sayac + " Adet sayinin toplami : " + toplam);

    }
}
