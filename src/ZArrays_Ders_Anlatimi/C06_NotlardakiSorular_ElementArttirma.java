package ZArrays_Ders_Anlatimi;

import java.util.Arrays;

public class C06_NotlardakiSorular_ElementArttirma {

    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //         olusturun. Eski array’i yeni haliyle kaydedin.


        int [] arr = {2, 4, 7, 13, 21};

        for (int i = 0; i < arr.length; i++) {

            arr [i] = arr[i] + 2;                               // arr'nin i'inci index'i = arr'nin i'inci indexine + 2 ekle dedik. arr'yin degerini yeniden olusturduk

        }

        System.out.println(Arrays.toString(arr));              // [4, 6, 9, 15, 23]

        arr=elemntleri2Artir(arr);                             // Eski array’i yeni haliyle kaydedin dedigi icin arr'ye atama yaptik.

        System.out.println(Arrays.toString(arr));              // yazdirdigimizda   [6, 8, 11, 17, 25]

    }

    public static int [] elemntleri2Artir(int [] arr){           // main method'ta calisabilmesi icin statik olmasi lazim. bize int bir array dondurecek.
                                                                 // parametre lazim. biz kendi array'imizi ona verecegiz ki oda bize yeni elementleri ona atasin
        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i]+2;
        }

        return arr;
    }




}
