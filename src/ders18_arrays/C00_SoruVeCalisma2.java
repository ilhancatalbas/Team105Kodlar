package ders18_arrays;

import java.util.Arrays;

public class C00_SoruVeCalisma2 {
    public static void main(String[] args) {

        // Soru1- Verilen bir int array'in tum elemanlarini 2 arttirip bize donduren bir method olusturun.
        //        eski array'i yeni haliyle kaydedin

        int [] arr= {2, 4, 9, 13};

        for (int i = 0; i < arr.length; i++) {

            arr[i]+=2;

        }

        // arrayin elemanlarini yazdir

        for (int i = 0; i <arr.length; i++) {

            System.out.print(arr[i]+" ");
        }

        System.out.println();

        String[] arr1 = {"Ali", "Ulus", "Nesrin"};
        // arayin elementlerini yazdir

        for (int i = 0; i <arr1.length; i++) {

            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(arr1));

    }
}
