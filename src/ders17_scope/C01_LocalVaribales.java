package ders17_scope;

public class C01_LocalVaribales {

    public static void main(String[] args) {

        // bir method'un icerisinde olusturulan variable'larin scope'u
        // icinde olusturulduklari method'dur
        // o method disindan ULASILAMAZLAR


        //bir methodun icerisinde local varibale olusturduysaniz sadece o methodun icerisinde kullanabilirsiniz

        int sayi = 10;
        String isim = "Ramazan";
    //    System.out.println(dogruMu);        //asagidaki dogrumuyu gormedi. dogrumu variable asagidaki scope ile sinirlidir


        for (int i = 0; i < 10; i++) {
            String adres="Ankara";

            // bir loop icerisinde olusturulan variablae sadece o loop icerisinde gecerlidir

        }

    //    System.out.println(adres);

        double pi;

    //    System.out.println(pi);
    //    Local variable'larin deger atamadan olusturulabilir ancak KULLANILAMAZ
    //    kullanmadan once deger atanmis OLMALIDIR


    }

    public static void method1(){

    //    System.out.println(sayi);          // yukaridaki variable'lara (mesela sayi) bu method icerisinden ulasamayaiz. Java kirmizi cizer altini. s  yazinca digerini getirmez
                                             // 'sayi' variable'nin siniri bu scope ile sinirlidir. java icinde bulundugunuz scope'a bakar. bu scope'da sayi diye bir variable yok.

    //    isim = "tugay";                    // isim variable bu scope ile sinirlidir burada yoktur. (yani mesela bu mahallede tugay diye biri yok ornegi)

        boolean dogruMu = true;



    }

}
