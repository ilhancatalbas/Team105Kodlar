package ders06_ifElseStatements;

import java.util.Scanner;

public class C07_ilhanCalisma02 {

    public static void main(String[] args) {

        // scaner ile yapimi

        Scanner scan = new Scanner(System.in);
        System.out.println("LUTFEN NOTUNUZU GIRINIZ");

        double not= scan.nextDouble();

        if (not>=85){
            System.out.println("Notunuz AA");
            System.out.println("Tebrikler");

        } else if (not>=65) {
            System.out.println("Notunuz BB");
            System.out.println("Guzel");

        } else if (not>=50) {
            System.out.println("Notunuz CC");
            System.out.println("Ha gayret");

        } else if (not>=0) {
            System.out.println("Notunuz DD");
            System.out.println("Sinifta Kaldiniz");

        }


    }
}
