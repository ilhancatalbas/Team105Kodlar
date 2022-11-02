package ders03_dataCastingWrapperClass;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi = 20;

        // genis data turundeki bir degeri
        // dar data turundeki bir variable atamak isterseniz
        // java sorumlulugu almanizi ister

        // bu sorumlulugu almak icin cast edecegimiz degerin onune
        // parantez icerisinde () cast etmek istegimiz data turu yazilir

        // ancak bu durumda data kayiplari (double dan int e gecerken virgulden sonrasi silinir) olabilir veya baskalasim olabilir.
        // mesela int byte cevirirsek tekrar tekrar basa doner

        //  mesela:  short sh = sayi;       // daha genis olan degeri daha kucuk olana atayamazsin.
                                            //  kova mantigi. ozaman bu sayisi shorta cevirecegiz


        short sh = (short)sayi;
        System.out.println(sh);      //20


        double dbl = 23.5;
        int say = (int)dbl;
        System.out.println(say);     // 23  u alir. kusurati atar

        say = 256;    //int
        byte byt = (byte)say;        // illada cevir dedik say in onune (byte) yazdik. yazdirir
        System.out.println(byt);     // byte -128 ile 127 arasi calisir. fazlasini eksi bastan tekrar baslar





    }
}
