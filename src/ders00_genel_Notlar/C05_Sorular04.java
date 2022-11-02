package ders00_genel_Notlar;

import java.util.Scanner;

public class C05_Sorular04 {

    public static void main(String[] args) {


        // Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        int bos;

        bos = sayi2;

        sayi2 = sayi1;

        sayi1 = bos;

        System.out.println("sayi1'in degeri : " + sayi1);
        System.out.println("sayi2'in degeri : " + sayi2);






    }
}
