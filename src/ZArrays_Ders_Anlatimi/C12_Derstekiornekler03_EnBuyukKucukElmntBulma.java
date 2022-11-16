package ZArrays_Ders_Anlatimi;

import java.util.Arrays;

public class C12_Derstekiornekler03_EnBuyukKucukElmntBulma {

    public static void main(String[] args) {

        // verilen bir int array'de en kucuk ve en buyuk sayilari yazdiran
        // bir method olusturun

        int [] arr = {3,8,1,5,2,9,4,40};

        enBuyuKEnKucukElementYazdir(arr);



    }

    public static void enBuyuKEnKucukElementYazdir (int [] arr){

        Arrays.sort(arr);                                                          // sort yaprak rakamlari kucukten buyuyge dogru siraladik

        System.out.println("En buyuk element : " + arr[arr.length-1]);
        System.out.println("En kucuk element : " + arr[0]);

        // mantik: array'leri kucukten buyuge siralariz once, sonra en bastaki en kucuk elementtir, en sondaki en buyuk elementtir
        //         length-1 ile en sondakini,  [0] index ilede en bastakini buluruz ve yazdiririz


    }
}
