package ders23_constructors;

public class C00_aciklama {
}
/*

    NOT: instance varibale; yani objeye bagli variable

    NOT: class lari bir logo kalibi gibi dusunebiliriz. class lardan lego kaliplarindan lego yapacagiz. legolardanda oyuncaklar yapacagiz
         Dolayisiyla class'lardan objeler olusturup kullanmak icin yapariz
         her bir class objeler icin bir kaliptir

         ---------Constructors----------

         Bir class’dan bir obje urettigimizde obje temel olarak olusturuldugu class’daki
         ozelliklere sahip olur.

     Not: biz herhangi bir class olusturdugumuzda, o class'in icinde costructor var.   constructor: yapici, olusturucu, yapan kimse

         - Java’da obje olusturuldugunda alacagi ilk degerlerin ne olacagini (initialize) constructor’lar ile duzenleriz.
         - Java’da olusturulan bir obje’ye farkli Constructor ile ilk deger atamasini yaparak, ayni class’dan farkli ozelliklere sahip objeler olusturulabilir
         - Java’da obje olusturulan class’daki temel ozellikleri kullanmak istersek, parametresiz bir constructor kullanilir.

     Not: hicbir ozelligini belirtmedigimiz zaman parametresiz constructor kullaniyoruz
          yani biz bir class dan bize obje olusturmasini istedigimizde, istedigimiz ozellikleri soyleyebilir, ona gore siparis olusturabiliriz.

     NOt: en temel constructor    public class Araba {
                                     public Araba() { }
                                     }

     Ornek: bir triko (kazak) fabrikamiz var;

            Bana triko uret dersek        YildizTriko ();                       // hicbir ozelligi verilmemis constructor
            Hic bir ozellik belirtilmemis, standart urun yollariz.

            Bana mavi triko uret        YildizTriko (“mavi” );
            Sadece renk tercihi belirtilmis, 1 tane parametremiz var

            Bana mavi, bogazli yaka triko uret        YildizTriko (“mavi”,”bogazli” );
            Renk ve yaka tercihi belirtilmis, 2 tane parametremiz var

            Bana mavi, bogazli, medium, 100 ad. yaka triko uret        YildizTriko (“mavi”,”bogazli”, “medium”, 100);     dedigimizde rengini seklini boyutunu adedtini tarzini vermis oluyoruz
            uretici bizim istedgimiz ozelliklere uygun kazak uretecektir

    Not: Constructor kendisine ozel bir yapidir. variable degildir, class degildir, method degildir.   constructor = constructor dir
         onunde parantez oldugu icin methoda benzer. benzer yapiyi gordugumuzde birbirinde ayiracagimiz en onemli fark; constructor'larin return type olmaz

    Not: ismi class ismiyle AYNI DEGILSE constructor olmaz. class adiyla ayni isimde olacak

    1-Constructor’lar syntax olarak method’lara benzerler ama return type’leri yoktur
    2-Isimleri mutlaka Class ismi ile ayni olmalidir. (Buyuk harfle baslar)
    3-Static olarak tanimlanamazlar.
    4-Method overloading’deki gibi farkli signature’lara sahip istendigi kadar constructor olusturulabilir
    5-Constructor’lar class’in icerisinde, method’larin ve diger constructor’larin disinda olusturulabilirler.


   -Java’da bir obje olusturulup ona deger atanabilmesi icin mutlaka bir constructor calisir.
   -Java OOP consept geregi, her class obje uretmek icin olusturulmus bir kalip gorevi gorur.
   -Bir class olusturuldugunda biz hic bir constructor olusturmasak da, Java o class’dan obje olusturulmasina izin verir.
   -Biz constructor olusturmasak bile class’in obje olusturma gorevini yapmasi icin Java her Class’a default bir constructor koyar.
   -Default constructor parametresiz ve body’sinde hic bir kod olmayan bir constructor’dir ama gorunmez.
   -Biz bir class’da parametreli veya parametresiz bir constructor olusturunca Java default cons.’i siler.

   yani; default constructor: biz bir class olusturdugumuzda, o calss'dan obje olusturabilmemiz icin java'nin o class'a koydugu default constructor'dir
         ozellikleri: paramtresizdir, body'sinde hic bir kod yoktur, ve gorunmezdir.

   NOT: biz ister parametreli yada parametresiz, elle bir bir constructor olusturdugumuzda java kendi koydugu default constructor'i siler
        bir class da gozle gordugumuz bir constructor varsa (ozelliginin onemi yok), default constructor yoktur

   Aciklama: mesela sahibinden.com  devoloper'in her araba'yi elle giremez. constructor sayesinde bu olur

   NOT: biz objelerimizi olusturdugumuz, depo olarak kullanidigimiz bu class'lara bir tane toString koyarak, istedigimiz seyleri rahat rahat yazdirma yapabiliriz

   -Bir class’dan olusturdugumuz objelerin ozelliklerini yazdirmak istedigimizde her bir obje icin instance variable’lari tek tek yazmamiz gerekir .
   -Bunun yerine IntelliJ’de menudeki Code / Generate seceneklerini kullanarak toString( ) method’u olusturabiliriz.
   -toString( ) method’u olusturulurken kullanilacak variable’lari secebilir ve/veya method icerisindeki dondurulen String’i istedigimiz gibi degistirebiliriz.

































 */