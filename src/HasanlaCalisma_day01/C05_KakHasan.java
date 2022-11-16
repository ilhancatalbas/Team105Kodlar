package HasanlaCalisma_day01;

import java.util.Scanner;

public class C05_KakHasan {

    public static void main(String[] args) {

        // kullanicidan notunu isteyin. eger not

        // 0-40 arasi ise "FF / kaldiniz"
        // 41-50 arasi ise "DD / kosullu gectiniz"
        // 51-70 arasi "CC / orta"
        // 71-85 arasi ise "BB / iyi"
        // 86-100 arasi ise "AA / cok iyi" yazdirin

        // diger rakli rakamlari gecersiz rakam girisi yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        int not= scan.nextInt();


        if (not>=0 && not<=40){
            System.out.println("kaldiniz");
        } else if (not>=41 && not<=50) {
            System.out.println("ff");
        } else if (not>=51 && not<=70) {
            System.out.println("cc");
        } else if (not>=71 && not<=85) {
            System.out.println("bb");
        } else if (not>=86 && not<=100) {
            System.out.println("aa");
        }  else {
            System.out.println("gecerli not gir");
        }


    }
}
