package ders12_forLoops;

public class C02_ForLoops {
    public static void main(String[] args) {


        // 2 basamakli sayilardan 7 ile bolunebilenleri yan yana yazdirin
        for (int i = 10; i <100; i++) {        // i%7==0
            if (i%7==0){
                System.out.print(i + " ");
            }
        }


        System.out.println("");       // bu yaptigimiz sorular karismasin diye.


        // 13'den baslayip,  100'e kadar 7 ser 7 ser yazdirin
        for (int i = 13; i <=100 ; i+=7) {
            System.out.print(i + " ");
        }


        System.out.println();


        // 1'den 10'na kadar (sinirlar dahil) sayilarin karelerini yazdirin
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i*i + " ");
        }

        // kullanicinin verdigi sayinin faktoryelini bulalim

        int sayi = 5;

        int faktoryel = 1;

        for (int i = sayi; i >=1; i--) {
            faktoryel=faktoryel*i;
        }
        System.out.println(faktoryel);

    }
}
