package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {
        // soru 7: (interview) - Kullanicidan iki sayi alip ikisinin degerlerini degistirin (swap).

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci tamsayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen 2. tam sayiyi giriniz");
        int sayi2= scan.nextInt();


        int bos;

        bos = sayi2;

        sayi2 = sayi1;

        sayi1 = bos;






    }
}
