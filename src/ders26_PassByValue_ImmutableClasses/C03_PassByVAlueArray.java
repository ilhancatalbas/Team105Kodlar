package ders26_PassByValue_ImmutableClasses;

import java.util.Arrays;

public class C03_PassByVAlueArray {

    public static void main(String[] args) {

        // verilen bir array'in elemntlerini 5 artirip
        // sonra yazdiran bir method olusturun

        int[] arr = {3,4,5};

        elementleri5Artir(arr);
        elementleri5Artir(arr);
        elementleri5Artir(arr);

        System.out.println("method call'dan sonra main method icinde arr : " +Arrays.toString(arr));


    }

    public static void elementleri5Artir(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            arr [i] = arr[i] + 5;                                               //arr'nin  i  inci indexindeki element esittir, arr nin i  inci elementteki eski degeri  +  5

        }

        System.out.println(Arrays.toString(arr));
    }
}
