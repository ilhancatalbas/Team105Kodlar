package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C07_MDA_Soru {

    public static void main(String[] args) {

        //Soru 2-Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
        //       yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //       input :  int[][] arr= {{3,4,5}, {2,3,6,7}};
        //       output:                 [5, 7, 11]

        int[][] arr= {{3,4,5}, {2,3,6,7}};                                                       // ayni index'tekileri toplayin dedigi icin kisaya gore yapmaliyiz.
                                                                                                 // birinde 3. index var ama digerinde yok. olmayan 3. index'e gore toplamaya kalkarsan hata verir.
                                                                                                 // cunki 3. index yok. bu sebeden kisa gore
                                                                                                 // once hangisi daha kisa ve uzunlugu ne kadar, once bunu tespit etmemiz lazim
        // inner 2 array olacagini ve bunlarin uzunluklarinin degisebilecegini kabul ettik

        int ortakIndexSayisi = arr[0].length<arr[1].length ? arr[0].length : arr[1].length;      // bunuda ternery ile yaptik.
                                                                                                 // yani: eger bunun uzunlugu daha fazlaysa bunu alicak, degilse digerini alacak mantigi
                                                                                                 // System.out.println(ortakIndexSayisi);    // bunu sadece bakip kontrel etmek icin yazdik
                                                                                                 // bu 3 indexin toplamini bulup yeni array e koyacagiz. uzunlugu ne olmasini istiyoruz: ortak eleman sayisinca
        int[] ortakIndexToplamlariArr = new int[ortakIndexSayisi];                               // ortak  indextoplamlari  array'ini  ortakIndexSayisi'na gore olusturduk

        for (int i = 0; i < ortakIndexToplamlariArr.length; i++) {

            ortakIndexToplamlariArr[i]=arr[0][i] + arr[1][i];                                    // ortakIndexToplamlari array'inin i'inci index toplami
                                                                                                 // arr[0] i'inci indexinde element + arr[i] nin i'inci indexindeki elemen
        }

        System.out.println(Arrays.toString(ortakIndexToplamlariArr));

        // birinci inner array'in i'inci indexi ile ikinci inner array'in i'inci indexi toplayip. yeni aray'in i'inci indexi olarak atadik





    }
}
