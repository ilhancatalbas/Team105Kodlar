package ders19_arrays;

import java.util.Arrays;

public class C06_ArrayeYeniDegerAtama {

    public static void main(String[] args) {

        String str="java";                                // stringe yeni bir deger atayabiliriz
        str="hava";                                       // bu sadece atayabilecigimizin ornegi


        /*
        varolan bir array in uzunlugu degistirilemez
        AMA
        varolan bir array'e yeni bir array degeri atayabiliriz
         */

        //1- var olan bir array'i yeni deger olarak atayabiliriz (asagidaki ornek)

        String[] arr1={"Ali", "Veli"};                    // buarada array'e yeni bir deger atamadik. varolan arry'i degistirdik.
        String[] arr2={"A","B","C"};                      // toyota ornegi: eski arabasini aldik, ona yeni bir araba verdik. yine o adamain arabasi ama artik farkli araba

        arr1=arr2;

        System.out.println(Arrays.toString(arr1));         // [A, B, C]

        //2- istedigimiz uzunlukta yeni bos bir array degeri atayabiliriz

        arr1=new String[6];                                // uzunlugu 6 olan bos bir array atadik. 6 tane nul gorucez
        System.out.println(Arrays.toString(arr1));         // [null, null, null, null, null, null]

        // 3- Yeni olusturulan bir array'e {} icinde deger yazarak atama yapabiliriz
        //    ancak var olan bir array'e yeni deger atamasi icin {} KULLANILAMAZ

        // arr1={"g","h"};       // olmaz                   // varolan bir array sanki ilk defa deger atiyormusuz gibi deger atayamayiz


        int arr[]={3,4,5};                                  // ilk defa olusturdugumuz array. java kabul eder. var olan array'e ust satirdaki gibi yeni bir array atanamaz








    }


}
