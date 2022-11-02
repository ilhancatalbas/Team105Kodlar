package ders12_forLoops;

public class C03_faktoryel {
    public static void main(String[] args) {


        // kullanicinin verdigi sayinin faktoryelini bulalim
        
        int sayi = 10;

        int faktoryel = 1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel= faktoryel*i;

        }

        System.out.println(faktoryel);



        System.out.println();



        // 1'den 100'e kadar (sinirlar dahil) olan sayilari toplayin

        int toplam = 0;

        for (int i = 1; i <101; i++) {

            toplam = toplam + i;
                                           //toplami buraya for loop'un icine yazsaydik tek tek yazacakti bize
        }

        System.out.print(toplam);         // buraya yazinca sadece sonucu yazdirdi






    }
}
