package ders29_stringBuilder_accessModifier;

public class C00_Aciklama {
}

/*
_____Date Time Formater______

 - Date Time Formatter ile tarih ve saati istedigimiz formatta yazdirabiliriz.
 - Format’i dunya capinda belirlenen tarih ve saati formatlari ile yazdirabildigimiz gibi
 - Kendimizin belirleyecegi bir formatta da yazdirabiliriz.
 - Format’i String olarak belirlerken kullanacagimiz harfler ile tarih ve/veya satin istedigimiz bolumunu, istedigimiz formattayazdirabiliriz.
   ornegin (pdf daha genis anlatimi var):  d : basta 0 varsa yazmadan gun yazar
                                           dd : tek haneli 01 gibi basina 0 yazarak gun numarasi
                                           DDD : yilin kacinci gunu oldugunu yazar
                                           E, EE, EEE : gun isminin ilk 3 harfini yazar
                                           EEEE: gun isminin tamamini yazar

                                           m: dakida (minute)
                                           M: ay (month)
                                           M: basta 0 varsa onu yazmadan ay numarasi
                                           MM: tek haneli aylari 01 gibi basina sifir yazarak ay nimarasi
                                           MMM : ay isminin ilk 3 harfi
                                           MMMM : ay isminin tamamini

                                           YY: yilin son iki rakami
                                           YYYY: yilin tamami

                                           H : 24 saatlik dilimle saat
                                           h : 12 saatlik dilimle saat
                                           HH : saatin tamamini, tek rakamli saat olursa 02 gibi
                                           H : tek rakamli saat olursa sadece saati
                                           a : yazarsak Am veya PM degerini yazar


______String Builder_______

==, equals, compareTo

- String builder’da iki String Builder’i karsilastirmak icin ==kullanilirsa false doner.
- equalsile iki String Builder’i karsilastirdigimizda da false doner. Istisnasi String builder’i kendisi ile karsilastirdiginizda equals method’u true donecektir.
- equals ile bir String Builder ile bir String’i karsilastirdigimizda Java CTE vermez ama farkli data turleri oldugundan her zaman false dondurur.
- Iki String Builder’in ayni oldugunu anlamanin en iyi yolu compareTo( )’ dur. Esit ise 0 doner, esit degil ise ilk farkli harflerin arasindaki farki verir.

- String builder’da olmayan String method’larini kullanmak istersek sb.toString( ) ile String Builder’i String’e cevirebiliriz.
  Bu cevirm islemini yaptigimizda data turunu degistirdigimizi ve String immutable oldugu icin method’larin kalici degisiklik yapmayacagini unutmamamiz gerekir.



________Access Modifier_____

- Access Modifiers (erisim belirleyici) bir class uyesinin scope’unu yani nerelerden erisilebilecegini belirler.
- Bir class uyesini olustururken, bu class uyesine nerelerden erisilebilecegini ve kullanilabilecegini belirleyen access modifier kullanmak zorundayiz.
- Simdiye kadar buna dikkat etmemistik, cunku Java access modifier yazilmasa da default access modifier tanimlar ve kodun calismasini saglar.

- Java’da 4 access modifier vardir.
                                    1-Private
                                    2-Default
                                    3-Protected
                                    4-Public

NOT-Class’lar public veya default olmak zorundadir, private veya protected olamazlar.

1-Private : Private olarak belirlenen class uyelerini sadece icinde oldugu class’dan kullanabilirsiniz.
            sadece icinde bulundugu class'dan kullanilan, class uyelerini belirler.
            Eger bir variable private olarak isaretlendiyse veya bir class uyesi private olarak isaretlendiyse sadece icinde bulundugu class'daki static metodlardan kullanilabilir.Baska bir class dan kullanilma ihtimali yok

2-Default : Default olarak belirlenen class uyelerini sadece icinde oldugunuz package’dan kullanabilirsiniz.
            Default constructor gibidir, yani gorunmez. variable'in access modifier yazili degilse (public, private yada Protected), default variable acces modifier'i default'dur
            bir variable'in yada bir method'un access modifier'ini  gormuyorsak, access modifier'i default dur
            Yani gorunmuyorsa defaul'dur.

3-Protected : Protected olarak belirlenen class uyelerini icinde oldugunuz package’dan ve baska class’lardaki child class’lardan kullanabilirsiniz.
              Protected'da child class devreye giriyor. Bazi class'lari baska class'larin child'i yapabiliriz. babasini secebilir
              ileri konularda daha detayli anlatilacak !

4-Public : Public olarak belirlenen class uyelerini icinde oldugunuz projedeki tum class’lardan kullanabilirsiniz. Hic bir sinirlama (restiriction) icermez.
           public olanlari kendi class'indan, herhangi bir package'dan kullanilabilir. (Herkes kullanabilir)

NOT: default access modifier ile variable'larin default degerleri farkli seyler. Birbirleri ile karistirilmamasi lazim.



___________Encapsulation________


 */
