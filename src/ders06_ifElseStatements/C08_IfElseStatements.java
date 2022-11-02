package ders06_ifElseStatements;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("LUTFEN KENAR UZUNLUGUNU GIRINIZ");

        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1<=0 || kenar2<=0 || kenar3<=0){
            System.out.println("Gecersiz Kenar uzunlugu");

        } else if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("eskenar ucgen");

        }else{
            System.out.println("Eskenar ucgen degil");
        }


    }


}
