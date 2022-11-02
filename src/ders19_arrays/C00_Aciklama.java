package ders19_arrays;

public class C00_Aciklama {
}

/*

8-) bir array'in elemanlari nasil siralanir
    Array class'dan yardim almak lazim.          Arrays.sort(arr);   metodunu kullanmaliyiz

NOT: Method yapmamizin faydasi; yeni bir kutuphane olusturuyoruz

NOT:Methodlari anlasilir isimle yazmak kullanim acisindan kolaylik olusturur

   Arrays.sort() method'u array'i Natural Order'a gore siralar.

   NATURAL ORDER:  Dogal siralama     (karsimiza cok cikacak)

9-) Bir array'de istenen elamnin varligini kontrol etmek icin binarySearch() method'u kullanilir

   int[] arr = {1,3,9,5,4,6,}   aratmak icin once sort yapmak daha faydali
   siralama yapildiysa arananin index ini verir bize

   Binary search metodunun dogru sonuclar verebilmesi icin oncelikle sort method'u kullanilmalir
   sort() kullanilmadan binarySearch() ile yapilan aramanin sonucu belli olmaz
   dogru sonuc da verebilir, yanlis sonucada verebilir

10-) iki array esitligi     Arrays.equals(arr1,arr2);    herbir index icin elemanlari kontrol eder
     tum index'leriki degerler karsilikli esit ise  true , fakrlilik varsa  false  doner
     yani tum elementler ayni olacak, siralamalarida ayni olacak

11-)  Bir String'i array'e cevirmek                                                 split:bolmek demek
      str.Split(StringAyirac); metodu, bir String'i istedigimiz parcalara ayirarak bir array'e cevirir
      yani neye gosterirsen java'ya (ornek: virgul space vb, onlardan ayirir)
      mesela: hiclik'ten ""  bolersen butun karakterlerinden boler

      ONEMLI NOT
      Varolan bir array'e yeni deger atanabilir mi
      -- varolan bir array e elememntleri yazarak yeni deger atamasi yapamayiz
      -- ancak new keyword ile yeni bir degr atayabiliriz
      -- bu varolan arry in uzunlugunu degistirmek degil, yepyeni bir ayyar olusturmak oldugunda java CTE vemez

  varolan bir array in uzunlugu degistirilemez
  AMA
  varolan bir array'e yeni bir array degeri atayabiliriz

  1- var olan bir array'i yeni deger olarak atayabiliriz (asagidaki ornek)
  2- istedigimiz uzunlukta yeni bos bir array degeri atayabiliriz
  3- Yeni olusturulan bir array'e {} icinde deger yazarak atama yapabiliriz
     ancak var olan bir array'e yeni deger atamasi icin {} KULLANILAMAZ





 */
