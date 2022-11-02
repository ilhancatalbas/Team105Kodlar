package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {


        String [] arr = {"Ali", "Ulus", "Nesrin"};

        // bu array'in tum elementlerini aralarinda bir bosluk birakarak yazdiralim

        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i] + " ");
        }



        // bu array'i array olarak yazdiralim

        System.out.println(arr);

        // array bir obje / non-primitive bir data turu oldugundan java referansini yazdirir
        // Array'i array olarak yazdirmak isterseniz arrays class'indan yardim almalisiniz

        System.out.println(Arrays.toString(arr));         // yani Arrays'in hazir metodlarini kullandik

//        NOT NOT: Control basip Arrays'in uzerine tiklarsak mouse ile arrays class'indaki hazir metodlari gorebiliriz



    }
}
