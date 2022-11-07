package ders26_PassByValue_ImmutableClasses;

public class C00_aciklama {
}
/*

- Pass By Value veya Pass By Reference yazilim dilini tasarlayanlarin verdigi / verecegi bir karardir.

- Arabam sari olsa, nasil dururdu ? Sorusunu cevaplamak icin arabayi sariya boyamak yerine,
  bir kopya uzerinde degisiklik yapip kontrol eder, eger begenirsek arabamizi sari boyatmaya karar veririz.

- Java’da bir variable’i method’a gonderdiginde, direk orjinal variable’i gondermeyi, orada yapilan degisikligin kalici olmasini istedigimizde ise
  main method icerisinde method’dan gelen degeri, orjinal variable’a atamayi tercih etmistir.


  _________Mutable / Immutable Classes_________

  Java OOP consept kullanir. Obje merkezli bu kullanimda objelerin mutable veya immutable olmasi
  onlarin ozelliklerini, dolayisiyla da o objelerin kullanim yerlerini degistirecektir.

  -Mutable Objects: Mutable objeler’de, obje olusturulurken verilen degerler sonradan degistirilebilir

  -Immutable Objects: Immutable objeler’de. ise, obje olusturulurken verilen degerler sonradan degistirilemez.

  Yani, immutable objeler degistirilemez ve yeni deger atanamaz.

  En cok kullanilan, immutable class’lar String ve Wrapper Class’lardir. Bu class’lardan olusturulan objeler de immutable (degistirilemez) olacaklardir.





 */
