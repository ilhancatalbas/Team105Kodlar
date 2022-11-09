package Sorular;

public class ders07_Soru01 {

    public static void main(String[] args) {

        // mesela deseydik ki 1'den 100' ekadar sayilari yazdirin
        // 2 basamakli 10 ile bolunebilen sayilari yazdirin.
        // tek tek bunlari yapmak cok zahmetli olacakti

        for (int i = 1; i <=100 ; i++) {

            System.out.print(i + " ");
        }

        System.out.println();




        for (int i = 10; i <100 ; i++) {

            if (i%7==0){

                System.out.print(i + " ");
            }
        }

        System.out.println();


        // kullanicinin verdigi sayinin faktoryelini bulalim   verdigi sayi 5 olsun

        int sayi = 5;

        int faktoryel=1;


        for (int i =sayi ; i >=1 ; i--) {

            faktoryel=faktoryel*i;
        }

        System.out.println(faktoryel);





    }
}
