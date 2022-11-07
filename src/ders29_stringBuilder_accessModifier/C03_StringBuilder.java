package ders29_stringBuilder_accessModifier;

public class C03_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java ne kadar guzel");

        System.out.println(sb.substring(4));                      // ne kadar guzel
                                                                        // bizim kullanfigimiz method bize Sring builder degilde String donduruyorsa, ozaman immutable oldugu icin atama yapilmadikca degisiklik olmaz.
        System.out.println(sb);                                         // Java ne kadar guzel

        // sb=sb.substring(0,4);                                        // atama yapmaya izin vermez. Altini cizer Neden? Sol taraf StringBuilde sag taraf String oldugundan dolayi


        // esitligin solu StringBuilder, sagi ise String
        // java non-primitive datalarda casting yapmaz
        // Ayni not Integer, Byte ve Short gibi sayilari barindiran non-primitive'ler icinde gecerlidir



        // sb guzel kelimesi iceriyor mu?

        /*
        String builder'da olmayan, String class'inda bulunan methodlari kullanmak isterseniz
        once toString() ile String'e cevirip, sonra String manipulation yapilabilir
        */

        System.out.println(sb.toString().contains("guzel"));            // true

        sb.setCharAt(5,'N');                                 // 5. indextekini buyuk  N  yaptik
        System.out.println(sb);





    }
}
