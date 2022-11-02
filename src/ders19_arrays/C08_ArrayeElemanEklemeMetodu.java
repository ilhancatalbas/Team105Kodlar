package ders19_arrays;

import java.util.Arrays;

public class C08_ArrayeElemanEklemeMetodu {

    public static void main(String[] args) {

        // verilen bir int array'e istene bir elementi ekleyip
        // yeni halini bize donduren bir method olusturun

        int[] abc={3,5,8,9,7,12};
        int ekeleneceSayi = 1;

        abc = arrayeElemanEkle(abc,ekeleneceSayi);                           // enson bu hazirladigimiz metodu buraya cagirirak kullaniyoruz

        System.out.println(Arrays.toString(abc));


    }
    public static int[] arrayeElemanEkle (int[] eklenecekArr, int eklenecekSayi){

        int[] yeniArr = new int[eklenecekArr.length+1];                                   // bunun uzunlugu eski arrayin bir fazlasi olacak. suan sifirlardan yeni arrayimiz olustu

        for (int i = 0; i < eklenecekArr.length; i++) {                                   // // for loopla eski arryi yeni arraye tasiyacagiz. eklenecekArr'nin length'ine kadar gidecegiz

            yeniArr[i] = eklenecekArr[i];                                                 // yeni arrayin i inci degeri eski arrayin ayni elementinin degeri olsun
                                                                                          // 3 5 8 9 u ekledik. sonda bir sifir kladi. onada 1 i eklicez
        }

        yeniArr[yeniArr.length-1]= eklenecekSayi;

        return yeniArr;                                                                   // metodumuz hazir. hangi class dan calsitirirsak calistirilam calisir

    }




}
