package ders11_stringManipulations;

import java.util.Scanner;

public class C06_Soru {

    public static void main(String[] args) {

        // Kullanicidan bir cumle alin
        // - cumlede ev geciyorsa, "home home sweet home" yazdirin
        // - cumlede is geciyorsa, "calismak guzeldir"
        // - ikisini de iceriyorsa "Hem ev lazim hem is"
        // - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        // burada buyuk kucuk harf duyarliligi olacaktir.
        // ikinci bir string yaparal towercase le butun cumleyi kucuk harfe cevirdik



        System.out.println("Lutfen bir cumle giriniz");

        String str = "HEMEN EVE GELDIM HERKES ISE GITMIS";

        String strkucuk = str.toLowerCase();

        System.out.println(strkucuk);
        
        if (strkucuk.contains("ev") && strkucuk.contains("is")){
            System.out.println("Hem ev lazim hem is");
        
        } else if (strkucuk.contains("ev")) {
            System.out.println("home home sweet home");
            
        } else if (strkucuk.contains("is")) {
            System.out.println("calismak guzeldir");

        }else {
            System.out.println("cok calisman lazim");
        }


    }


}
