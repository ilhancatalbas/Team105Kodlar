package ders16_doWhileLoop;

public class C07_Sorular03 {

    public static void main(String[] args) {

        // 10,11,12,13 sayilarini toplayan bir do while loop olustururalim       DO WHILE

        int sayi =10;
        int toplam = 0;

        do {

            toplam+=sayi;
            sayi++;

        }while (sayi<=13);

        System.out.println(toplam);

    }
}
