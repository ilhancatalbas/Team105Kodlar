package ZArrays_Ders_Anlatimi;

import java.util.Arrays;

public class C13_DrestekiOrnekler04 {

    public static void main(String[] args) {

        /*Binary search metodunun dogru sonuc verebilmesi icin
        oncelikle sort metodu kullanilmalidir

        sort() kullanilmadan binarySearch() ile yapilan aramanin sonucu belli olmaz
        dogru sonuc da verebilir, yanlis sonuc da verebilir

         */

        int[] arr = {1,8,3,7,2,5,8,1,9};

        System.out.println(Arrays.binarySearch(arr,8));    // 6
        System.out.println(Arrays.binarySearch(arr,5));    // -2
        System.out.println(Arrays.binarySearch(arr,1));    // 0
        System.out.println(Arrays.binarySearch(arr,9));    // -10

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));               // [1, 1, 2, 3, 5, 7, 8, 8]

        System.out.println(Arrays.binarySearch(arr,8));    // 6
        System.out.println(Arrays.binarySearch(arr,5));    // 4
        System.out.println(Arrays.binarySearch(arr,1));    // 1
        System.out.println(Arrays.binarySearch(arr,9));    // 8


    }
}
