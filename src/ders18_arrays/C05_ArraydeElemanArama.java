package ders18_arrays;

public class C05_ArraydeElemanArama {

    public static void main(String[] args) {

        //soru 4- verilen bir array'de istenen bir elemanin var olup olmadigini ve
        // varsa kac kere kullanildigini yazdiran bir method olusturun

        int[] arr= {1,2,4,5,3,6,7,4,2,3,5,1,3,2};

        int arananEleman=2;                                     // bize bir tanede int aranan element lazim. mesela 2 kac tane oldugunu yazdirsin

        elemanAra(arr,arananEleman);             //3            // en son yaptigimiz metodu buraya yazdik. sonucu gorduk. sout'a void oldugu icin gerek gormedik
    }                                                           // donduren deseydi return yapacaktik
                                                                // elemanAra'daki parametre sayisina baktigimizda; hangi array'de hangi elemani arayacagiz
                                                                // methodu yapaken bunu tanimlamamiz lazim. main method'da var scope farkli. Method olustururken yazmamaiz lazim
                                                                // bize methoda lazim cunku scope'lari farkli.



    public static void elemanAra(int[] arr, int arananEleman){             // bu parametre isimleri ayni olmak zorunda degil. genelde aynisini kullaniriz

        // kac tane diye soruyor. bu sebebten sayac yaptik. ilk elemana bakacagiz aranan eleman degilse sallicaz. sonrakine bakacagiz eger aranan elemansa sayaci bir artiracagiz

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {                    // contains olmaz bunda cunku array da contain methodu yok.

            if (arr[i]==arananEleman) {
                sayac++;                                          //arr[i] eger aranan elmansa sayac'i (count'u) bir artiracak
            }
        }

        if (sayac==0){                                            // eger sayac sifirsa sayac kullanilmamis aranan sayi array de yok
            System.out.println("Aranan sayi array'de yok");

        }else {
            System.out.println("Aranan " + arananEleman + " sayisi, array'de " + sayac + " kere kullanilmis");

        }


    }
}
