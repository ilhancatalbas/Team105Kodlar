package ders29_stringBuilder_accessModifier;

public class C02_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Candir");

        System.out.println(sb1.reverse());                                // ridnaC avaJ

        System.out.println("Tersini yazdirdiktan sonra : " + sb1);        // Tersini yazdirdiktan sonra : ridnaC avaJ

        // bir StringBuilderi bir method'la kullanirsaniz artik o kalici olur

        System.out.println(sb1.insert(0, "."));                // .ridnaC avaJ

        // artik bu degisiklikte kalici oldu. peki bunu nasil onceki haline getirebiliriz. mesela tekrar ters yazdirirsak onceki haline doner

        sb1.reverse();                                                   // tesinin tersi, duzdur

        StringBuilder sb2 = new StringBuilder("Java Candir.");

        String str = "Java Cnadir.";

        System.out.println(sb1==sb2);   // false    icerik ayni olsa bile false verir                                     // yazi birebir ayni olsa bile false verir. 1.si new keyword oldugu icin false.
        System.out.println(sb1==sb1);   // true     sadece bir sb kendisi ile karsilastirirsa true verir                  // String havuzu sadece String icin gecerli.
        // System.out.println(sb1==str);            farkli 2 data turu == ile karsilastiramaz                             // new SringBuilder yeni bir obj olsuturmus.  birebir ayni bile olsa false verir

        System.out.println(sb1.equals(sb2));        // icerik ayni olsa bile false verir
        System.out.println(sb1.equals(sb1));        // sadece bir sb kendisi ile karsilastirirsa true verir
        System.out.println(sb1.equals(str));        // false. CTE vermez ama sonuc herzaman false doner

        System.out.println(sb1.compareTo(sb2));     // 0

        StringBuilder sb3 = new StringBuilder("Java Kandir");

        System.out.println(sb1.compareTo(sb3));     // -8         once sb1' i aliyor     Java candir     ilk harfleri basliyor karsilastirma.  C harfi  K harfi'den 8 harf geri sirada
                                                    //            sonra sb2'yi aliyor    Hava Candir     farki buldugunda diger harflere bakmiyor

        // CompareTo sadece tamamen ayni mi yoksa fakrli mi sorusunun cevabini verir.
        // tamamen ayni ise ==> 0 doner
        // farklilik avrsa  ==> ilk farkli harfi buldugunda, fakli haarflerin arasinda kac harf oldugunu verir.  mesela; j ile H harfleri   j - i - H  2 harf fark var

    }
}
