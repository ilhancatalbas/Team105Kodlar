package ders19_arrays;

import java.util.Arrays;

public class C07_ArrayeYeniEkleme {

    public static void main(String[] args) {

        int[] arr= {2,4,6};

        // bu array'e 4. element olarak 8 ekleyelim                                   // 8 de orada olacak sekilde yeni bir array olustururz


        /*
        var olan bir array'e yeni eleman eklenemez
        ama yeni deger atanabilir

        once int[] arr2= [2,4,6,8]  seklinde yeni bir array olusturup
        sonra arr2 degerini arr'ye atabiliriz

         */

        // yeni array olustururalim
        // arr2'e konulacak tadalarin turu
        // uzunlugu ise eski array'n uzunlugunun 1 fazlasi

        int[] arr2= new int[arr.length+1];          // [0, 0, 0, 0]                   // eski arrayin degerlerini yeni array'e atayacagiz. for loop la yapacagiz

        for (int i = 0; i <arr.length ; i++) {                                        // uzunlugu arr kadar olacak

            arr2[i] = arr[i];                                                         // yeni arr2'in i'inci indexindeki degeri eski arr'in i'inci indexindeki degere ata

        }

        System.out.println(Arrays.toString(arr2));     //[2, 4, 6, 0]                 // for loop bittiginde arrayi yazdirirsak. eski array'i degerleri yeni arraye atadik.bir tane bos kaldi.
                                                                                      // yeni array'e son indexe eklemek istedigim elementi atayacagim. bize verilen degeri
        arr2[arr2.length-1]=8;                                                        // arr2 nin son arr2.length-1  ine bize verilen degeri atayacagiz

        System.out.println(Arrays.toString(arr2));     //eski array'i yeni arraye atadik.

        // arr array'ine yeni deger olarak olusturduguuz arr2'yi atayacagiz

        arr=arr2;                                                                       // yazdirip gorelim atanmismi

        System.out.println("arr'nin son hali : " + Arrays.toString(arr));              // [2, 4, 6, 8]     olmus







    }
}
