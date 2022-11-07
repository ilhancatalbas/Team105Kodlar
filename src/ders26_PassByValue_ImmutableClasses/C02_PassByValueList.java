package ders26_PassByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {

    public static void main(String[] args) {

        // bir method olusturalim ve method'da List'deki sayilari 5 artiralim
        // ve method'da listenin son halini yazdiralim

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        elementleri5Artir(sayilar);
        elementleri5Artir(sayilar);
        elementleri5Artir(sayilar);

        // method call sonrasi main method icerisinde List'i tekrar yazdiralim

        System.out.println("Method call sonrasi main method'da List : " + sayilar);

                                                                                        // yani listte yaptigimiz degisiklikler kalici oldu

    }

    public static void elementleri5Artir (List<Integer> sayilar){

        for (int i = 0; i < sayilar.size(); i++) {

            sayilar.set(i, sayilar.get(i) +5 );              // get getiriyor, set'de update ediyor
                                                             // set soyle calisiyor; index'i yaziyorduk ve yeni degeri yaziyorduk.
                                                             // index'imiz   i  , yeni deger eski degerin 5 fazlasi

        }

        System.out.println(sayilar);


    }
}
