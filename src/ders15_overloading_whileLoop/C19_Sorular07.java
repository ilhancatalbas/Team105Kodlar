package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C19_Sorular07 {

    public static void main(String[] args) {


        /*Soru : Kullanicidan Kullanicidan sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
                 kullanicinin yeni sifre girmesi isteyin
                 Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
                 gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
                 sartlar :
                 -sifrenin ilk karakteri kucuk harf olmali
                 -sifrenin son karakteri sayi olmali
                 -sifre en az 8 basmakli olmali

        */

        Scanner scan = new Scanner(System.in);

        String password = "";

        boolean sifreGecerliMi= false;

        int count=0;



        while (sifreGecerliMi !=true){

            System.out.println("Lutfen gecerli bir sifre giriniz");

            password = scan.nextLine();

            count=0;



            if (!(password.charAt(0) >= 'a' && password.charAt(0)<='z')){
                System.out.println("sifrenin ilk harfi kucuk harf olmali");
                count++;
            }
            if (!(password.charAt(password.length()-1) >= '0' && password.charAt(password.length()-1)<='9' )){
                System.out.println("sifrenin son karakteri sayi olmali");
                count++;
            }
            if (password.length()<=8){
                System.out.println("sifre enaz 8 karakterli olmali");
                count++;

            }

            if (count==0){
                sifreGecerliMi=true;
                System.out.println("sifreniz basarili ile kaydedildi");
            }


        }





    }
}
