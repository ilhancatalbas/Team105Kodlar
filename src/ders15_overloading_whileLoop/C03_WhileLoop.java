package ders15_overloading_whileLoop;

public class C03_WhileLoop {

    public static void main(String[] args) {

        // 2 basamakli sayilari aralarinda bir bosluk olacak sekilde yan yana yazdirin

        for (int i = 10; i <100 ; i++) {

            System.out.print(i + " ");

        }

        // while loop ile yaparsak

        int a=10;                             // baslangic sarti
                                              // while -iken demek. Ne iken devam edecek. a<100 oldugu muddetce devam edecek
        while (a<100){
            System.out.println();
            a++;                              // artis azalis miktarini yazmazsak sonsuz loop olusur. durmadan 10 -10 - 10 ... yazar dururdu.
                                              // ama boyle yapinca a'yi bir bir artiracak a<100 yani 99 olunca duracaktir.
        }
    }
}
