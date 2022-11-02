package ders14_methodOlusturma;

public class C07_AsalSayiKontrol {

    /*Soru 3-Kullanicidan main method icinde pozitif bir tamsayi alin.
             Girilen sayinin asal sayi olup olmadigini kontrol edip,
             sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.

     */

    public static void main(String[] args) {

        int sayi = 24;

        System.out.println(asalSayiKontrolEt(sayi));       // asal degil

        System.out.println(asalSayiKontrolEt(23));         // asal


    }

    public static String asalSayiKontrolEt(int sayi){
        String sonuc="";
                                                                // bir sayinin asal olmadigini soylemek daha kolaydir.
        for (int i = 2; i <=(sayi-1) ; i++) {

            if (sayi%i==0){
                sonuc="asal degil";                         // ACIKLAMALAR GENEL:
                break;                                      // eger kod calisti ve sayiyi bulamayip asagiya indiyse, 2 ihtimalden biri olmamistir. ozaman diger ihtimaldir
            }                                               // yani sayi asal degilse ozaman asal'dir. ya asaldir yada degildir. yani asal degil dememissek o zaman sayi asal dir
        }                                                   // ayrica String sonuc= " "  basta asal da yapabilirdik.
        if (!sonuc.equals("asal degil")){                   // asal degil cikarsa degistirmis olur. asal degil  cikmazsa orjinali asal kalirdi
            sonuc="asal";                                   // ayrica break sayiyi ilk buldugu yerde dursun diye. break yazmasaydik sayi asal degili  bulsa bile
        }                                                   // diger sayilari kontrol etemeye devam edecekti. bize bir tane bulmasi icin yeterli.
        return sonuc;


    }


}
