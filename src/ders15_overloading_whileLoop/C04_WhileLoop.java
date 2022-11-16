package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

    public static void main(String[] args) {

        // kullanicidan toplanmak uzere tam  sayilar alin.
        // kullanici 0'a basarsa sayi alma islemini bitirin.
        // kullanicinin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin

        Scanner scan = new Scanner(System.in);

        int girilenSayi=5;                // burdaki girilen sayi=5'in mantigi sadece su. 0'a basinca kodu durdurmak icin. naska bir islevi yok. ister 5 yaz ister baska bisey ama 0 yazma
                                          // verilen ilk deger bu soru icin 0 olmamali.
                                          // cunku 0 loop'u bitirmek icin kullanilacak
        int sayac=0;
        int toplam=0;

        while (girilenSayi !=0){                                                         // girilen sayi 0'a esit olmadigi muddetce kod calissin demektir
            System.out.println("Lutfen toplamak icin bir tam sayi girin" +
                    "\nBitirmek icin 0'a basin");
            girilenSayi= scan.nextInt();

            if (girilenSayi !=0){
                sayac++;
                toplam= toplam+girilenSayi;
            }

        }

        System.out.println("girilen " + sayac + "adet sayinin toplami : " + toplam);

    }
}
