package ders11_stringManipulations;

public class C05_repeatTrim {

    public static void main(String[] args) {

        String str = "java guzeldir ";               // yanyana yazar.  alt alta yazdirmak icin \n koy.  "java guzeldir\n "

        System.out.println(str.repeat(4));     //java guzeldir java guzeldir java guzeldir java guzeldir

        str = "   Java guzeldir   ";

        System.out.println(str.length());        // 19

        // .trim   bosluklari silmek icin kullaniliyor.  yukaridaki metnin basinda sonunda 3'er tane space var
        // length  uzunlugu 19 vermis. bunu trimle yapinca bosluklar silinecek.

        str=str.trim();

        System.out.println(str);            // Java guzekdir
        System.out.println(str.length());   //13



    }
}
