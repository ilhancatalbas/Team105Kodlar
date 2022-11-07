package ders12_forLoops;

import java.util.Scanner;

public class C00_SoruCozme2 {

    public static void main(String[] args) {

        // kullanicinin verdigi sayinin faktoryelini bulalim   verdigi sayi 5 olsun

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int sayi= scan.nextInt();

        int faktoryel = 1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel=faktoryel*i;
        }
        System.out.print(faktoryel);


        // 1'den 100'e kadar (sinirlar dahil) olan sayilari toplayin

        int toplam = 0;

        for (int i = 1; i <=100 ; i++) {

            toplam+=i;
        }
        System.out.print(toplam);


    }
}
