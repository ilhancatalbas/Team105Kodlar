package ders10_stringManipulations;

public class C03_StarsWith {

    public static void main(String[] args) {

        String str = "manti acarken java ogrenilmez";

        // 1. kullanim startsWith(String prefix)

        System.out.println(str.startsWith("Manti"));   // false     neden false cunku burda buyuk 'M' var. aslida kucuk 'm' ile basliyor

        System.out.println(str.startsWith("m"));       // true      evet kucuk m ile basliyor

        System.out.println(str.startsWith("manti acarken java ogrenilmez"));   //  true

        System.out.println(str.startsWith(""));   // true        mantiksal olarak dusunuldugunce en basta hiclik var. true oluyor



        // 2. kullanim startsWith(String prefix, int toffset)
        // yani diyorki su index e git. bakbakail bununlami basliyor. sonuc true yada false dur

        System.out.println(str.startsWith("acarken", 6));   //true  // diyorki 6. index i bul. 6. index ve sonrasi acarken ilemi basliyor diye soruyor. burda true

        System.out.println(str.startsWith("manti", 0));     //true  // 0. index ve sonrasi "manti"  ile mi basliyor

        System.out.println(str.startsWith("java",0));       //false  // soru su 10. index ve sonrasi "java" ilemi basliyor


    }
}
