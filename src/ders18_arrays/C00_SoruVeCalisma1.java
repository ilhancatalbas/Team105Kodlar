package ders18_arrays;

import java.lang.reflect.Array;

public class C00_SoruVeCalisma1 {

    public static void main(String[] args) {


        // arr1 in 3. indexini 20 yap

        // arr'in lenght gosteriniz

        // arr1'in son elementini yazdirin

        // arr1'in tum elementlerini yazdir

        // arr1'de 6 yi sil 5 yap

        //

        int[] arr1 = {2, 4, 6, 8, 10};

        arr1[3]=20;                                       // 3. index 20 oldu

        System.out.println(arr1.length);                  // uzunlugu 5

        System.out.println(arr1[arr1.length-1]);          // son element'i 10

        for (int i = 0; i < arr1.length; i++) {           //

            System.out.print(arr1[i] + " ");
        }

        String [] arr = {"Ali", "Ulus", "Nesrin"};

        // bu array'in tum elementlerini aralarinda bir bosluk birakarak yazdiralim




    }
}
