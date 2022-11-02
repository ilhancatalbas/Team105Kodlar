package ders07_nestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        // ana degisken yas olsun (bir onceki derse gore) !!!!!!


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz" );
        double yas= scan.nextDouble();

        System.out.println("Lutfen Cinsiyeti giriniz E/K");
        char cinsiyet= scan.next().charAt(0);

        if (yas<15){
            System.out.println("Hatali Yas Girisi");

        } else if (yas<60) {
            // emekli olamaz calismasi gereken sure yasa bagli
            System.out.println("Emekli olamazsin");
            if (cinsiyet=='k' || cinsiyet=='K'){
                System.out.println("calisman gereken sure " + (60-yas) + "yil");
            } else if (cinsiyet=='e' || cinsiyet=='E') {
                System.out.println("daha " + (65-yas) + "calismalisin");

            }else {
                System.out.println("Hatali Cinsiyet Girisi");
            }

        } else if (yas<65) {
            // kadin emekli olabilir, erkek calismasi lazim
            if (cinsiyet=='k'|| cinsiyet=='K'){
                System.out.println("Ememkli olabilirsin");
            } else if (cinsiyet=='e'|| cinsiyet=='E') {
                System.out.println("daha " + (65-yas) + " calismalisin");

            }else {
                System.out.println("Hatali cinsiyet Girisi");
            }

        }else {
            System.out.println("Emekli Olabilirsin");
        }


    }
}
