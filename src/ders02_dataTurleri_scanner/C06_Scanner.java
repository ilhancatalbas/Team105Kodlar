package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        // kullanicidanbir dikdortgenin iki kenar uzunlugunu alip
        // dikdortgenin alanini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin iki kenar uzunlugunu girin " +
                "\niki kenar uzunlugu arasinda enter' a basin");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("Dikdortgenin alani:" + (kenar1*kenar2));

    }
}
