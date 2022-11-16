package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C22_Sorular10 {

    public static void main(String[] args) {

        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scan = new Scanner(System.in);

        int sayi = scan.nextInt();

        int birlerBasamagi=0;

        int toplam = 0;

        while (sayi!=0){

            birlerBasamagi=sayi%10;
            toplam +=birlerBasamagi;
            sayi/=10;
        }

        System.out.println(toplam);







        /* for (int i = 0; i <= rakamlar.length(); i++) {

           birlerBasamagi=sayi%10;
           toplam +=birlerBasamagi;
           sayi = sayi/10;

        }
        System.out.println(toplam);

         */


    }
}
