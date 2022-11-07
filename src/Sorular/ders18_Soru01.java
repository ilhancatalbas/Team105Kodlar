package Sorular;

import java.util.Arrays;

public class ders18_Soru01 {

    public static void main(String[] args) {

        // Soru1- Verilen bir int array'in tum elemanlarini 2 arttirip bize donduren bir method olusturun.
        //        eski array'i yeni haliyle kaydedin


        int [] arr= {2, 4, 9, 13};

        elementleri2Artir(arr);

        System.out.println(Arrays.toString(arr));


    }


    // method olusturarak yapmak icin;

    public static int[] elementleri2Artir (int[] arr){

        for (int i = 0; i <arr.length; i++) {

            arr[i]=arr[i]+2;

        }
        return arr;
    }
}
