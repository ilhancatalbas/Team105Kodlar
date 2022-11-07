package ders26_PassByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class C06_ImmutableClasses {

    public static void main(String[] args) {

        String str = "Java Guzeldir";

        System.out.println(str.toUpperCase());   // JAVA GUZELDIR

        System.out.println(str);                 // Java Guzeldir

        str.toLowerCase();

        System.out.println(str);                 // Java Guzeldir

        // String immutable oldugu icin, method ile yapilan degisiklikler String'i kalici degistirmez

        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("B");

        harfler.remove(0);

        System.out.println(harfler);          //[B]        // yaptigimiz her degisiklik listede kalici olarak degisiklik yapti

        // List ve Array mutable oldugu icin method ile yapilan degisiklikler kalici olur.

    }
}
