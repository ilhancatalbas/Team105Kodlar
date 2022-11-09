package ders13_nestedForLoop_methodOlusturma;

public class C00_Aciklama {
}

/*  ______Method Olusturma_______


   1-Method : yapmayi planladigimiz bir islemi yapip bize sonuc dondurmesi icin olusturdugumuz kod blogudur. (Robot gibi)

   2- Method olusturmak bazen islemin kendisini yapmaktan daha uzun olabilir, ancak Java OOP konsept cercevesinde, bir kodu bir kere yazip tekrar tekrar kullanmaya uygun bir dil oldugundan,
      tekrar tekrar yapacagimiz bir islem icin, her seferinde kod yasmak yerine, bir kere method olusturup, ihtiyacimiz olan her sdeferinde bu method’u kullanmayi tercih ederiz

   3-Temel olarak 2 cesit method vardir.
                                          1-bir islemi yapip bize sonuc dondurmeyen veya sadece yazdiran method’lar. (elektrik faturasini yatiran cocuk gibi)
                                          2-Bir islem yapip bize bir sonuc döndüren method’lar (ekmek getiren kapici). Butur method’larda, method’dan dönen sonucu ya direk yazdirir
                                            veya bir variable’aatayabiliriz.


    Nicin bir islemi main method icerisinde yapmak yerine method olusturmayi tercih ederiz ?
    1-Projemiz icerisinde tekrar tekrar kullanacagimiz bir islem icin her seferinde yeniden kod yazmak yerine bir kere yazip ihtiyacimiz oldukca kullanmak (OOP Consept)
      Ornegin faktoryel hesaplamak zor bir islemdegildir, ama her ihtiyacimiz oldugundayeniden faktoryel hesaplamak icin kodyasmak yerine
      bir kere method olarak yazipne zaman lazim olsa kullanmak daha pratikolacaktir.

    2-Calistigimiz class’i ve main method’u basit bir yapida tutup, sectigimiz uygun isme sahip method’larla kodumuzu daha anlasilabilir hale getirmek.

    - Bir method’un sonuc olarak bize bir deger dondurmesini saglar. Matemetik islemlerindeki sonuc gibidir.
     Ornegin String method’larini incelerken, hem ne is yaptigina, hem de bize sonuc olarak hangi data turunden bir sonuc dondurdugune bakiyorduk.


   Method’lar bize bir sonuc döndürüp döndürmedigine gore 2’ye ayrilir.
   1-Bazi method’lar gorevlerini yapar ama bize herhangi bir data turunde sonuc dondurmezler. Bu tur method’larin return type’i void olur.
     Ornegin ogrenci kaydi yapan bir method dusunelim, amac , kayit yapan kisiye bir sonuc dondurmekten ziyade ogrenciyi kayit yapmaktir.
     Belki kayit islemi tamamlandi diye bir sonuc yazdirilabilir ama bu yazdirma islemi asil amac degildir.
     “Kayit basariyla yapildi” yazan ama kayit yapmayan bir method calisti Kabul edilemez.Bu tur method’lari fatura yatirmaya yolladigimiz cocugumuz gibi dusunebiliriz.
     Amac faturayi yatirmaktir, bize bir makbuz getirmesi degildir.

   2-Bize sonuc döndüren method’lar. Cogu zaman method’lar bize bir sonuc döndürmesi icin olusturulur.
     Bu method calistiginda konsolda bir sey de goremeyiz, str da degismez. Bize sonuc döndüren method’lar ya direk yazdirilmali veya data turune uygun bir variable’a atanmalidir.
     Markete alisverise giden kapici gibidir, bizim istedigimiz urunu getirir. Onun getirmesi yetmez biz de kapicinin getirdigi urunu ondan almaliyiz.


   void mi yoksa return type’li method mu tercih edilmelidir ?
     Bu tercih bize verilen gereksinim (requirements)’a gore bizim belirleyecegimiz bir durumdur.
     Ancak return type’i olan method’lar daha avantajlidir. Void bir method’a sonuc dondurtemeyiz ama sonuc donen bir method’u System.out.println( ) icinde kullanip sonucu yazdirabiliriz.


   Bir method olusturmak istedigimizde kullanilacak syntax soyledir.
                                                                     public static void toplama (int sayi1, sayi2,0){}
   1-access modifier : method’a proje icerisinden nerelerden ulasilabilecegini belirler.
              public :  Proje icerisinde tum class’lardan kullanilabilir.
           protected : Sadece icinde bulundugu package ve child class’lardan kullanilir
             default : Sadece icinde bulundugu paket(package)’den kullanilir
              private: Sadece bulundugu class’da kullanilabili

   2-static : Access modifier olmadigi halde method ve variable’lar icin erisimi duzenler. staticolarak isaretlenmis method’lar, method disinda bulunan variable ve
              method’lardan sadece staticolarak isaretlenmis olanlara direk ulasabilir. main method static olarak isaretlendiginden (simdilik) main method’dan cagiracagimiz method’lari da static yapacagiz.

   3-return type : Method’un hangi data turunden bir sonuc urettigini belirtir. Gorevi sadece birsey yazdirmak olan method’larin return type’i void olarak belirlenir.
                   Method’un gorevi bize bir sonuc dondurmek ise, dondurecegi dataya uygun bir return type secilmeli,
                   method’un sonunda ise return keyword’u ile beklenen data turunden bir deger dondurulmelidir.
                   Return type’i void olan method’lar cagrildiginda, sadece yazdirma islemi yapabilir, Void olmayan method’lar ise bize bir deger dondurur ve biz de o degeri kaydederiz,
                   Sonucu bir variable’a atadiktan sonra istedigimiz zaman yazdirmak mumkun olacaktir.

   4-method ismi : Method ismi olarak istedigimiz ismi secebiliriz, ancak method’un islevi ile isminin uyumlu olmasi tercih edilir.
                   Method isimleri kucuk harfle baslar ve camelCase kuralina uygun olur.

   5-parametre : ( ) icerisine yazilan variable’lardir. Bir method cagrildigi zaman (method call) parametrelerine uygun argument’ler ile cagrilmalidir.

   NOT: Java, herhangi bir method call ile karsilastiginda once method call’daki argument’ler ile method’daki parametre’leri karsilastirir uyumlu degilse CTE verir.

   6-method body : Suslu parantezler arasinda kalan ve kodlarimizi yazdigimiz bolumdur.

   Soru  : Method nerede olusturulabilir ?
   Cevap : Class icerisinde, main method veya diger var olan method’larin disinda olmalidir.
           Method’larin main method’dan once veya sonra olmasinin farki yoktur.
           Method’lar cagrilmadan calismaz, cagrilinca da nerede olursa olsun Java bulup calistirir.



 */
