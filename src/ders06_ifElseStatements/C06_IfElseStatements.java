package ders06_ifElseStatements;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        /* if else statement'a {} (suslu parantez) kullanmazsan
        hem if body si hem else baody si icin sadece 1 satir kabul eder

        sonraki satirlar if-else ile ilisiklendirilmez. Her durumda calisir
        */

        System.out.println("Lutfen notunuzu giriniz");

        int not=46;

        if (not>=50){
            System.out.println("sinifi gectin");
            System.out.println("yazin kafan rahat");
        }else{
            System.out.println("kaldin");
            System.out.println("yaz okuluna bekleriz :)");


        }


    }
}
