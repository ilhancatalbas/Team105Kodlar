package ders24_constructors;

public class aciklama {
}

/*
--------------_ONCEKI DERS OZET______

1- Constructor java'da olusturulan objelere ilk deger atamasi (initialize) constructor tarafindan yapilir

2- Bir class'da biz constructor olusturmasak da o calss'dan obje olusturulabilir,
   cunku java her class'a obje olusturululabilmesi icin default constructor koyar.

3- default constructor parametreszdir, body' 'sinde kod yoktur ve gorunmez.

4- Eger biz gorunur sekilde bir constructor olusturursak java default constructor'i siler.

5- constructor lar method'a benzer ama method degillerdir. Bir kod blogunun method mu yoksa constructor mi oldugunu anlamak icin return type bakilir.

6- constructor'larin return type'i olmaz olmaz, ismide class ismiyle ayni olmalidir. constructor'lar static'de olmazlar.

7- default constructor kullanilarak olusturulan objeler standart ozelliklere sahip olurlar.
   yani obje olusturulan class'da variable'lara hangi deger atanmissa o degerlere sahip olurlar.

8- constructor kullanarak bir objeye ilk deger atamasi yapmak icin instance variable'larin bir kopyasini olusturur ve obje ile iliskilendirir.
   boylece her instance variable'in obje sayisi kadar kopyasi olur


Nor: susulu parantezler bizim kod blgumuzun sinirlarini belirler

NOT NOT: constructor'i intelliJ'nin otomatik olusturmasini istiyorsak, ust menuden code, sonra generate sonra constructor'i secebiliriz

NOT: bir kac tane constructor varsa hangisinin caliscagini parametrelere gore karar verir

NOT: bir kod calismaya baslarsa once main methoda gider ordan calismaya baslar

--- Constructor call, method call gibidir.  method call bir methodun calismasini sagliyordu
    Constructor call ise yine bir Constructor'in calismasini saglar. cons.da class ismini yazmak yerine this kullanilir
    this in yaninda bir parantez varsa bilecegiz ki baska bir constructor'in calismasi icindir.

    -----------CONSTRUCTOR CALL-----------

    -Obje olusturulup ilk deger atamasinin yapilmasi icin MUTLAKA bir constructor calisir.
    -Bir class’daki constructor calisirken, ayni class’dan veya farkli bir class’dan bir constructor’in daha calismasi gerektiginde constructor call yapilir.
    -Constructor call inheritance’i anlamamiz icin onemli bir yapi tasidir.
    -Constructor call icin this(parametreler) kullanilir.

    KURALLAR :
    1-this( ) constructor’in ilk satirina yazilmalidir.
    2-ilk kuraldan dolayi sadece bir constructor call yapilabilir.

NOT: this() gorursen; diyor ki: bu class da parametresiz constructor a git






 */
