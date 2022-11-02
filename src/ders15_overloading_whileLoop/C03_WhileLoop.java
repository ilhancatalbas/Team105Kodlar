package ders15_overloading_whileLoop;

public class C03_WhileLoop {

    public static void main(String[] args) {

        // 2 basamkli sayilari aralarinda bir bosluk olacak sekilde yan yana yazdirin

        for (int i = 10; i <100 ; i++) {

            System.out.print(i + " ");

        }

        // while loop ile yaparsak

        int a=10;

        while (a<100){
            System.out.println();
            a++;                              // artis azalis miktarini yazmazsak sonsuz loop olusur

        }
    }
}
