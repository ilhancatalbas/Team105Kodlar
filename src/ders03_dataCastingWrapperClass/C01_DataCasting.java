package ders03_dataCastingWrapperClass;

public class C01_DataCasting {

    public static void main(String[] args) {

        // bazi data turleri asla birbirine cast edilemez

        // String str=20;  hata veriyor diyorki:  required type String ,  Provided int  diyor olmaz diyor
        // boolean mutluMu="true";       olmaz diyor altini kirmizi ciziyor

        double s=20;                                        // 20 normalde int ama yazmayi kabul etti.
        int sayi= 15;
        long ln = sayi;                                     // esitligin sol tarafi long, sag tarafi yani deger int     java itiraz etmedi


        // dar data turunden bir degeri genis data turundeki variable atama yaparsaniz
        // java bunu otomatik olarak yapar

        short sh=23;                                        // kabul eder, buyuk kova kucuk kova ornegini hatirla
        int a=sh;

        long lng=sh;                                        // kabul eder, buyuk kova kucuk kova ornegini hatirla

        float fl=lng;                                       // kabul eder, buyuk kova kucuk kova ornegini hatirla
                                                            // lng yerine sayi yazsaydik sonuna f harfini koyacaktik

        // ama tersini yapmak isterseniz
        // yani buyuk data turundeki bir degeri kucuk data turundeki bir variable atamak isterseniz
        // java bunu kabul etmez

        //      double dbl=20;
        //      a=dbl;              // java kabul etmiyor itiraz ediyor





    }

}
