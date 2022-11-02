package ders20_multiDimensionalArrays;

public class C06_MDA_Soru {

    public static void main(String[] args) {

        // Soru 5- Verilen 2 katli bir array’de her bir inner array’in
        //         son elementlerinin toplaminini yazdiran bir method olusturun.

        // Tavsiye: bu tip sorularda once bir manuel yazmak daha iyi anlamayi kolaylastirirabilir

        // aciklama: mesele [5,7] nin sonucu elementi nedir?  arr[0][arr[0].length-1] dir

        int[][] arr= {{5,7}, {5,8,9}, {0,1}};

        sonElementleriTopla(arr);


    }

    public static void sonElementleriTopla (int[][] arr){

        int toplam = 0;                                               // toplam dedi soruda. herzamanki gibi   toplam=0   i olusturduk

        for (int i = 0; i < arr.length; i++) {

            toplam+= arr[i][arr[i].length-1];                         // arr i'nin length'i -1  (i'inci elementin son index yani) bunuda toplama ekleyecegiz
        }

        System.out.println("elementler toplami : " + toplam);         // yukari git metodu cagir


    }
}
