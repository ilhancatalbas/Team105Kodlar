package ders08_ternarySwitch;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {

        // J: java
        // D: Devolepment
        // K: Kit

        // Kullaicidan bir harf alin. Alinan harf J, D, K, biri isi yukaridaki kelimelerden yazdirin
        // bu harflerden biri degilse "Gecersiz Harf" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin");
        char harf=scan.next().charAt(0);

        switch (harf){

            case 'J' :
            case 'j' :
                System.out.println("Java");
                break;
            case 'D' :
            case 'd' :
                System.out.println("Devolepment");
                break;
            case 'K' :
            case 'k' :
                System.out.println("Kit");
                break;
            default:
                System.out.println("Gecersiz Harf");

                // switch in icine tum data turlerini yazamayiz


        }

    }

}
