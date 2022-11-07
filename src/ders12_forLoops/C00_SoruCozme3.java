package ders12_forLoops;

import java.util.Scanner;

public class C00_SoruCozme3 {

    public static void main(String[] args) {

        // kullanicinin verdigi sayinin rakamlar toplamini bulunuz

        Scanner scan = new Scanner(System.in);

        System.out.println("sayi gir");

        int sayi = scan.nextInt();;

        int birlerBasamgi = 0;
        int rakamlarToplami = 0;

        for (int i = 1; i <=4 ; i++) {

            birlerBasamgi = sayi%10;
            rakamlarToplami+=birlerBasamgi;
            sayi=sayi/10;
        }

        System.out.println(rakamlarToplami);


    }
}
