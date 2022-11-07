package ders30_encapsulation;

public class C00_OzetVeAciklama {
}

/*
  ____onceki ders ozet___

 1-  Access modifier ve encapsulation classs uyerlerine erisimi duzenleyen Java conseptlerdir.

 2- Access modifier class uyelerini erisimi sinirlandirabilir ancak yetkileri okuma ve yazma seklinde ayiramaz,
    eriselebiliyorsa hem yazip hem okuyabilir, eriselemiyorsa ne yazabilir, ne de okuyabilir.

 3- gercek hayattaki projelerd okuma ve yazma yetkilerini ayirmamiz gerekebilir,
    bu durumda sorunu Access modifier ile cozemezsiniz, devreye encapsulation girer.

 4- Genel olarak okuma yetkisi icin getter, yazma yetkisi icin setter methodlari kullanilir



 ______Encapsulation______
 - Encapsulation da getter ve setter'lara JavaBeans  denir

 - Encapsulation, Java’nin OOP consept’inin temel bilesenlerindendir.

 - Encapsulation, bir obje icin onemli olan variable ve method’lari bir class’a koyup, bu variable ve method’lara erisim yetkisini okuma(getter) ve yazma(setter) olarak ozellestirebilme amaci guder.

 - Java’da bir class uyesine erisim yetkisi access modifier ile belirlenir, ancak access modifier’larla get ve set yetkisinin ayirabilmemiz mumkun degildir.

 - Encapsulation’da variable’lara atama yapma veya okuma getter ve setter method’lari ile yapildigindan, bu method’lar icerisinde datayi inceleyebilir, uygun olmayan degerlerin atanmasini engelleyebiliriz.

 -Encapsulation ile bir variable’i hem static yaparak baska class’lardan rahatca ulasilabilmesini saglayip, hem de kimsenin yeni deger atamasina izin vermeyerek variable’in degerini koruyabiliriz.

 ___Encapsulation Nasil Uygulanir?___

- Bunun icin once tum yetkileri iptal eder, sonra istedigimiz oranda erisim yetkisi duzenleriz.

        1.Adim : Encapsule edilecek class uyelerini private yapin Bu durumda diger class’lardan private class uyelerine erisim, mumkun olmayacaktir.

        2.Adim : Encapsule etmek istedigimiz class uyeleri icin yetki vermek istediginiz oranda getter ve/veya setter method’lari olusturun.   (bunlari araci gibi dusunebiliriz)

- getter ve/veya setter method’lari ayni class’da olduklari icin private variable ve method’lara rahatlikla erisebilirler.Diger class’lar da publicolan getter ve/veya setter method’larina rahatlikla erisebilirle

NOT: Encapsule edilen bir class'da sadece getter method'u olusturursak datalari okuyabiliriz ama degistiremeyiz. Bu tur class'lara immutable class denir.

     setter methodlarin isimlendirilmesi set ile baslar +variable ismi

     getter methodlarin isimlendirilmesi set ile baslar +variable ismi,   boolean data turleri icin is ile baslar







 */
