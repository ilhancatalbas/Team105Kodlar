package ders22_arraysList;

import java.util.Arrays;
import java.util.List;

public class C03_ArraysAsList {

    public static void main(String[] args) {


        Integer[] arr = {1,2,3,};

        // verilen bir array'i liste cevirmek icin
        // bir list olusturup, for loop ile elementleri tasimayi TAVSIYE ETMIYORUZ

        List<Integer> arraydenList = Arrays.asList(arr);

        System.out.println(arraydenList); //[1, 2, 3]

        // bi yomtemin 2 negatif yonu vardir
        // 1- bu sekilde olussrulan List'ler esnek uzunluga sahip degildir
        //    add, remove gibi ozellikler kullanmak isterseniz RunTimeException olusur

        arraydenList.add(10); // UnsupportedOperation.....................................................

    }
}
