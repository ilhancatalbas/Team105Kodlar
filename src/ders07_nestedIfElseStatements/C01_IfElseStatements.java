package ders07_nestedIfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {

    public static void main(String[] args) {

        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy)) vucut kitle endeksi
        // 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        // bize kullanicinin kilosu ve boyu lazim
        // ozaman kilo ve boy variable'larini girmemiz lazim

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Kg Olarak Kilonuzu Giriniz");
        double agirlik= scan.nextDouble();

        System.out.println("Cm olarak boyunuzu giriniz");
        double boy= scan.nextDouble();

        double vke= (agirlik*10000 / (boy*boy));
        System.out.println("'Vucut Kitle Endeksiniz " + vke);

        if (vke>30){
            System.out.println("Obez");

        } else if (vke>25) {
            System.out.println("Kilolu");
            
        } else if (vke>20) {
            System.out.println("Normal");

        } else if (vke>=0) {
            System.out.println("Zayifsiniz");

        }else {
            System.out.println("Yanlis Giris");
        }


    }


}
