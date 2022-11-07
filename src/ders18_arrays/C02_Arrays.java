package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {


        String [] arr = {"Ali", "Ulus", "Nesrin"};

        // bu array'in tum elementlerini aralarinda bir bosluk birakarak yazdiralim

        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i] + " ");                                               // arr'nin i inci elementlerini yazdir demis.
        }                                                                                 //arr i=0 oldugunda "Ali" yi getirecek. arr i=1 oldugunda "Ulus" getircek. arr i=2 oldugunda "Nesrin" getireecek



        // bu array'i array olarak yazdiralim

        System.out.println(arr);                                                                   // dersek arr'nin referansini yazdirir.

        // array bir obje / non-primitive bir data turu oldugundan java referansini yazdirir

        // Array'i array olarak yazdirmak isterseniz arrays class'indan yardim almalisiniz


        System.out.println(Arrays.toString(arr));         // yani Arrays'in hazir metodlarini kullandik. Arrays class'indan toString metodunu kullandik. parantezede yazdirmak istedigimiz variable yaziyoruz


//        NOT NOT: Control basip Arrays'in uzerine tiklarsak mouse ile arrays class'indaki hazir metodlari gorebiliriz

//        NOT: Elementleri yazdirmakla array'i yazdirmak farkli seylerdir.

//        GENEL NOT: biz bisey yazinca java bize devamini gosterdigi yerin solunda  c yaziyorsa bu class anlamina gelir.  m yaziyorsa method anlamina gelir.  vb

//        NOT: Array'i array olarak yazdirmak istedigimizde, Arrays class'indan yardim almamiz gerekiyor



    }
}
