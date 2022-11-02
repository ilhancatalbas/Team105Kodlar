package ders08_ternarySwitch;

public class C03_Ternary {
    public static void main(String[] args) {

        int a=5;

        // ternary operatoru tek basina kullanilamaz
        // ternary bize bir sonuc uretir
        // bu sonucu ya direk yazdiracagiz yada bir variable a atamaliyiz

        //  a%2==0 ? "cift sayi" : "tek sayi"             bu olmaz bunu stringe atamaliyiz

        String sonuc= a%2==0 ? "cift sayi" : "tek sayi";




        //  String sonuc2= a>10 ? "Buyuk sayi yazdir : "2*a ;         bunuda kabul etmez java
        //                                                            biri string digeri int   farklilar


        // ternary nin sonucunu bir variable a atayacaksak
        // true ve false durumlarinda uretilecek sonucun ayni data turune uygun olmasi gerekir.
        // aksi halde CTE olusur.  CTE (compaine time error - altini kirmizi cizmesi)
        // CTE vermemesi icin "" tirnakla stringe cevrilebilir
        // yada stringe cevirmeden soutla yazdirirsan sorun olmaz

        // ama ternary'i sout icinde kullanirsan sonuclarin data turunun ayni olmasi sart olmaz




    }
}
