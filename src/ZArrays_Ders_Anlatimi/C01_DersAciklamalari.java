package ZArrays_Ders_Anlatimi;

import java.util.Arrays;
import java.util.Locale;

public class C01_DersAciklamalari {

    public static void main(String[] args) {

    /*
       Array'lerden onceki data turlerinde primitive veya Non primitive olsun, sadece 1 variable atamasi yapabiliyordu.
       Mesela:
              int sayi = 20;
              String str = "Java candir";
              char = ilkHarf = 'A';
              boolean aktifMi = true;

      Gercek hayatta olay boyle degildir. Gunluk hayatta tek bir veri, deger iceren variable'larla biryere gidemeyiz.
      ornegin; sinifdaki ogrencilerden bahsederken, fabrikadaki iscilerden bahsederken,
      marketlerde satilan urunlerden bahsederken (hatta markette bir tane oge yoktur, once kategoriler sonra kategorideki urunler vardir) citayi yukseltmemiz lazim.


==>   Array(dizi)’ler Java’da AYNI DATA TURUNDEN BIRDEN FAZLA ELEMAN BARINDIRABILEN objelerdir. Tek bir deger degil birden fazla deger (variable) barindirabilir.

      onceki variable'larda tek deger oldugu icin istedigimiz degeri cagirirken, yazdirirken sorun olmuyordu.
      Array'in hepsini cagirabiliriz, yazdirabiliriz. Ancak Array'de birden fazla deger oldugu icin, istedigimiz degere index'leri kullanarak ulasabiliriz. Array'lerde index'i kullanilir.
      index'ler 0'dan baslar ve hangi index'deki elementi istiyorsak onu cagiricagiz. (Array’ler her bir eleman icin ayri bir alan ayirirlar ve bu elemanlara index bilgisi ile ulasabiliriz.)

==>  1-Bir array olusturulurken 2 sey deklare edilmek zorundadir.
                  A-Icine konulacak elementlerin data turu

                  int [] arr = new int [5]                       // data turunun yanina koseli parantez koydugumuzda, java bunun bir array oldugunu anlar. int' oldugunu anlar

       NOT: Bir array icinde FARKLI DATA TURUNDEN element olamaz.
       NOT: Array’ler primitive data turundeki datalarin degerlerini, non-primitive data turundeki datalarin ise referanslarini barindirirlar.

                  B-Icine kac element konulacagi (length) deklere etmek zorundayiz. (urunsayisi, ogrenci sayisi vb belirtmemiz gerekir)

       NOT: Olusturulan bir array’in uzunlugu sabittir, degistirilemez.

       NOT OZET: Java'da bir array olusturulacaksa, 2 seyi bastan bilmemiz gerekiyor.
                 1-) Olusacak array'in data turu (int, char vb)
                 2-) icine koyacagimiz element sayisi (  new int [5]  )

==>   2-Bir array 2 sekilde deklare edilir:
                                            A-   int arr [];                // bu yazilim seklinde intelliJ arr'yi sariya boyar
                                            B-   int [] arr;

                                            ustte deklare ettik ama degr atamadik, java REFERANS'i olusturur ama lenght belli olmadigindan OBJE'yi olusturmaz.
                                            Bu array kac oda ayirmasini bilmedigindan array'i olusturmadi henuz.

==>   3-Bir array'e 2 sekilde deger atanabilir.
                                               A- Direk deger atanabilir:      int[]arr ={1,3,8,23,99};      [1, 3, 8, 23, 99]

                                               B- Uzunlugu belirtilerek olusturulur ama elemanlara deger atamasi yapilmaz.
                                                  Bu durumda Java belirtilen uzunlukta ve default degerlere sahip bir array olusturur.
                                                  mesela; 20 kisilik bir sinif olustururuz, ogrenciler belli oldukca, ogrencileri atama yapabiliriz

                                                  int [] arr = new int [5];     [0, 0, 0, 0, 0]

                                                  bu durumda java 5 uzunlugunda int bir element olusturur. Ama bunlara deger Atamasi yapmasi gerekir.
                                                  Bu sebebten DEFAULT degerlerini atamasini yapar. (Elementleri olmadigi icin)
                                                  ornekle; Elementleri olmadigi icin, int oldugu icin java 5 uzunlugunda default deger olan 0 koyar
                                                  String olsaydi default degeri  null  koyacakti

==>   4-Bir array’in length’i (uzunlugu) nasil bulunur ?
        lenght ile bulunur.                              int [] arr = {1, 3, 8, 23, 99};
                                                         System.out.println(arr.lenght);          // 5

      NOT: Array’deki length BIR METHOD DEGIL, uzunlugu tutan bir variable’dir. Dolayisiyla yaninda ( ) parantez yoktur.

      NOT: elementleri yazdirmakla array'i yazdirmak farkli seylerdir
           array'i yazdirdigimiz zaman basa ve sona koseli parantez koyar, araya virguller koyar ve bir bosluk birakir.

==>   5-Bir array’de istenen index’deki elemana nasil ulasilir ?
        Array’deki herhangi bir elemana ulasmak veya degistirmek icin index kullanilir.
        Array’de olmayan bir index’i kullanmak isterseniz ArraysIndexOutOfBounds exception verir.

        int [] arr1 = {2, 4, 6, 8, 10};       System.out.println(arr1[2]);      // arr1'in 2. elementini istedik.  6'yi verdi

==>   6-Bir array’in tum elemanlari nasil yazdirilir ?
        For-Loop kullanarak yazdirilabilir.

        for (int i = 0; i < arr1.length; i++) {            System.out.print(arr1[i] +" ");             arr1'in i'inci index'indeki elementi yazdirdigimizda  // 2 4 6 8 10

==>   7-Bir array nasil yazdirilir ?
        Array direk yazdirilamaz, direk yazdirmak isterseniz array’i degil referansini yazdirir.
        Array’i yazdirmak icin Arrays class’indan toString( ) method’u kullanilmalidir.

        int [] arr = {1, 3, 8, 23, 99};                System.out.println(arr)           [I@2752f6e2            referansi

        System.out.println(Arrays.toString(arr));             [1, 3, 8, 23, 99]


        NOT: array'de temel mantigimiz su olacak herzaman; bizden hangi elemente ulasmamiz isteniyora, ona ulasacagiz, onu degistirecegiz.
             Eger array'in tum elementlerine ulasmamiz isteniyorsa, ozaman for loop kullanacagiz.

==>   8-Bir array’in elemanlari nasil siralanir?
        Array’lerde siralama yapmak icin Arrays class’indan yardim almak gerekir.
        Arrays.sort( ) method’u array’i Natural Order’a gore siralar.
        Buyukten kucuge siralamak isterseniz, sort( ) ile siralayip, loop ile tersine cevirmek gerekir.

        int[] arr = {1,3,9,5,4,6};
        System.out.println(Arrays.toString(arr));                     [1, 3, 9, 5, 4, 6]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));                     [1, 3, 4, 5, 6, 9]

==>   9-Bir array’de istenen elemanin varligi nasil kontrol edilir?
        Binary search metodunun dogru sonuc verebilmesi icin
        oncelikle sort metodu kullanilmalidir

        sort() kullanilmadan binarySearch() ile yapilan aramanin sonucu belli olmaz
        dogru sonuc da verebilir, yanlis sonuc da verebilir

        Bununla ilgili youtube videosu var. (ahmet hoca tavsiyesi)
        mantigi su: java aramaya ortadan basliyor. 8 ariyorsan mesala 7 den sonra bakiyor.


        Array’lerde istenen bir elemanin varligini kontrol etmek icin binarySearch( ) method’u kullanilir.
        Ancak, binarySearch( ) kullanmadan once MUTLAKA sort( ) ile siralama yapilmalidir.
        Arrays.sort( ) kullanilmadan da binarySearch( ) calisir ancak sonuclarinin ne olacagi BILINEMEZ.
        binarySearch( ) ile array’de olmayan bir eleman aranirsa, olmasi gereken sirayi  –ile VERIR.

        int[] arr = {1,8,3,7,2,5,8,1};
        System.out.println(Arrays.binarySearch(arr,8));    // 6
        System.out.println(Arrays.binarySearch(arr,5));    // -2
        System.out.println(Arrays.binarySearch(arr,1));    // 0
        System.out.println(Arrays.binarySearch(arr,9));    // -10

==>   10-Iki array’in esitligi nasil kontrol edilir?
         Arrays.equals(arr1,arr2);
         herbir index icin elemanlari kontrol eder, tum index’lerdeki degerler karsilikli esit ise true, farklilik varsa false döner.

==>   11-Bir String’i array’e cevirmek
         str.split( StringAyirac); bir String’i istedigimiz parcalara ayirarak bir array’e cevirir.
         bu aslinda bir string metotudur.
         javaya nasil bolecegimizi soyluyoruz. virgulden bol, bolsuktan bol, a harfine gore bol, vb gibi
         hiclikten bolrsek tum karakterleri elde ederiz.

         String str = "java gercekten cok cok guzel";
         kac tane e harfi vardir?
         String[] eArrayi= str.split("e");
         System.out.println(Arrays.toString(eArrayi));
         System.out.println(eArrayi.length);

==>    ONEMLI NOT : Varolan bir array’e yeni deger atanabilir mi ?
                    Varolan bir array’e elementleri yazarak yeni deger atamasi yapamayiz
                    Ancak new keyword ile yeni bir deger atayabiliriz. Bu varolan array’in uzunlugunu degistirmek degil,
                    yepyeni bir array olusturmak oldugundan Java CTE vermez.
                    (yani; var olan arabamizi suv'a cevirmeyiz ama onu verir yerine yenisini alabiliriz)

                    NOT:varolan bir array in uzunlugu degistirilemez  AMA  varolan bir array'e yeni bir array degeri atayabiliriz

                        1- var olan bir array'i yeni deger olarak atayabiliriz

                    String[] arr1={"Ali", "Veli"};                    // burada array'e yeni bir deger atamadik. varolan arry'i degistirdik.
                    String[] arr2={"A","B","C"};                      // toyota ornegi: eski arabasini aldik, ona yeni bir araba verdik. yine o adamain arabasi ama artik farkli araba
                    arr1=arr2;
                    System.out.println(Arrays.toString(arr1));        // [A, B, C]

                        2- istedigimiz uzunlukta yeni bos bir array degeri atayabiliriz

                     arr1=new String[6];                                // uzunlugu 6 olan bos bir array atadik. 6 tane nul gorucez
                     System.out.println(Arrays.toString(arr1));         // [null, null, null, null, null, null]

                        3- Yeni olusturulan bir array'e {} icinde deger yazarak atama yapabiliriz
                           ancak var olan bir array'e yeni deger atamasi icin {} KULLANILAMAZ

                     arr1={"g","h"};       // olmaz                     // varolan bir array sanki ilk defa deger atiyormusuz gibi deger atayamayiz


                     int arr[]={3,4,5};                                    ilk defa olusturdugumuz array. java kabul eder. var olan array'e ust satirdaki gibi yeni bir array atanamaz









      */

    }





}
