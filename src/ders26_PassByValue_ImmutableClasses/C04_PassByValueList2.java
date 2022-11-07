package ders26_PassByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList2 {

    public static void main(String[] args) {

        // bir method olusturalim.
        // methodda yeni bir liste olusturun.
        // Listeye sayilar listesindeki degerlerin 5 fazlasini element olrak atayin
        // sonra sayilar listesine deger olarak yeni List'i atayin
        // ve sayilar listesini yazdirin

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        yeniListDegeriAta(sayilar);

        System.out.println("method call'dan sonra main method'da sayilar List : " + sayilar);


    }

    public static void yeniListDegeriAta(List<Integer> sayilar){

        // bir method olusturalim.
        // methodda yeni bir liste olusturun.

        List<Integer> yeniList = new ArrayList<>();

        // Listeye sayilar listesindeki degerlerin 5 fazlasini element olrak atayin

        for (int i = 0; i < sayilar.size(); i++) {
            yeniList.add(sayilar.get(i)+5);
            
        }
        // sonra sayilar listesine deger olarak yeni List'i atayin

        sayilar= yeniList;

        // ve sayilar listesini yazdirin

        System.out.println("Method'da sayilar Listesinin son hali : " + sayilar);

    }
}

// C02 ile tek fark; sayilar= yeniList;         yani listenin tamamina yeni bir deger atadik. calisti ama degismedi
