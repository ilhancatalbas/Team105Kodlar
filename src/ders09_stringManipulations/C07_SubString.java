package ders09_stringManipulations;

public class C07_SubString {
    public static void main(String[] args) {

        String str= "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5,8));

        // UNUTMA sayamaya 0 dan (sifir) basliyor
        // 5. indexten baslar. (8-5) karakter yazdirir
        // 5. index dahil (inclusive), 8. index haric (exclusive)

        // gectikce yazdir

        System.out.println(str.substring(9,17));

        System.out.println(str.substring(3,7));


        String isim = "husEYIN";
        // verilen ismi ilk harfi buyuk, geriye kalanlar kucuk harf olarak kaydedin

        isim = isim.substring(0,1).toUpperCase()+                  // ilk harf alip buyuk harf yaptik
                isim.substring(1).toLowerCase();        // 1. index ve sonrasini alip kucuk harf yaptik

        System.out.println(isim);


        System.out.println(isim.substring(2,5));


        // sadece 3. index teki harfi yazdirin (e)
        System.out.println(isim.substring(3,4));

        System.out.println(isim.substring(2,2));  // "" yazdirir  2 den baslar ve 2 yi dahil etmez

        // System.out.println(isim.substring(5,2));    // StringIndexOutOfBoundsException  hatasi verdi. geriye dogru gitmez



    }
}
