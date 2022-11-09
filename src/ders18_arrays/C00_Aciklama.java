package ders18_arrays;

public class C00_Aciklama {
}

/* NOTLAR:      ( bazi notlar asagidaki aciklamayla ayni )

-- bugune kadar kullandigimiz data turlerine sadece 1 variable'a atayabiliyordu

-- neden fazla variable diye dusundugumuzde, marketlerden ornek verelim. bir market bir urun satmaz. Birden fazla urunu olur
--  biden fazla eleman barindirdigi icin bize kolaylik sagliyor.

-- Stringde oldugu gibi array'dede indexler var ve bu index'lerde 0'dan baslar

-- array String'de olabilir, integer da olabilir vb.

--  array'in uzunlugu sabittir degistirelemez. ( katakulli yapilabilir :) )

-- int [] arr = {1, 3, 8, 23, 99}  bu array'in uzunlugu 5 ,  elementleride [1, 3, 8, 23, 99] dur.   sonradan bu elementlri degistirebiliriz. mesela 8'i silip 7 yapabiliriz

-- int[]arr= new int[5];          bu arrayin elementleri olmadigi icin java bunlara default deger atar [0,0,0,0,0]

 */

/*
_________Array__________

Array (dizi)'ler java'da ayni data turunden birden fazla eleman barindirabilen objelerdir

1-)  bir Array olusturulurken 2 seye dikkat edilmeli
     A- icine koyulacak elementlerin data turu
     B- icine kac tane  element koyulacagi (length)
                                                    ornek: int[] arr = new int [5];

NOT: bir array'in icinde farkli data turlerinden element olamaz

Array'ler primitive data turundeki datalarin degerlerini,
non-primitive data turundeki datalarin ise referanslarini barindirirlar.

bir array'in uzunlugu sabittir, degistirilemez

2-)  bir array 2 sekilde deklare edilir.   ikisi arasinda bir fark yok.
     A-  int arr[];     intelliJ'i arr'yei sariya boyar
     B-  int[] arr;
A ve B'de deklare ettik ama deger atamadik, java referansi olusturur ama length belli olmadigindan objeyi olusturmaz

3-) bir array'e 2 sekilde deger atanabilir
    A- direk degerler atanabilir            int[]arr={1,3,8,23,99}      [1, 3, 8, 23, 99]
    B- uzunlugu belirtilerek olusturulur ama elemanlara deger atamasi yapilmaz.
       bu durumda Java belirtilen uzunlukta ve default degerlere sahip bir array olusturur.
       int[]arr= new int[5];      [0, 0, 0, 0, 0]
       java 5 deger olusturur. elemnetler olmadigi icin, java onlarin yerine default degeri atar. yani 0

4-) bir array'in length'i nasil bulunur?
        int[]arr= {1, 3, 8, 23, 99}
        sout(arr.length);    // 5

   NOT: Array'deki length bir method degiL uzunlugu tutan bir variable'dir
        Dolayisiyla yaninda () yoktur

   NOT: Array'dede length vardir. stringdeki length bir method (yaninda ()parantez vardi) iken array daki length bir bilgidir

   Array'i yazdirdigimizda basa ve sona [] koyar. Elementlerin arasina virgul ve bir bosluk koyar

5-) Array'deki herhangi bir elemena ulasmak veya degistirmek icin index kullanilabilir.
    Array'de olamayan bir index'i kullanmak isterseniz:    ArraysIndexOutOFBounds exception  verir
    ornek:  int[] arr = {1, 3, 8, 23, 99}:
            sout (arr[2]);   // 8
            arr[2]=10;
            sout (arr[2]);   // 10

6-) bir array'in tum elemenalari For-loop ile yazdirilir
    ornek: int[]arr = {1, 3, 8, 23, 99};
           for (int i = 0; i< arr.length; i++) {
           sout (arr[i] + " ");
           }

7-) Bir Array direk yazdirilamaz. direk yazdirmak isterseniz array'i degil referansini yazdirir.
    Direk yazdirmak icin arrays class'indan toString() methodu'u kullanilabilir
    direk yazdirirsan referansini verir
    ornek: int[] arr = {1, 3, 8, 23, 99}
    sout (Arrays.toString(arr));         //    [1, 3, 8, 23, 99]
    sout (arr);                          //    [I@1752f6e2]          referansi verir

 NOT: ornek: Array'in tum elementlerine ulasmamizi istiyorlarsa for loop kullanacagiz.
             sadece bir elementine ulasmamimizi istiyorlarsa ozaman o elemente ulasip degistirebiliriz






 */

