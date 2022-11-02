package ders13_nestedForLoop_methodOlusturma;

public class C07_MethodOlusturma {
    public static void main(String[] args) {

        // metodlar istedigimiz islemleri yapan kod bloklaridir
        // ihtiyacimiz oldugunda metodu cagirmaya   Method Call  denir
        // bir kere yazip ihtiyacimiz oldugunca kullanma (oop konsept)
        // her ihtiyacimizda faktoriyel yazacagimiza bir kere faktoryel metodu yazip, metodu cagirip kullanmak daha mantikli
        // okul projesinde menuleri ayri ayri metodlamak daha iyi. ogrenci menu (method), ogretmen menu (method)
        // bir method'un sonuc olarak bize bir deger dondurmesini saglar. matematik islemlerindeki sonuc gibi
        // eski hazir metodlari hatirla, strinde mesela toLowercase  gibi
        // yazdigimiz metodlar bize ne donduruyor bakariz. string, int, boolean vs vs.  metodun sagindada yaziyor zaten

        // methodlar bize sonuc dondurup dondurmedigine gore 2'ye ayrilir

        // 1-) islemi yapar ama sonuc yazdirmayabilir. asil onemli olan islemi yaptmasidir. okul kayit ornegini hatirla. onemli olan kayit olmasi belge vermesi degil
        //     bu metodlara void diyoruz. return type'ini void yapiyoruz
        //     (mesela cocugun gidip fatura yatirmaya gitmesi. onemli olan faturayi yatirmasi. makbuz getirmesi onemli degil

        // 2-) bize sonuc donduren metodlar.
        // mesela kapici cafer ornegi. kapiciya ekmek icin para odediysek onun ekmegi getirmesi lazim
        // ama kapiya ekmegin gelmesi yetmez . onu eve alip kullanmamiz lazim

        // mesela bize sonuc donduren metodu variable atayabiliriz. bunu sonra cagirip kullanabiliriz.

        // void  yazdiran demek. islem yapip bize bisey dondurmeyen
        // return Type olan yazdirandir ama ister yazdir ister yazdirma (biz biliriz)

        // method olusturmak icin temel syntex soyledir

        //     public static void toplama(int sayi1, int sayi2){
        //     System.out.println( sayi1 + sayi2 );
        //     }

        // 1- access modifier: method'a proje icerisinden nerelerden ulasabilecegimiz belirler. 4 tane vardir
        //    public: (halka acik demek) proje icerisinde tum class'lardan kullanilabilir
        //    protected: sadece icinde bulundugu package ve child class'lardan kullanilabilir
        //    default: sadece icinde bulundugu package'den kullanilir
        //    privite: sadece bulundugu class'da kullanilir

        // 2- static: static'i bir club gibi dusun. eger bir method static club'une uye ise sadece static club'une uyelerle muhattab olur
        //            static olarak isaretlenmis method’lar, method disinda bulunan variable ve method’lardan sadece static olarak isaretlenmis olanlara direk ulasabilir.
        //            Access modifier olmadigi halde method ve variable’lar icin erisimi duzenler.

        // 3- return type: method'un hangi data turunden sonuc urettigini belirtir. void ise ben sana birsey dondurmicem der
        //                 int derse int, string derse string vb dondurur.
        //                 eger void degilse en sonda 'return' kelimesi olur. return dondur demektir. (bizde kapicidan ekmegi alicaz ister yeriz ister saklariz)

        // 4- method ismi: istedigimiz ismi kullanabiliriz. sadece yapacagi islemle ilintili olmali. anlamli olmali

        // 5- parametre: parantez icinde yazilan degiskenlere diyoruz.

        // NOT: main'siz Method calisir ama class calismaz. bir class'da run tusunun cikmasi icin main olusturmamiz lazim




        String str = "Java muhtesemdir";
        String buyukStr = str.toUpperCase();

        System.out.println(str);           // Java muhtesemdir
        System.out.println(buyukStr);      // JAVA MUHTESEMDIR

        // metnin buyuk harflere cevrilmis hali S icerir mi?

        System.out.println(buyukStr.contains("S"));    // true

    }
}
