package ders28_varargs_StringBuilder;

public class C00_Aciklama {
}

/*

_____________varargs_________

Genel Not: 1- new kelimesi yeni bir obje olusturur
           2- esitlik varsa; sag taraf deger, sol taraf varibale

arrays dir
method parametre girmek icin mantikli
bir methodda birden fazla varrags olmaz. hata verir. kod calizmaz

Java’da method call yapildiginda, Java compile time da iki kontrol yapar
1-Method Ismi
2-Method call’da kullanilan argument’ler ile method’larda bulunan parametrelerin uyumu

Bu iki kontrol neticesinde istenen isim, parametre sayisi ve parametrelerin data
turlerinde farklilik varsa, Java CTE verir.

Varargs, methodlardaki ayni turden olan parametrelerin sayisi konusunda bize esneklik kazandirir.
Varargs, list gibi esnek sayida parametre alir, ancak Array altyapisini kullanir. Dolayisiyla
varargs’daki datalarla islem yapmak icin Array method’lari kullanilir. Varargs, parametre sayisi 0 oldugunda da CTE vermez, bos bir array olusturur.

Varargs’i belirtmek icin data turunden sonra …kullanilir.

Bir vararg’in eleman sayisi sinirlandirilamaz, bundan dolayi varargs parametre en sona yazilmalidir.

Ayni sebeple bir method’da birden fazla varargs parametre olarak kullanilamaz.

Bir method’da varargs’dan sonra parametre yazilirsa Java CTE verir


____________String Builder_________

-NOTLAR:

- Java’da metin datalar ile kullanilabilecek 3 Class vardir.

- Bunlar’dan hangisinin kullanilacagina, ihtiyaclara gore, development asamasinda karar verilir.


     Class               Mutability                      Multi Thread                               hiz

 1- String               Immutable

 2- StringBuilder         Mutable             Multi Thread calismayi desteklemez                 Daha hizlidir

 3- StringBuffer          Mutable             Multi Thread calismayi destekler                   Daha Yavastir


- String Immutable oldugundan, her degisiklikte yeni objeler olusturacaktir. Ozellikle kullanici sayisi ve
  metin veriler fazla oldugunda hafiza kullanimi acisindan String yerine String Builder kullanilabilir.

-NOTLAR: ayni anda birden fazla process calistiryirsaniz buna multi thread denir. (nufus md ornegi. farkli sehirlerden kimseyi beklemeyiz. herkes ayni anda ortak calisir

         string builder multi thread calismaya desteklemez
         string buffer destekler
         immutable ihtiyac varsa string kullanirsin
         string immutable oldugunda her degisiklikte yeni obje olusacaktir


-- String Builder’i olustururma yontemimiz kullanilacak hafizayi etkileyecegi icin buyuk uygulamalarda buna da dikkat edilmelidir.

         string builder nasil olusturulur:

         her seferinde mutlaka new StringBuilder kullanmaliyiz

         String Builder olustururken 3 farkli sekilde olusturulabilir.

         StringBuilder sb1 = new StringBuilder();                 // kapasitesi 16 karakter olan bir SB olusturur java (bosken)
         sout (sb1.capacity());                                   // 16
         StringBuilder sb2 = new StringBuilder("Ali Can");        // yazilan String'e uygun kapasitede SB olusturur ve icine ALi Can yazar
         sout (sb2.capacity());                                   // 23
         StringBuilder sb3 = new StringBuilder(capacity:7);       // kapasitesi 7 olan bir SB olusturur
         sout (sb3.capacity());                                   // 7

NOT : String Builder’in kapasitesini asan bir ekleme yapildiginda, kapasitesini  otomatik olarak 2 * eski kapasite + 2 yapar.






*/

/*

Well you only need the light when it’s burning low
Işığa yalnızca sönmeye başladığında ihtiyaç duyarsın
Only miss the sun when it starts to snow
Güneşi yalnızca kar yağmaya başladığında özlersin
Only know you love her when you let her go
Onu sevdiğini ise yalnızca gitmesine izin verdiğinde anlarsın

Only know you’ve been high when you’re feeling low
Yalnızca kendini dipte hissettiğinde yüksekte olduğunu anlarsın
Only hate the road when you’re missin’ home
Yalnızca evi özlediğinde yoldan nefret edersin
Only know you love her when you let her go
Onu sevdiğini ise yalnızca gitmesine izin verdiğinde anlarsın
And you let her go
ve gitmesine izin verirsin

Staring at the bottom of your glass
Kadehin dibinden bakarsın
Hoping one day you’ll make a dream last
bir gün rüyanın devam edeceğini umarak
But dreams come slow and they go so fast
Ama rüyalar yavaş gelir ve hızlı giderler

You see her when you close your eyes
Gözlerini kapattığında onu görürsün
Maybe one day you’ll understand why
Belki bir gün nedenini anlarsın
Everything you touch surely dies
Dokunduğun herşey kesinlikle ölüyor

But you only need the light when it’s burning low
Ama ışığa yalnızca sönmeye başladığında ihtiyaç duyarsın
Only miss the sun when it starts to snow
Güneşi yalnızca kar yağmaya başladığında özlersin
Only know you love her when you let her go
Onu sevdiğini ise yalnızca gitmesine izin verdiğinde anlarsın

Only know you’ve been high when you’re feeling low
Yalnızca kendini dipte hissettiğinde yüksekte olduğunu anlarsın
Only hate the road when you’re missin’ home
Yalnızca evi özlediğinde yoldan nefret edersin
Only know you love her when you let her go
Onu sevdiğini ise yalnızca gitmesine izin verdiğinde anlarsın
And you let her go
ve gitmesine izin verirsin

Staring at the ceiling in the dark
Karanlıkta tavana bakıyorsun
Same old empty feeling in your heart
Kalbinde o eski boş his
‘Cause love comes slow and it goes so fast
Çünkü aşk çok yavaş gelir ve hızlı bir şekilde gider

Well you see her when you fall asleep
Uykuya daldığında onu görürsün
But never to touch and never to keep
Ancak hiç dokunmaz ve hiç tutmazsın
‘Cause you loved her too much
Çünkü onu o kadar çok sevdin ki
And you dived too deep
ve çok derine daldın

Well you only need the light when it’s burning low
Işığa yalnızca sönmeye başladığında ihtiyaç duyarsın
Only miss the sun when it starts to snow
Güneşi yalnızca kar yağmaya başladığında özlersin
Only know you love her when you let her go
Onu sevdiğini ise yalnızca gitmesine izin verdiğinde anlarsın

Only know you’ve been high when you’re feeling low
Yalnızca kendini dipte hissettiğinde yüksekte olduğunu anlarsın
Only hate the road when you’re missin’ home
Yalnızca evi özlediğinde yoldan nefret edersin
Only know you love her when you let her go
Onu sevdiğini ise yalnızca gitmesine izin verdiğinde anlarsın

And you let her go
ve onun gitmesine izin verirsin
And you let her go
ve onun gitmesine izin verirsin
And you let her go
ve onun gitmesine izin verirsin
 */
