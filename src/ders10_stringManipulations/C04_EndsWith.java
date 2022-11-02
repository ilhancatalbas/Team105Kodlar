package ders10_stringManipulations;

public class C04_EndsWith {

    public static void main(String[] args) {

       String str = "Java heryerde guzel";

        System.out.println(str.endsWith("guzel"));  // true     bu str guzel ile mi bitiyor diye soruyor

        // endsWith cesitli versiyonlari yok bir tane

        System.out.println(str.endsWith(""));      // true      hicliklemi bitiyor diye soruyor. evet

        System.out.println(str.endsWith("Java heryerde guzel"));    // true

        System.out.println(str.endsWith("Java"));    // false         // hayir java ile bitmiyor


    }
}
