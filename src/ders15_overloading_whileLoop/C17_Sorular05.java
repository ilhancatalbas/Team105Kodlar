package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C17_Sorular05 {

    public static void main(String[] args) {

        // kullanicidan toplanmak uzere tam  sayilar alin.
        // kullanici 0'a basarsa sayi alma islemini bitirin.
        // kullanicinin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz. bitirmek icin sifira basiniz");



        int girilenSayi = 5;

        int toplam = 0;

        int sayac = 0;

        while (girilenSayi !=0){
            girilenSayi = scan.nextInt();

            if (girilenSayi !=0){
                sayac++;
                toplam+=girilenSayi;
            }
        }

        System.out.println("girlen sayi adeti: " + sayac + "toplami : " + toplam);

    }
}
