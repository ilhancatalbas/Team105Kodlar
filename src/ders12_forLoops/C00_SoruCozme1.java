package ders12_forLoops;

public class C00_SoruCozme1 {

    public static void main(String[] args) {

        // mesela deseydik ki 1'den 100' ekadar sayilari yazdirin
        // 3 basamakli 23 ile bolunebilen sayilari yazdirin.
        // tek tek bunlari yapmak cok zahmetli olacakti

        for (int i = 1; i <51 ; i++) {

            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 100; i <=150 ; i++) {

            if (i%5==0){

                System.out.print(i+ " ");}
        }

        System.out.println();

        // 2 basamakli sayilardan 7 ile bolunebilenleri yan yana yazdirin

        for (int i = 10; i <=99 ; i++) {

            if (i%7==0){

                System.out.print(i + " ");
            }
        }

        System.out.println();

        // 13'den baslayip,  100'e kadar 7 ser 7 ser yazdirin

        for (int i = 13; i <=100 ; i+=7) {

            System.out.print(i + " ");
        }

        System.out.println();

        // 1'den 10'na kadar (sinirlar dahil) sayilarin karelerini yazdirin

        for (int i = 1; i <=10 ; i++) {

            System.out.print(i*i + " ");
        }

        System.out.println();



    }
}


