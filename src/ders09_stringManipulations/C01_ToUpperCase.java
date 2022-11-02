package ders09_stringManipulations;

import java.util.Locale;

public class C01_ToUpperCase {

    public static void main(String[] args) {

        String str= "Java Mutluluktur";

        System.out.println(str.toUpperCase());   // JAVA MUTLULUKTUR

        System.out.println(str);

        str = str.toUpperCase();

        System.out.println(str);       // JAVA MUTLULUKTUR     bu buyuk harf yapma atamasi kalici oldu

        str= "ince mehmet";

        str = str.toUpperCase();

        System.out.println(str);        // INCE MEHMET

        //  str = str.toLowerCase();

        //  System.out.println(str);        // ince mehmet

        System.out.println(str.toLowerCase(Locale.CHINESE));

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));





    }
}
