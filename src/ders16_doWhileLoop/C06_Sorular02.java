package ders16_doWhileLoop;

public class C06_Sorular02 {

    public static void main(String[] args) {

        // 10,11,12 sayilarini toplayan bir while loop olustururalim

        int sayi = 12;
        int toplam=0;


        while (sayi>=10){

            toplam+=sayi;
            sayi--;

        }

        System.out.println(toplam);
    }
}
