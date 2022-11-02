package ders00_genel_Notlar;

import java.util.Scanner;

public class C04_Sorular03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        System.out.println("Lutfen Adinizi, Soyadniz ve yasinizi giriniz");
        String ad= scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        System.out.println("lutfen dogrulayiniz " + "adiniz : " + ad + " yasiniz : " + yas );






    }
}
