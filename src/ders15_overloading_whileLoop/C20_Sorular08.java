package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C20_Sorular08 {

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

        System.out.println("Lutfen gecerli bir sifre giriniz, iyi kontrol ediniz");

        boolean iyiBaktinMi = false;
        int count=0;

        while (iyiBaktinMi !=true){


            String password = scan.nextLine();
            count=0;

            if (!(password.charAt(0)>='a' && password.charAt(0)<='z')){
                System.out.println("Dikkat eyle: Ilk harf kucuk olmali");
                count++;
            }
            if (!(password.charAt(password.length()-1)>='0' && password.charAt(password.length()-1)<='9')){
                System.out.println("Dikkat eyle: Son karakter rakam olmali");
                count++;

            }if (password.length()<8){
                System.out.println("Dikkat eyle daaa: en az 8 karakter olmali");
                count++;
            }
            if (count==0){
                iyiBaktinMi=true;
                System.out.println("ha soyle daa");

            }




        }


    }
}
