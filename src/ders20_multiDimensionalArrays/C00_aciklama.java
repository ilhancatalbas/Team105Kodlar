package ders20_multiDimensionalArrays;

public class C00_aciklama {
}

/*
ONCEKI DERS TEKRAR

1-) Array'ler ayni data turunden birde fazla veri barindirabilen java objeleridir
    NOT: non-primitive den olusturulan data turune obje diyebiliriz.  ornek array objesi, string objesi gibi

2-) bir array olusutururken dara turu ve lenght deklare edilmek zorundadir

3-) bir array iki sekilde olusturulabilir
    int [] arr1 = {3,5,6};
    int [] arr2 = new int [5];     // [0,0,0,0,0,]
    ikinci olusturma seklinde uzunlugug 5 olan bir array olusturur ve tum elementlerine data turune uygun default degerlr atar

4-) bir array uzunlugu sabittir ve olusturulduktan sora degistirilemez

5-) var olan bir array'e yeni eleman eklememiz sart ise,
    -once length'i eski array'den 1 fazla olan yeni bir array olusturulur
    -eski array'deki tum elementler ayni index'lere yeni array'e atanir
    -eklenecek element de son index'e atanir
    -yeni array son halini aldiktan sonra, eski array'e yeni array deger olarak atanir

6-) bir array'in tum elementleri ile islem yapmak istersek for loop ile tum elementleri tek tek islemden gecerebiliriz

7-) String split() bir String'i istedigimiz ayirac ile parcalara bolup, bir array olusturur/
    bu Array'i kullanmak icin biz de esitligin solunda bir array olusturup, olusan array'i atama yapariz


    MULTI DIMENSIONAL ARRAYS

    Icerisinde array bulunduran array'lardir

    ornegin; bir okul var. okulun icinde bir suru bolumler olabilir. bu bolumler bir suru siniflar olabilir. bu siniflarda bir suru ogrenciler olabilir
    mesela edevlet projesi bir suru fonksiyonu var

    int[][] arr= {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};                       burda 1 array var. bu array'in icinde 5 tane daha array var. 2 katmanli array

    disardaki array'e outer array
    icerdeki array'e inner array diyoruz

    soldaki[] inde arraydaki index   [][] ikinci [] icindekinin indexi

    1-) Array'in icindeki bulunan elementlerden birini yazdirmak istersek direk yazdirabiliriz
        sout(arr[2][0]);  //3

    2-) Inner array'lerden birini yazdirmak istersek   Array.toString()   kullaniriz
        sout(Arrays.toString(arr[1]));   // [1, 2]

    3-) outer array'i yazdirmak istersek   Arrays.deepToString()   kullaniriz
        sout(Arrays.deepToString(arr));     // [[3, 1, 2, 4], [1, 2], [3, 4, 5], [10], [2, 7]]


- Multi dimensional Array'in tum elementlerine ulasmamiz gerektiginde, katman sayisi kadar ic ice loop olusturmaliyiz

            ARRAY LISTS ' e giris

      ArrayList, dinamikve yeniden boyutlandirabilir bir array'dir.

      Array’in dezavantajlari uzunlugunu en basta belirlemek zorunda olmamiz ve
      uzunlugun sabit olmasidir. Sabit uzunluk esnek calismaya imkan tanimadigindan
      array liste tutmakta cok kullanilmaz.

      ArrayList array altyapisini kullanmakla beraber element ekleme ve silme islemlerine
      aciktir. Ancak array altyapisi sebebiyle eklemeleri birer birer yapabiliriz. ( veya
      uzunlugu belirli baska bir arrayList ekleyebiliriz)






 */
