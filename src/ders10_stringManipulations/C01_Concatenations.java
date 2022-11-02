package ders10_stringManipulations;

public class C01_Concatenations {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Guzeldir";
        boolean bl = true;
        int sayi = 20;
        double dbl = 3.54;

        System.out.println(str1+bl+sayi);   //Javatrue20    //  basta string oldugu icin hepsini stringlestirecek
                                                            // String strong u hatirla. neyle toplarsan topla, onu stringlestirir

        // System.out.println(bl+sayi);       // String dilindeki data turlerinde toplama yapmamaiza izin vermeyebilir

        System.out.println(sayi + dbl);      // itiraz etmiyor.  bunun sonucunu double gore yazacak. cunku genis olana gore davraniyor


        //System.out.println(str1.concat(bl));  bk nin altini ciziyor ve bunu kabul etmiyor


        // CONCAT:
        // concat() methodu sadece String variable'lari birlestirmek icin kullanilir

        System.out.println(str1.concat(" ").concat(str2));



    }
}
