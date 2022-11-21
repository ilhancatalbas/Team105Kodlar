package ders21_ArrayList_EKSIKK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_Sorular_BenimCozumum02 {

    // Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
    // bir liste olarak bize donduren bir method olusturun

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("L poz tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        if (girilenSayi<0){
            System.out.println("fibonacci serisi icin 0'den buyuk tam sayi girmelisin");
        }else if (girilenSayi==0){
            System.out.println("0'dan kucuk fibonacci sayisi yoktur");
        } else if (girilenSayi==1) {
            System.out.println("1'den kucuk tek fibonacci sayisi vardir. sifirdir");
        }else {
            fibonacciSayilariniYazdir(girilenSayi);
        }


    }

    public static void fibonacciSayilariniYazdir(int girilenSayi) {
        // buraya glediyse girilen sayi birden buyuktur

        List<Integer>fibonacciListesi = new ArrayList<>();
        fibonacciListesi.add(0);
        fibonacciListesi.add(1);
        fibonacciListesi.add(1);

        int yeniFibonacciSayisi =0;
        int index =3;  // ilk 3 eleman 0 1 1 oldugu icin 3. index'e geldik

        while (yeniFibonacciSayisi<girilenSayi){

            yeniFibonacciSayisi=fibonacciListesi.get(index-2) +fibonacciListesi.get(index-1);

            if (yeniFibonacciSayisi<girilenSayi){
                fibonacciListesi.add(yeniFibonacciSayisi);
            }
            index++;
        }

        System.out.println(fibonacciListesi);



    }


}
