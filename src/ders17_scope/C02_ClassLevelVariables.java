package ders17_scope;

public class C02_ClassLevelVariables {

    // Class level variable'lar method'larin disinda olusturulmalidir
    // genel kullanim en ustte olusturulmalaridir

    static String hastaneIsmi="Yildiz hastanesi";
    static int hastaSayisi = 23453;                              // hastanedeki hasta sayisi 1 artta bu herkes icin bir artar.
    static String basHekimIsmi;                                  // doktor alininde hemsire ayseninde bashekimi aynidir. static olmak zorunda
    String perIsmi= "Isim Girilmedi";                            // bu herkesi ilgilendirmez. static degil. isim atamayada gerek yok
    String perTelefonu;                                          // buda static degildir. bir personelin telefonu degisti diye herkesin telefonu degismez
    int perYasi;

    public static void main(String[] args) {
        System.out.println(hastaneIsmi);                         // class level varibale'lar degger atamadanda kullanilabilir
        System.out.println(basHekimIsmi);    // null
        // System.out.println(perIsmi);                             // static olmadigi icin static main method'dan kullanilamaz
        /*
        Class level variable'lar deger atamasi yapilmamis olursa
        java bu variable'lara data turune gore
        default olarak tanimlanan degerleri atar
        default degerler:
        sayisal variable'lar: 0
        boolean : false
        cahr : ''
        Objeler (String dahil) : null
         */

    }

    public static void method1(){
        System.out.println(hastaSayisi);
        hastaSayisi++;
        // System.out.println(perIsmi);

    }

    public void method2(){
        System.out.println(hastaneIsmi);    //yildiz Hastanesi
        hastaSayisi++;
        System.out.println(perIsmi);        // isim girilmedi
        System.out.println(perYasi);        //



    }

}
