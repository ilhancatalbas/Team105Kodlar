package ders35_expection;

import java.util.Scanner;

public class C03_ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {

        // kullanicidan bir index isteyin
        // verilen bir array'den kullanicinin girdigi index'deki elementi yazdirin

        int [] arr = {3,4,6,7,8,2,3,5,6,8,9,1};

        Scanner sscan = new Scanner(System.in);

        System.out.println("Lutfen bir index giriniz");

        int index = sscan.nextInt();

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException hata) {

            System.out.println(hata.getMessage());     // Index 56 out of bounds for length 12
            hata.printStackTrace();
            //java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 12
            //	at ders35_expection.C03_ArrayIndexOutOfBoundsException.main(C03_ArrayIndexOutOfBoundsException.java:21)

            // javanin yazdigi tum hata mesajini verir ama kodlar caismaya devam eder
            // catch blogunda hicbir kod olmasada kodlarimiz normal calismaya devam eder
            // catch blogunda kullaniciya yazdiracagimiz mesaj
            // tamamen kod yazanin insiyatifindedir
            // exception class'indan hazir hata mesajlari da yazdirabilir
            // kendi istedigi .........
            // .......................

        }


    }
}
