package ders06_ifElseStatements;

import java.util.Scanner;

public class C09_IfElseStatements {

    public static void main(String[] args) {

        // kullanicaidan bir tam sayi alin
        // sayi negatifse gecersiz sayi
        // tek basamakli ise rakam
        // iki basamakli ise iki basamkli sayi
        // bunun disindaki sayilar icin buyuk sayi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        double sayi= scan.nextDouble();

        if (sayi<0){
            System.out.println("Negatif Sayi");

        } else if (sayi<10) {
            System.out.println("Rakam");

        }else if (sayi<100){
            System.out.println("iki basamakli sayi");

        }else{
            System.out.println("Buyuk Sayi");
        }


    }
}
