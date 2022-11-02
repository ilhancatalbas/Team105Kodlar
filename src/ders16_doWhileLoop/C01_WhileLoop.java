package ders16_doWhileLoop;

public class C01_WhileLoop {

    public static void main(String[] args) {

        // 10,11,12 sayilarini toplayan bir while loop olustururalim

        int sayi = 10;
        int toplam=0;

        while(sayi<=12){

            toplam +=sayi;

            sayi++;

        }

        // while loop da once kontrol sonra islem yapilie

        // while loop'da 2 problem olusabilir
        // 1 - once degeri kontrol edip; sonra islem yaptigimizdan body'de bir kere daha kontrol etmemiz gerekebilir
        // 2- yapilan islem sayisindan bir fazla while bitis sarti kontrol edilir
        // 3- while loop oncesinde degerleri kontrol edecegimiz bir variable olusturuyorsak ona yapacagimiz atamayi dikkatli yapmamiz gerekir
        //    yanlis deger atamasi yapmak bazen while loop'u calismamasina neden olabilir



    }
}