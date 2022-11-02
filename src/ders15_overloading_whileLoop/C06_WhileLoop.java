package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

    public static void main(String[] args) {

        /*Soru : Kullanicidan Kullanicidan sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
                 kullanicinin yeni sifre girmesi isteyin
                 Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
                 gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
                 sartlar :
                 -sifrenin ilk karakteri kucuk harf olmali
                 -sifrenin son karakteri sayi olmali

         */

        Scanner scan = new Scanner(System.in);
        boolean sifreGecerlimi=false;
        String sifre = "";
        int bayrak=0;                                                                                   // bayrak i while disina aldik. herseferinde yeniden olusturmasin

        while (sifreGecerlimi!=true){                                                                    // sifre gecerlimi diye soracak true olmadigi muddetce calismaya devam edecek

            System.out.println("Lutfen sifre giriniz");
            sifre= scan.nextLine();
            bayrak=0;


            // once buraya bizim istegigimiz olmasi gereken durumu yazalim. eger hata mesaji verecekse bunun tersi olmasi lazim.
            // ozaman bunun ! ile tersini yaparim ki yanlis oldugunda hata mesaini yazdirsin

            if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
                System.out.println("Sifrenin ilk karakteri kucuk harf olmali");
                bayrak++;                                                                                // eger boyle bir hata varsa bayragi 1 artir diyor
            }

            if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){             // 0' esit yada buyuk 9'a esit yada buyuk olmali ama KARAKTER olan 0 ve 9
                System.out.println("Sifrenin son karakteri sayi olmali");
                bayrak++;                                                                                         // 2 bagimsiz if varsa else olmaz
            }

            if (sifre.length()<8){
                System.out.println("Sifre en az 8 karakter olmali");
                bayrak++;
            }

                                                                                                         // hata varmi yokmu. hata olursa bayrak sayi artacakti.
             if (bayrak==0){                                                                             // bayrak hic artmadiysa, sifirsa hata yok demektir
                 sifreGecerlimi=true;
                 System.out.println("Sifreniz basari ile kaydedildi");
             }

        }
    }
}
