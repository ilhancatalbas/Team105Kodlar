package ders19_arrays;

import java.util.Arrays;

public class C04_BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,8,9,3,7,2,5,8,1};

        System.out.println(Arrays.binarySearch(arr,8));    //  7'da buldu
        System.out.println(Arrays.binarySearch(arr,5));    // -2'de buldu
        System.out.println(Arrays.binarySearch(arr,1));    //  0'da buldu
        System.out.println(Arrays.binarySearch(arr,9));    // -10'da buldu

        /*

        Binary search metodunun dogru sonuclar verebilmesi icin oncelikle sort method'u kullanilmalir

        sort() kullanilmadan binarySearch() ile yapilan aramanin sonucu belli olmaz
        dogru sonuc da verebilir, yanlis sonucada verebilir

         */

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));                                   // simdi once siraladik. sonra yukaridaki sout'lari copy past'la asagiya tekrar yazdiralim
                                                                                    // sonuclari tekrar gorelim

        System.out.println(Arrays.binarySearch(arr,8));    //  6'da buldu
        System.out.println(Arrays.binarySearch(arr,5));    //  4'de buldu
        System.out.println(Arrays.binarySearch(arr,1));    //  1'de buldu      // mukerer elemanlarda 2'inci 1'i vermesinin sebebini binarysearch'u izle youtube'dan :)
        System.out.println(Arrays.binarySearch(arr,9));    //  8'de buldu


        // array'de olmayan bir sayi aratirsak
        // java once o sayi array'de olsaydi nerede olurdu onu bulur
        // sonra buldugu bu SIRA'yi - isaretiyle ile verir

        System.out.println(Arrays.binarySearch(arr,-3));    // -1              // arrayda olmayan bir eleman aratirsak hep - verir
        System.out.println(Arrays.binarySearch(arr,4));     // -5              // olsaydi nerede olurdu
        System.out.println(Arrays.binarySearch(arr,10));    // -10
        System.out.println(Arrays.binarySearch(arr,100));   // -10




    }
}
