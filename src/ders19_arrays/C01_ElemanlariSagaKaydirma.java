package ders19_arrays;

import java.util.Arrays;

public class C01_ElemanlariSagaKaydirma {

    public static void main(String[] args) {

        // soru 3 - verilen bir array'deki tum elementleri bir saga kaydirip,
        // sondaki elementi basa tasiyacak bir method olusturun,
        // array'i yeni haliyle kaydedin/
        // ornek input: [4,5,6,7]   array'in son hali: [7,4,5,6]

        // yapacagimiz is su: 6 yi 7 nin yerine, 5'i 6'nin, 4'u 5'in yerine alicaz en son 7'yi en basa alicaz.
        // kum dolu kova su dolu kova ornegini hatirla (swap sorusu)

        int[] arr = {4,5,6,7};                               // int bir array olusturduk. Bunu method ile yapacagimiz icin main'in disina cikip method olusturacagiz

        arr=sagaKaydir(arr);                                 // metodu hazirladik basa donduk. bize array'i yeni haliyle kaydedin diyor.
                                                             // array'in yeni hali method'un bize dondurdugu olacak

        System.out.println(Arrays.toString(arr));


    }

    public static int[] sagaKaydir(int[] arr){              // bize bir deger donecegi int arr ve ismi yazacagiz public static den sonra
                                                            // bu method'a bir parametre gelemsi gerekiyor cunku neyi saga kaydiracak. array olsun ki saga kaydirsin
        int bosKova = arr[arr.length-1];                    // son elementi bos kovaya koyduk. butun elementleri uzerinden gececegimiz icin for loop lazim

        for (int i = arr.length-2; i >=0; i--) {            // son elementi bos kovaya koydugumuz icin, sondan 2. elemntinden baslayacak (length-2), nereye kadar gitsin: 0'a
                                                            // sondan basa geldigi icin   i--   olacak
            arr[i+1]=arr[i];                                // arr'nin  i+1'inci  elementine  arr'nin  i'inci elementini ata

        }

        arr[0]= bosKova;                                    // arr'nin sifirinci indexine boskovada'ki degeri aticaz
                                                            // array'imiz hazir. bundan sonra return
        return arr;

    }                                                       // GENEL TEKRAR: Metodumuz parametre olarak bir array geldi. son index'i bos kovaya aldik
                                                            // son element haric atamalari yaptik. sonrada 0 inci endex'e bos kovayi koyduk


}
