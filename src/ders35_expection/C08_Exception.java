package ders35_expection;

import java.util.Scanner;

public class C08_Exception {

    public static void main(String[] args) {

        // kullanicidan bir tam sayi alin
        // ve sayinin karesini yazdiran
        // kullanici ondalikli sayi girerse kullaniciya uyari yazisi yazdirip
        // tekrar sayi isteyen bir method olusturun

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi girin");

        int girilenSayi = scan.nextInt();

        System.out.println("Girdiginiz sayinin karesi : ");

        System.out.println(girilenSayi*girilenSayi);


    }
}
