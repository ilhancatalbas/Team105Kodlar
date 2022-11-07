package ders12_forLoops;

public class C03_faktoryel {
    public static void main(String[] args) {


        // kullanicinin verdigi sayinin faktoryelini bulalim
        
        int sayi = 10;

        int faktoryel = 1;                            // 1 etkisiz eleman. 0 deseydik carpinca hersey gidecekti

        for (int i = sayi; i >=1 ; i--) {             // soruya uygun dusunursek sayidan baslayip, 1'e kadar gidecegiz. Bu sebeble int i= sayi olacak. Gidecegimiz diger i ise 1'den buyuk olmak zorunda. kucuk olsa eksiye dogru gider
                                                      // sayidanda azalarak gidecegi icin  i--  olacak.  mesela sayi 10 olsun.
                                                      // herseferinde i ile faktoryel degerini carpicagiz. 10 kere 1 = 10     sonra 10 ile 9 capacagiz = 90   sonra 90 ile 8 capacagiz = 720  boyle bire kadar devam edecek
            faktoryel= faktoryel*i;                   // yani herseferinde faktoryel ile i'yi carpacagiz.    faktoryel= faktoryel*i
                                                      // ozetle: faktoryel ile sayiyi carpinca elde ettigimiz sonuc, bizim yeni faktoryel degerimiz oluyor. sonra yeni faktoryel degerimiz ile sayiyi bir azaltarak bidaha carpiyoruz
        }                                             // bu en yeni faktoryel degerimiz oluyor. bunu 1 ile carpana kadar devam ettirecegiz
                                                      // sout'u for loop disina yazdirmamiz lazim. yoksa her carpimin sonucu bize tek tek (10 kere) yazdirir.

        System.out.println(faktoryel);




        System.out.println();



        // 1'den 100'e kadar (sinirlar dahil) olan sayilari toplayin

        int toplam = 0;

        for (int i = 1; i <101; i++) {

            toplam = toplam + i;
                                           //toplami buraya for loop'un icine yazsaydik tek tek yazacakti bize
        }

        System.out.print(toplam);         // buraya yazinca sadece sonucu yazdirdi. for'un icine yazsaydik sout'u, her toplamdan sonra sonucu yazdiracakti.






    }
}
