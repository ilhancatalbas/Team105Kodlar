package ders06_ifElseStatements;

import java.util.Scanner;

public class C06_zz_ilhanCalisma01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        int not= scan.nextInt();


        if (not>=50){
            System.out.println("Dersten gectiniz");
            System.out.println("TEBRIKLER");
        }else{
            System.out.println("Kaldiniz");
            System.out.println("Tekrar Deneyiniz");
        }




    }
}
