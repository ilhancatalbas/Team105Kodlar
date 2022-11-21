package ders34_overriding_pollymorphism;

public class C00_Ozet {
}

/*____OZET____
1- Bir obje olusturulurken conrtructor ve data türü aynı class'dan ise
   o objenin özelliklerini görebilmek için direk objenin oluşturulduğu class'a bakarız,
   o class'da olanları direk kullanır , olmayanlar için sırasıyla parent class'lara bakarız
   ve ilk bulduğumuz özelliği kullanırız.
2- Inheritance özelliklerinden biriside chıld class'dan oluşturulan bir objenin
   data türü olarak parent class'ların secilebilmesidir.
3- Genel olarak bu islemdeki amac chıld class'daki objenın parent class'a ait
   özelliklerinin vurgulanmasıdır
4- Eğer constructor ve data türü aynı değil ise variable(static) olarak belirlenen
C   ozellıkler ile method ile belirlenen(dinamik) özellikler farklı davranır.
5- Veriable olarak tanımlanan özelliklerin değerini bulmak için,
   Data türü seçilen class'a gidilir o class veya parent'larında ilk bulunan
   veriable değeri kullanılır.Eger o class veya parent'larında istenen veriable bulunamaz ise CTE oluşur.
6- Method olarak tanımlanan özelliklerde aynı şekilde data türü olarak  tanımlanan class
   ve parent'larında istenen method aranır.Method bulunamaz ise CTE olur.
   Aranan özellik bulur ise direk değeri kullanmak yerine data türünden constructor'in oldugu
   class'a kadar overriding var mı kontrol edilir. Overriding var ise en güncel hali kullanılır.


   _____Overriding_____(gecersiz kilma, gecersiz kilan)

   Overriding, child class’in parent class’da var olan bir method’u kendisine uyarlamasidir.

   Overriding icin parent class’daki method child class’da da olusturulup body’si degistirilir

   Overriding (gecersiz kilan)
   overridden (gecersiz kilinan)


   overriding tamamen methodlarla ilgilidir. variable'larin overriding'i olmaz.
   variable    ozelliktedir, methodlar      ozelliktedir.

   method olanlar en guncel haline bakar  (ornek: hayvanlar ==> kuslar==> avci kuslar)




 */
