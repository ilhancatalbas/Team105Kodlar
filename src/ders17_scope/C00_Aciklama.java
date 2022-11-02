package ders17_scope;

public class C00_Aciklama {
}
    //___________SCOPE____________

    // variable'lar nereye ulasabilir, variable'lar nereden kullanilabilir

    // SCOPE; bir variable in erisebildigi alandir. 2 ana gruba ayrilir
    // 1- local variab'ler
    //    Local variable lar bit method veya kod blogu icerisinde olusturulan variable'lardir.
    //    local variable'lari scopu icerisndeki olusturulduklari kod blogudur. o blogun disinda kullanilamazlar
    //    bir methodun icerisinde local varibale olusturduysaniz sadece o methodun icerisinde kullanabilirsiniz
    //    disinda kullanmaya calisirsaniz CTE hatasi verir
    //    Local variable'lar deklare edilirken deger atama mecburiyeti yoktur ama kullanmadan once mutlaka deger atamasi yap. yoksa CTE hatasi verir

    // bir loop icerisinde olusturulan variablae sadece o loop icerisinde gecerlidir

    // for loop yada loop icerisinde olusturulan varibale'lar bunlarin disindada kullanilamazlar malesef
    // local'inde local'i olarak dusunebilirsin

    // bir method'un icerisinde olusturulan variable'larin scope'u
    // icinde olusturulduklari method'dur
    // o method disindan ULASILAMAZLAR

    //    Local variable'larin deger atamadan olusturulabilir ancak KULLANILAMAZ
    //    kullanmadan once deger atanmis OLMALIDIR

    // 2- class level variable'lar instance ve static olmak uzere 2'ye ayrilirlar
    //    class level da olusturulacak bir variable stativ veya instance yapilmasina o variable'in class olusturululacak objeler ile iliskisine  bakilarak karak verilir

    //    (mesela hastane ornegi) Hastane adi, hastane adresi, telefonu gibi bilgiler tum objeler icin ortaktir ve her bir obje icin ayri ayri atama yapilmasina gerek yoktur
    //    Ancak, personel adi, personel adresi, telefonu veya cihaz no vs gibi bilgiler objelere ozeldi ve her obje icin birbirinden farkli olabilir

    //  ARA NOT: javada class lar obje olusturmam icin vardir.

    //    bir variable butun objeler icin ortak olacaksa (hastane adi ornegi gibi) onlari static olarak isaretleriz
    //    bir class da static olarak isaretlenmis bir variable varsa, bu variable olusturulacak tum objeler icin gecerlidir

    //    Static olmayan variable'lara instance variable diyoruz

    //  ARA NOT: static bir clup gibidir. clube uye olmayanlarla muhattap olmazlar

    /* class level variable'larin scope'u tum class'dir
           static kelimesi ile isaretlenen variable'lara class icerisinde heryerden ulasilabildigi icin diger adi class variables'dir.'

           static kelimesi ile isaretlenmeyen variable'lara ise instance variable denir.
           isntance variable'lar objelere bagli olduklarindan bu variable'larin diger adi object variables'dir
     */

/*
    Java Runtime programdir.    yani nedir
    calismaya basladiginda variable'lara atanan degerleri isler
    calistigi muddetce yapilan degisiklikleri kaydeder
    ama calismasi bittiginde degisen degerler resetlenir
     */


//  Scanner scan = new Scanner(System.in);     // aslinda bu obje olusturmadir. nereden? Scanner class'indan


// Scope: class icerisinde olusturulan variable'larin kapsamini (nereden erisebilecgini) belirler
// temel olarak 4 scope'dan bahsedebiliriz
// Class Level'da olusturulan variable'lar class'in tamamninda gecerlidir, ancak direk erisim icin static keyworld belirleyicidir
//    1- static olarak tanimlanan variable'lara tum method'lardan ulasilabilir
//    2- static olarak tanimlanmayan (instance) variable'lara sadece static olmayan method'lardan ulasilabilir
// Local olarak olusturulan variable'lar sadece tanimlandiklari scope'da gecerlidirler. (herkes oturdugu mahallede taninirlar)
//    3- bir method'da olusturulan variable'lara sadece o method'dan ulasilabilir
//    4- Loop icerisinde olusturulan variable'a loop disindan erisilemez