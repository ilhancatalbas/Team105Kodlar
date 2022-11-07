package ders27_immutableClasses_DateAndTime;

public class C00_aciklama {
}

/*
__________OZET ONCEKI DERS_________

1- Pass By Value: Programlama dilleri bir method'dan kullanilacaksa, asil variable'in degerinin degisip degismeyecegine karar vermelidir.
               (method'da yapilan degisiklik bizim variable'in degerini degistirecekmi degistirmeyecekmi)
               Eger method'da yapilacak degisiklik asil variable'indegerini degistirmiyorsa buna pass by value,
               degistiriyorsa pass by referance denir.
               (pass by referance denilmesi, objenin referansini method'a gecirince, o referans uzerinde yapilan degisiklikler, kalici degisiklikler olmus olur.)

2- Java bu iki ihtimalden pass by value'yu kullanir. Herhangi bir method'da olusturulan bir variable baska method'a parametre olarak gonderilecegi zaman,
   asil variable degil, asil variable'in degerine kopya bir variable gonderilir. boylece kopya variable uzerinde yapilan degisiklikler asil variable'i etkilemez/

3- Eger method'da yapilan degisiklikligin asil variable'in degerini de degistirmesini istersek, method'dan yeni degeri dondurup, asil variable'a atama yapabiliriz.

4- Birden fazla element barindiran array ve arrayList gibi objelerde de pass by value gecerlidir.

5- Coklu element barindiran objelerde element'in degistirirlmesi, pass by value'u etkilemediginden element degisiklikleri kalici olur.
   Ancak array veya arrayList'de method'da yapilan yeni deger atamasi passByValue kurallari cercevesinde kalici olmaz, sadece yapildigi method icin gecerli bir atama olur.
   Main methoda donuldugunde asil aobjenin degeri deismemis olur
   (ornek; aranbam sari olsa nasil oldugunu gormek icin, arabayi sariya boyamaya gerek yok. bir gorselini sariya boyamamk yeterli olur. begenirsen arabayi boyarsin.

   ornek: diger element degisikliginde bir kisinin benim arabaya binip gitmesi, benim arabam olmasini degistirmiyor. sadece arabanin yolculari degisiyor. bu pass by value aykiri olmuyor.


____Immutable Class___

- Immutable Class; Susturulamayan yani degistirilemeyen class'lardir. En meshuruda, String ve Wrapper classlardi.
- Mutable objects; yani degistirilebilir objelerdir. En meshuru, array'lar ve arrayList'lerdir

 ornek: ders26 class C06 da yaptigimiz ornek; Stringlerde method kullandigimizda degisiklik kalici olmaz. meselaa buyuk harfe cevirdigimizde o an icin java buyuk harfe ceviriyor.
                                              Ama orjinal str bozulmuyor. ayni sekilde  str.toLowerCase(); dedigimizde  o an icin degistiriyor. ama alt satirdaki
                                              System.out.println(str);    str yine ayni str.

                                              Buna karsilik list'de yaptigimiz degisiklikler oyle olmuyordu. method uzerinden add, remove gibi degisiklikleri,
                                              atama yapmasakta, yapilan degisiklikler kalici oluyor objeler uzerinde.
                                              Biz atama yaparsak is oyle olmuyor.
                                              Mesela; String str = "Java candir";    ve bunu    str = str.toUpperCase();   yapip atama yaparsam, sonuc buyuk harflerle JAVA CANDIR  oluyor

NOT: java bazen passByValue bazen passByReferance olmaz.  Tercihi java kendisi yapmistir.

Ornek Aciklama:    String str = "Java candir";      Stack memory       Heap memory
                                                     str               "java candir"
                   str = str.toUpperCase();                             JAVA CANDIR         // bu satiri gordugunde java, Stack memory'ye geliyor. str'a yeni bir deger atanmis.
                                                                                               Ama java Stringi'in immutable oldugunu, istesede degistiremyecegini biliyor. Bizde diyoruz ki Java'ya, bundan sonra
                                                                                               String'i buyuk harfe cevir ve bunu deger olarak String'e atama yap. Ozaman Java Heap memory'e gide ve yeni bir obje olusturur
                                                                                               Istegimiz islemi yapar (str'i buyuk harfe cevirir). Sonra stack memory'ye gider, Heap memory'de yeni bir pointer olusturur ve derki
                                                                                               str'in degeri artik bu yeni obje. Eskiyide siler.
                                                                                               NOT: Heap memory de kucuk harfle yazilan Java candir bosta kaldi. Java'da belli araliklarla Garbage collector calisir,
                                                                                               bosta kalan objeleri temizler

Mutable / Immutable Classes

- Immutable objelere yeni bir deger atamak istedigimizde Java ayni isimde yeni bir obje olusturur ve pinter’i yeni objeyi isaretleyecek sekilde degistirir.

- Immutable Objects’in amaci guvenli es zamanli calisma (thread safe) ozelliginden  faydalanmaktir. ayni anda biden fazla thread in calistigi durumlar. datalarin etkilenmemesi.

Bilgi: cok kullanilici (banka edevlet gibi); ayni anda birden fazla yapilan islemlere multi thread denir

- Immutable class olan String’de method kullanarak yaptigimiz degisiklikler kalici olmazken, mutable class olan ArrayList’de method kullanarak yaptigimiz degisiklikler kalici olur.


__________String Pool__________

Java’da iki turlu String olusturulabilir.

1-Bugune kadar yaptigimiz sekilde bir String olusturmak. Bu sekilde olusturulan veya direk kullanilan String’lerde Java String havuzunu kontrol eder,
  bire-bir ayni String’i bulursa yeni obje olusturmaz, bir objeyi birden fazla referans point edebilir.
  mesela gibi;   String str1 = "Java";

2-new keyword ile bir String olusturmak. Bu sekilde olusturulan String’de, once esitligin sag tarafina bakilir new keyword’u oldugu icin yeni obje ve yeni referans olusturulur.
  mesela gibi;   String str2 = new String( original: "Guzeldir");











 */
