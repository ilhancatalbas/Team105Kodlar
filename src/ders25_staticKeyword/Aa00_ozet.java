package ders25_staticKeyword;

public class Aa00_ozet {
}

/*
OZET

1- Parametreli constructor: eger obje olustururken, bazi variable'lara direk deger atamasi yapilmasini istersek, bu ozellikleri parametre olarak kullanip constuctor olusturabiliriz

2-parametresiz constuctor ile olusturdugumuz objelerde, obje olusturdujtan sonra tek tek ozelliklere atama yapmamaiz gerekir. Biz parametre olarak kullanirsak, constructor icerisinde
       instanceVariable = parametreOlarakYazilanDeger
  atamasi yapilmalidir.
          -eger instance variable ile paramatrenin ismi ayni degilse bu atama sorunsuz calisir.
          -ancakinstance variable ve parametre ismi ayni ise bu durumda hangisinin instance variable oldugunu belirtmek icin   this.instanceVaribaleIsmi   yazariz

3- Bazen (ki testerlar olarak boyle bir obje olusturmayiz) bir constuctor icerisinden baska bir constructor cagrilabilir.

4- constructor call icin   this(varsa parametreler)   yazilir. Hnagi constructorin cagrildigini parametrelere bakarak anlariz

5- this() ilk satirda yazilmalidir, bundan dolayi bir cons. icindesadece bir cons. call olur

NOT:mesela hastane ornegi, hemsirenin calisitigi hastene adi, hastane adresi, bashekim ismi gibi geneldir. tum hemsireler icin gecerlidir. static yapariz
    ama hemsirenin ismi adresi, telefonu hemsireyi ilgilendirir sadece. bunlari instance yapariz



__________Static Keyword_______

- static keyword bir variable veya  method’u class baglar.

-staticolarak etiketlenen variable veya method’a ulasmak icin classismi.variableIsmi yazmaniz yeterli olacaktir.

-staticvariable’lar objeye degil class’a baglidir. Static variable’lari obje uzerinden de objeIsmi.variableIsmi seklinde kullanmak istersek
 java CTE vermez ama static variable’a static yontemlerle ulasmalisiniz diye uyarir.


 ________Static Variables______

1-Class calismaya basladiginda static variable’lar olusturulur.

2-Static variable sadece 1 tane olusturulur, kac tane obje olusturulursa olusturulsun
  ayni static variable’i kullanirlar. Herhangi birsatirda static variable degeri degistirilirsebu satirdan itibaren tum objeler icin yenideger kullanilir.

3-Static variable’lar sadece 1 kere olusturuldugu icin memory kullanimi dusuktur.

4-Static variable’lar static olan veya olmayan tum method’lardan kullanilabilir.

5-Class disindan static variable’a ulasmak icin ClassIsmi.variableIsmi yazmamiz yeterlidir.


_________Static Methods_________

1-Bir method’u static yapmak icin return type’dan once static keyword yazilmalidir

2-Bir static method’dan static olmayan variable kullanamazsiniz.

3-Bir static method static olan veya olmayan tum method’lardan cagrilabilir.

4-Static olarak etiketlenen method’a baska class’dan ulasmak icin classIsmi. methodIsmi yazmaniz yeterli olacaktir.

 MOT:-methodu static yapmak icin return type dan sonra statik yazmamaiz yeterli
     -static method dan static olmayan variable kullanamayiz.
     -main method static club' 'une uye oldugu icin, diyorki ben static clubune uyeyim, ben static olmayan kimseyi icime kabul etmem diyor. ne varibale kabul eder, nede methodu kabul eder (static degilse).
     -Method static degilse herkes gelebilir. statik olanda gelir, olmayanda gelir
     -static heryere girebilir ama static olmayani kendi icerisine almaz. (burjuva gibi)

NOT: cons yeniden calismaya basladiginda herseyi sifirlar. napardi cons hemen instance variable olusturup iliskilendirir

NOT: TEKRAR: Static de yapilan degisik herkesi baglar. ama instance, instance varibale in kopyasini olusturur ve herkesle iliskilendirir.


__instance Varibale ve Static variable__

1) instance variables class’in icinde ama method’in disinda olusturulur

1) Static variables class’in icinde ama methodlar’in disinda olusturulur

2) Instance variables bir obje ’e baglidir. Dolayisiyla, bir obje olusturuldugunda olusur ve obje silindiginde silinirler.

2) Static variables bir class ’a baglidir. Dolayisiyla, bir class olusturuldugunda olusur ve class silindiginde silinirler.

3) Instance variables obje ismi ile cagrilabilirler.

3) Static variables class ismi ile cagrilabilirler.

4) instance variable icin ilk deger atamasi yapmak mecbur degildir. Ilk atama yapilmazsa default deger alir.

4) Static variable icin ilk deger atamasi yapmak mecbur degildir. Eger ilk atama yapilmazsa default deger alir.

5) Her yeni obje olusturuldugunda, instance variables ilk atanan degere esit olur. True

5) Static variable’a her yeni deger atamasi oldugunda, degeri tum objeler icin degisir. True

6) Bir class’i kullanarak 2 instance variable’a sahip 6 obje olusturursak, 12 instance variables olusturmus oluruz. True

6) Bir class’i kullanarak 2 static variable’a sahip 6 obje olusturursak, 2 static variables olusturmus oluruz. True


___________Static Blocks_________

kod blogudur. static olarak isaretlenir. herseyden once static kod calisir. main method'dan bile once calisir

-Static bloklar class ilk calistirildigi anda calisir ve class’in baslangic degerlerini olusturur(initiliaze).

-Static bloklar tum class uyelerinden, main method’dan bile once calisir





 */
