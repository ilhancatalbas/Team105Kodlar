package ders19_arrays;

import ders18_arrays.C03_ArrayElementleriArtirma;
import ders18_arrays.C04_ArrayElementleriToplama;
import ders18_arrays.C05_ArraydeElemanArama;
import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {

    public static void main(String[] args) {

        // verilen bir int array'in elementlerini 2 artirin

        int[] arr= {2,3,4};                                                  // eger boyle soruyu daha once method olarak cozduysek kolay. C03 de yapmistik

        C03_ArrayElementleriArtirma.elemntleri2Artir(arr);                   // elemntleri2Artir metodu bize int array donduruyormus. ozaman atama yapmamiz lazim
                                                                             // bunuda arr ye atadik
        System.out.println(Arrays.toString(arr));                            // [4, 5, 6]    2 ser artti



        // arr array'inin elementlerini toplayip sonucu yazdirin
        // ders18 de, C04'de boyle bir method hazirlamistik.

        System.out.println(C04_ArrayElementleriToplama.pozitifElementleriTopla(arr));         //15

        // arr array'inde 10 element olarak var mi?
        // bunun metoduda ders18, C05'de boyle bir metodumuz var

        C05_ArraydeElemanArama.elemanAra(arr,10);                        // noktayi koyduktan sonra detaylari gorebiliyoruz. elamanAra. yapinca
                                                                                     // int bir array aliyormus. Aranan elamani aliyormus ve void'mis (yani yazdiriyormus)
                                                                                     // sout demeden yazdirabiliriz. // sonuc:  'Aranan sayi array'de yok'
        // kullanicidan deger olarak bir array olusturun
        // ders18 C06

        // C06_KullaniciyaArrayOlusturma.arrayOlustur();                              // hicbir parametre almiyormus. Bize int bir array donduruyormus.
        int[] yeniArr=C06_KullaniciyaArrayOlusturma.arrayOlustur();                   // ozaman bunu int bir array'e atayacagiz. Adida   yeniArr   olsun
        System.out.println(Arrays.toString(yeniArr));


    }
}
