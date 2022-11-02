package ders00_genel_Notlar;

import java.util.Scanner;

public class C03_Sorular02 {
    public static void main(String[] args) {

        /*Soru 3-Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
                 Isminiz : John
                 Soyisminiz : Doe
                 Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.    */

        Scanner scan = new Scanner(System.in);

        System.out.println("isminizi griniz");
        String isim = scan.nextLine();

        System.out.println("Soyisminizi griniz");
        String soyIsim = scan.nextLine();

        System.out.println("Yasinizi griniz");
        double yas = scan.nextDouble();

        System.out.println("Kaydiniz basariyla alinmistir");


        // soru-4 Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.

        System.out.println("kenar uzunluklarini giriniz");

        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();

        System.out.println("dikdortgenin alani : " + kenar1*kenar2);

        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        System.out.println("lutfen adini ve soyadini giriniz");
        String isimx = scan.nextLine();

        System.out.println("lutfen yasinizi giriniz");
        double yasy= scan.nextDouble();

        System.out.println("girilen bilgiler : " + "\nadiniz : "+ isimx + "\nSoyadiniz : " + yasy);















    }


}
