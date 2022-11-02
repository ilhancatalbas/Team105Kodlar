package ders09_stringManipulations;

public class C03_EqualsIgnoreCase {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";
        String str3 = "ALI";

        System.out.println(str1.equals(str2));      //false
        System.out.println(str1.equals(str3));      //false

        System.out.println(str1.equalsIgnoreCase(str2));        //true
        System.out.println(str1.equalsIgnoreCase(str3));        //true

        System.out.println(str1.equalsIgnoreCase("Ali Can"));      //false

        // equalsIgnorecase ayni metnin buyuk kucuk harf kullanilarak olusturulan
        // farkli yazilimlari birbirine esit olarak kabul eder.
        // yani equalsIgnoreCase icin ali, Ali, ALi, aLi birbirine esittir.
        // ama kelimede farklilik varsa bunlari tolere etmez
        // bosluklari farkklilik olarak kabul eder. birinde var digerinde yoksa
        // ali ile ali.  birbirine esit degildir
        // ali   ile   a li birbirine esit degildir




    }
}
