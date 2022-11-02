package ders18_arrays;

import java.util.Arrays;

public class C03_ArrayElementleriArtirma {

    public static void main(String[] args) {

        // Soru1- Verilen bir int array'in tum elemanlarini 2 arttirip bize donduren bir method olusturun.
        //        eski array'i yeni haliyle kaydedin

        int [] arr= {2, 4, 6, 8};

        for (int i = 0; i < arr.length; i++) {

            arr[i]=arr[i]+2;
        }                                            // sout'u for dongusunun icine yazarsan farkli sonuc elde edersin

        System.out.println(Arrays.toString(arr));    // [4, 6, 8, 10]

        // Soruda; eski array'i yeni haliyle kaydedin diyor. Ozaman biz yaptigimiz metodun basina arr= yaparsak eski array'i yeni haliyle atamis oluruz

        arr=elemntleri2Artir(arr);

        // method'u void yapmadigimiz icin yazdirmayacak. Ama gormek istersek sout ile yazdirabilir. Istege bagli

        System.out.println(Arrays.toString(arr));     // [6, 8, 10, 12]

    }

    // asagiya bir method olusturuyoruz

    public static int[] elemntleri2Artir(int[] arr){

        for (int i = 0; i < arr.length ; i++) {

            arr[i]=arr[i]+2;
        }

        return arr;
    }

}

// yukarida bir medtod olusuturduk. bu method bize dondurecek
