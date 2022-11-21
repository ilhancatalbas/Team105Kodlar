package ders35_expection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_TryCatch {

    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi girmesini isteyip
        // girilen sayilari toplayin
        // kullanicinin islemi bitirmek icin Q'ya basmasini isteyin
        // Q'ya basildiginda toplam kac sayi girdigini
        // ve bu sayiarin toplamini kac oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        double girilenSayi=0;
        double sayilarinToplami=0;
        int sayac = 0;
        boolean devam = true;     // nezaman kadar devam etsin, true oldukca devam etmesi icin bu


        while (devam){

            System.out.println("Toplamak uzere sayi giriniz.\nBitirmek icin Q'ya basiniz");


            try {
                girilenSayi= scan.nextDouble();
                sayilarinToplami+=girilenSayi;
                sayac++;

            } catch (InputMismatchException e) {

                String str = scan.next();
                if (str.equalsIgnoreCase("Q")){
                    break;
                }

            }

        }

        System.out.println("Girilen " + sayac + " adet sayinin toplami " + sayilarinToplami);

    }
}
