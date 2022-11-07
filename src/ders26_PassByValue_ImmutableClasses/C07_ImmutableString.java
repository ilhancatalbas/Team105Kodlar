package ders26_PassByValue_ImmutableClasses;

public class C07_ImmutableString {

    public static void main(String[] args) {

        String str = "Java candir";

        str = str.toUpperCase();

        System.out.println(str);         // JAVA CANDIR                                        // atama yapinca gayet guzel degisti :) Degerini degisrtirmedi yeni bir obje olusturdu.

        /*
        Immutable class'lardan olusturulan bir objenin degeri degistirilemez
        eger atama yaparsak Java degerini degistirmez bunun yerine yeni bir obje olusturur,
        ve bu yeni objeye yeni atadigimiz degeri atar

        eski obje bosa cikar ve garbage (copcu) collector tarafindan silinmeye bekler
         */


    }
}
