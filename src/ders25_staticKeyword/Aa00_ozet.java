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






 */
