package ders22_arraysList;

public class C04_ForEachLoop {

    public static void main(String[] args) {

        int[] arr = {3,5,7,8,4,2,6,9,6,4,5};

        // bu array deki 5'den buyuk olan tum elementleri toplayalim                          // cozumde: arr i 5'den buyuk mu diye birde if koyacagiz

        int toplam = 0;

        for (int i = 0; i <arr.length; i++) {

            if (arr[i]>5){
                toplam+= arr[i];
            }
        }

        System.out.println("for loop ile : "+ toplam);


        // for each loop la daha basit bir kurgu ile calisir
        // for-each loop'a 3 seyi soylememiz lazim
        // 1- hangi data turunde degiskenle ugrasacaksiniz
        // 2- loop'un icerisinde  her bir eleman geldiginde hangi isimle islem yapacaksiniz
        // 3- hangi bir array veya collection'dan elemanlar gelecek

        toplam=0;

        for (int each: arr                   // yani turkcesi: arr'ye gir herbir int'i bana getir.   kenarda kalan olmayacak herkes asilanacak (asi ornegi)
             ) {                             // arr'ye gittim, herbir int'a gittim, getirilen sayi 5 den buyukse toplama ekledim    demek
                                             // indexlerle ugrasmiyoruz anlamasi daha kolay. Dezavantaji: index yapisi olmadiginda bastan sona sondan basa gibi komutlar veremeyiz. genelde bastan baslar
            if (each>5){
                toplam+= each;
            }
        }

        System.out.println("for each loop ile toplam : "+ toplam);

    }
}
