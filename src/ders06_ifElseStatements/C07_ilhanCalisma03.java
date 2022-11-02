package ders06_ifElseStatements;

public class C07_ilhanCalisma03 {

    public static void main(String[] args) {


       // direk data turunune variable vererek yapma


        double not=49;

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