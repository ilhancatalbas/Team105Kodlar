package ders04_matematikselIslemlerIncrementDecrment;

public class C00_OzetVeAciklama {
}
/*
   1- Data Casting:  Java'da uygun data turleri arasinda gecis mumkundur. Hem primitive data turleri icin hem de non primitive data turleri icin data casting mumkundur

   2- Her data turu birbirine cast edilemez. ornegin boolean'i String'e veya char'i boolean'a ceviremeyiz. Ancak sayi degeri iceren byte, short, int, long. float ve double gibi
      benzer data turleri birbrtine cevrilebilir.

   3- Eger daha dar kapsamli bur data turundeki deger, genis kapsamli data turundeki variable'a atanirsa java bunu otomatik olarak yapar. (Auto Widening)

   4- Eger genis data turundeki bir deger, dar data turundeki bir variable'a atanirsa, java bu casting'i otomatik yapmaz sorumlulugu bizim almamizi ister.
      Sorumlulugu almak icin degerin onune (donusturulecek data turu) yazilir. ancak explicit narrowing yapildiginda deger kayiplari veya deger baskalasimi olabilir

   5- char data turu matematiksel islemlerde ascii tablosundaki degeri ile isleme girer. eger sayisal bir ifadenin char olarak yazilmasini istersek
      onune (char) yazarak explicit data casting yapariz

   Wrapper Class: Non primitive data turlerinde oldugu gibi primitive data turlerinin da hazir method'lari olmasi icin Java Wrapper class'lari olusturmustur.
                  Wrapper class'lar primitive'ler ile ayni degeri kullanir ama hazir method'lari da vardir


________Matematiksel Islemler________

   islem onceligi:  1- uslu sayilar
                    2- parantez icleri
                    3- carpma ve bolme islemleri                 Not: carpma ve bolme ikisi yanyana ise once soldaki yapilir
                    4- toplama ve cikarma islemleri              Not: toplama ve cikarma ikisi yanyana ise once soldaki yapilir

                                     3     3  2
                   NOT:  24 + ( 5 * 2  -  3  ) - 13    burda sekle bakip islem onceligine kara vericez. Yani once parantez icini yapicaz sonra parantez disindaki us sayiyi yapicaz.



_____Modulus (%Kalan Bulma)_________

     Java’da Modulus islemi, bir bolme islemindeki kalan sayiyi bize verir.

     Modulus islemi sayesinde
                              -Cift sayilar ( sayi %2 )
                              -Bir sayinin birler basamagini bulma ( sayi %10 )
                              -Bir sayi (ornegin 5) ile tam bolunebilen sayilari bulma ( sayi % 5 )           mumkun olmaktadir.


_________Increment (Deger Artirma)_________

 - Toplama veya carpma yaparak bir variable’in degerini artirabiliriz. Increment isleminin kalici olmasi icin 3 farkli sekilde assignment yapilabilir.


_________Decrement (Deger Azaltma)___________

 - Cikarma veya bolme yaparak bir variable’in degerini azaltabiliriz. Decrement isleminin kalici olmasi icin 3 farkli sekilde assignment yapilabilir.


 Post-Increment’te, increment diger islemden sonrayapilir .







 */
