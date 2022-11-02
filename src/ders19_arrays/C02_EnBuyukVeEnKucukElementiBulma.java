package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukVeEnKucukElementiBulma {

    public static void main(String[] args) {

        // verilen bir int array'de en kucuk ve en buyuk sayilari yazdiran bir method olusturun

        // Mantik: siralariz; son element en buyuk elementtir. Ilk element en kucuk elementtir

        int[] arr = {3,8,1,5,2,9,23,-5};

        enBuyukEnKucukElementYazdir(arr);                                        // en son buraya metodumuz cagirdik. direk yazdirabiliriz.

    }

    public static void enBuyukEnKucukElementYazdir(int[] arr){                   // method bize bisey dondurekmi? hayir. yazdiracak. yazdiracagi icin void. sonra adi
                                                                                 // neyin enbuyuk ve enkucugunu yazdirak. int[] arr'yin. Yani parametre girmeliyiz

        Arrays.sort(arr);                                                        // arr array'ini siraladik

        System.out.println("En buyuk element : " + arr[arr.length-1]);           // bu en buyuk element (sondaki)
        System.out.println("En kucuk element : " + arr[0]);                      // buda en kucuk element (bastaki)

    }
}
