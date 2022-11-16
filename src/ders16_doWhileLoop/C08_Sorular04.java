package ders16_doWhileLoop;

import java.util.Scanner;

public class C08_Sorular04 {

    public static void main(String[] args) {

        /*Soru 2-Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
                 kontrol edin ve sifredeki hatalari yazdirin.
                 Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
                 sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
                  -Sifre kucuk harf icermelidir
                  -Sifre buyuk harf icermelidir
                  -Sifre ozel karakter icermelidir
                  -Sifre en az 8 karakter olmalidir.

         */


        Scanner scan = new Scanner(System.in);
        String sifre = scan.nextLine();
        int sayac = 0;
        boolean dogruMu= false;

        do {

            System.out.println("Lutfen bir sifre giriniz");

            for (int i = 0; i <sifre.length() ; i++) {

                if (sifre.charAt(i)>='a'  && sifre.charAt(i)<='z'){
                    System.out.println("Sifre kucuk harf icermelidir");
                    sayac++;
                    break;
                }
            }

            for (int i = 0; i < sifre.length(); i++) {

                if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){
                    System.out.println();
                    sayac++;
                    break;
                }

            }

            for (int i = 0; i < sifre.length(); i++) {

                if (sifre.charAt(i)>='0' && sifre.charAt(i)<='9'){
                    System.out.println();

                }

            }






        }while(dogruMu!=true);

        System.out.println("“Sifreniz Kabul edilmistir”");


    }
}
