package ders20_multiDimensionalArrays;

import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_ArrayList {

    public static void main(String[] args) {

        /*    ARRAY LISTS ' e giris

      ArrayList, dinamikve yeniden boyutlandirabilir bir array'dir.

      Array’in dezavantajlari uzunlugunu en basta belirlemek zorunda olmamiz ve
      uzunlugun sabit olmasidir. Sabit uzunluk esnek calismaya imkan tanimadigindan
      array liste tutmakta cok kullanilmaz.

      ArrayList array altyapisini kullanmakla beraber element ekleme ve silme islemlerine
      aciktir. Ancak array altyapisi sebebiyle eklemeleri birer birer yapabiliriz. ( veya
      uzunlugu belirli baska bir arrayList ekleyebiliriz)

 */

        Scanner scan = new Scanner(System.in);

        C06_KullaniciyaArrayOlusturma obj1= new C06_KullaniciyaArrayOlusturma();

        List <Integer>sayilar = new ArrayList<>();

        // 1- list primtive data kabul etmez
        // 2- List bir interface oldugu icin direk obje olusturulamaz
        //    onun yerine sag taraf ArrayList<> yazariz

        sayilar.add(4);
        sayilar.add(5);

        System.out.println(sayilar);  //[4, 5]


    }
}


