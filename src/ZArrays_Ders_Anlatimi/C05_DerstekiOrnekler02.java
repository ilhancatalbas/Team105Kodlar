package ZArrays_Ders_Anlatimi;

import java.util.Arrays;

public class C05_DerstekiOrnekler02 {

    public static void main(String[] args) {

        String [] arr = {"Ali", "Ulus", "Nesrin"};                                  // Ali Ulus Nesrin

        // Bu array'in tum elementlerini aralarinda bir bosluk birakarak yazdiralim.

        // elementleri yazdirmaktan bahsediyorsak, bir forLoop ollusturacagiz

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        // bu array'i array olarak yazdiralim

        System.out.println(arr);                                                   // [Ljava.lang.String;@566776ad
        // array bir obje / non primitive oldugundan java referansini yazdirir.


        // array'i array olarak yazdirmak isterseniz Arrays class'indan yardim almalisiniz
        System.out.println(Arrays.toString(arr));                                   // [Ali, Ulus, Nesrin]             buna overloading diyoruz.








        // array de data turunden sonra [] konur, sonra variable ismi yazilir = yapilir, sonra suslu parantezin icinde deger yazilir
        // array olsuturken once data turu yazilir, sonra [] konur, variable ismi yazilir, = konur, {} parantezin icine degerler yazilir,
        //array olustururken once data turu yazilir, [] konur, variable ismi yazilir, = konur sonra {} parantez icine degerler yazilir


    }
}
