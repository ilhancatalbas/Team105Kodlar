package ders22_arraysList;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoop {

    public static void main(String[] args) {

        //soru3 verilen bir String array'deki her bir elementi kontrol edip
        //  - kelimenin uzunlugu cift sayi ise ilk yarisini
        //  - kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //  yeni bir listeye ekleyip yazdirin

        String[] arr = {"Sumeyra","Mehmet","Ekrem","Yilmaz","Ayse"};

        List<String> yeniList = new ArrayList<>();

        // herbir elemani kontrol etmek icin for each loop olusturcaz

        for (String each: arr    // arr deki herbir stringi bana getir dedik. napicaz kelimenin uzunluguna bkicaz
             ) {

            if (each.length() %2==0)     {                         // gelen gelimemnin uzunlugu cift ise bu olsun

            yeniList.add(each.substring(0,each.length()/2));       // bunu yeni listeye ekledik
            }else {                                                // degilse bu olsun

                yeniList.add(each.substring((each.length()-1)/2));     //

            }

        }

        System.out.println(yeniList);

    }
}
