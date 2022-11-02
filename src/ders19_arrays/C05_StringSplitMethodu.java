package ders19_arrays;

import java.util.Arrays;

public class C05_StringSplitMethodu {

    public static void main(String[] args) {

        String str = "java gercekten cok cok guzel";

        // verilen stringte kac tane e harfi oldugunu bulunuz

        // mantik: e'ye gore ayiririz. kac parcaya boluyorsa ona gore bulabiliriz

        String[] eArrayi= str.split("e");

        System.out.println(Arrays.toString(eArrayi));
        System.out.println(eArrayi.length);

        System.out.println("metindeki e sayisi : " + (eArrayi.length-1));


        // 2. yontem
        // String'i "" ile split yaparak karakterlerine ayiralim

        String[] tumKarakterlerArr= str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr));              // once hiclikle tum karakterlrine ayirdik

        int sayac=0;                                                         // bir sayac olusturduk
        // bir loop ile tum karakterleri kontrol edelim

        for (int i = 0; i < tumKarakterlerArr.length; i++) {                 // sifirdan bizim tumakarakterlerimizin uzunluguna kadar

            if (tumKarakterlerArr[i].equals("e")) {                          // tumkarakterlerArr'nin i'inci elementi e'ye esit ise sayaci 1 artir diyecegiz
                sayac++;
            }
        }

        System.out.println("metindeki e sayisi : " + sayac);                 // en sonda yazirip gorecegiz

    }
}

         // Diger bir mantik: bir substring olusturulur. for loop olusturulur. e'ye esit olanlari sayac'la sayilabilir