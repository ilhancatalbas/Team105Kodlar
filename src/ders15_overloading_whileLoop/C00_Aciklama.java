package ders15_overloading_whileLoop;

public class C00_Aciklama {

    // overloading: asiri yukleme ve benzer anlam cikar

    // GENEL BIR NOT:
    // Biz nokta yapip metod cagirdigimizda metodun yaninda yazilar cikiyor.
    // Method isminin hemen sagind anki yazi (signature) bize o method'da hangi data turunu kullanabilecegimiz gosteriyor.
    // ismin en sagindaki yazi ise bize hangi turde sonuc verecegini gosteriyor
    // mesela;   .substring(int beginIndex, int endIndex)         String
    // diyorki . substring icin integer data gir ben sana String sonuc vericem.

    // Method Overloading: Bir class'da ayni isimde fakat farkli method signature'ina sahip methodlarin bulunmasidir.
    //                     .method  yaptiktan sonra ismin hemen yaninda parantez icinde yazan yer.

    // Method Overloading: ayni islevi farkli parametrelerle, farkli sekilde gerceklestirmektir.

    // mesela 3 tane carpim method'u olusturabiliriz. bunlarin farki signature'larinin farkli olmasidir

    // METHOD SIGNATURE:   Method ismi - Parametre Sayisi - Parametrelerin Dizilisi    demektir

    //   method siganature degistirmek  icin parametre sayisi veya farkli data turlerindeki parametrelerin yerleri degistirilebilir

    //   Bir class da ayni isim ve ayni signature'a sahip iki metod olmaz

    //   Method overloading olan class'larda java hangi method'un calisacagina su sekilde bakar
    //   1- once method ismine bakar
    //   2- argument sayisi ile parametre sayisina bakar
    //   3- argument ve parametre uyumuna bakar
    //   4- minimum casting                                                   java en az casting yapacagi methodu secer

    //   hangisi minimum cast yaparsa onu tercih eder

    //   method call sirasinda method parantezine  yazilanlara argument diyoruz



    //                ______     WHILE LOOP    _____

    //  For loop, belirli sayida calistirilmasi gereken bir donguyu verimli bir sekilde yazmamiza olanak saglayan bir tekrar kontrol yapisidir

    // For Loop kullanirken ihtiyacimiz olan               for (int i = 0; i < 100 ; i++) {
    //          -baslangic degeri
    //          -bitis araligi (condition)
    //          -artis/azalis yontemi            bu bilgilere while loop icinde ihtiyac duyariz

    //  bunlari while loop da manuel yapariz

    //    int s=10;
    //    while(s<100){
               // calisak kodlar
    //         s++;

    // while loopla for loop ayni isleve sahiptir sadece for loop otomatik olarak olusturdugu baslangic degeri,
    // bitis kosulu ve artik bicimini manuel yapmamaiz gerekir

    // bir loop'un kac kere caliscagi belli degilse, veya bitis sarti loop degiskenine degil,
    // baska bir degiskene bagli ise while loop daha kullanisli olacaktir.
    // mesela; kullanicidan sifre istiyorsak ve yanlis giris oldugu muddetce tekrar istememiz gerekiyorsa adim sayisini bilmemiz
    //         mumkun olmadigindan while loop tercih edilebilir.
    // baslangic adimlari belliyse for loop kullanmak daha mantikli olur







}
