package calismaGrubu_day01;

import java.util.Scanner;

public class C02_KakHasan {

    public static void main(String[] args) {

        // soru 2 - kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin
        // kullanici o ve O yazdiginda output Ocak olsun

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");

        char ilkHraf = scan.next().charAt(0);

        if (ilkHraf=='o' || ilkHraf=='O'){
            System.out.println("Ocak");
        }

        if (ilkHraf=='S' || ilkHraf=='S'){
            System.out.println("Subat");
        }

        if (ilkHraf=='m' || ilkHraf=='M'){
            System.out.println("Mart & Mayis");
        }

    }


}
