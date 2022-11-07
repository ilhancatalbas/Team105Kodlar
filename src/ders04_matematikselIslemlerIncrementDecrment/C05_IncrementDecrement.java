package ders04_matematikselIslemlerIncrementDecrment;

public class C05_IncrementDecrement {

    public static void main(String[] args) {

    // increment: deger artirma demektir. mesela benim bir variable'im var degeri 20 idi, 22 yapmak istiyorum. bu gibi durumlarda kullanilir

    // bu deger artirma islemi icin 3 fakli gosterim mevcuttur

    /*    1-      int sayi = 10;
                  sayi = sayi + 3;
                  sayi +=3                                 2 kere sayi-sayi yazmamak icin kisa yol
                  sayi++                                   burda bir-bir artirir. sadece 1 artar deger. esitlik olmasada atama yapar
                                                           Ayni sekilde diger islemler icinde kullanabiliriz
 NOT NOT ; java esitligin once sag tarafina bakar.
     */




        int sayi = 10;

        // bu sayiyi 3 arttiralim ve yazdiralim

        sayi = sayi+3;

       System.out.println(sayi);      // 13

        sayi+=3;                      // ayni islemin farkli yazim bicimi

        System.out.println(sayi);     // sonuc 16 cikti. cunku java yukaridan asagiya gelir. onceki islemde 3 ekledi, sayi 13 oldu. sonra 13'e 3 ekledi, 16 oldu




        int s=10;

        s = s+1;                   // 1. yontem     // 11

        System.out.println(s);

        s+=1;                      // 2. yontem     // 12

        System.out.println(s);

        s++;                       // 3. yontem     // 13

        System.out.println(s);

        ++s;                       // 4. yontem     // 14

        System.out.println(s);                                      // s'in degeri herseferinde bir oncekinde artip degistigi icin sonuc farkli cikiyor



        // bu sayinin degerini 1 eksiltelim

        int t =10;

        t=t-1;

        System.out.println(t);    // 9

        t-=1;

        System.out.println(t);    // 8

        t--;                                                       // -- (veya ++) variable'dan sonra yazilinca POST INCREMENT oluyor

        System.out.println(t);    // 7

        --t;                                                       // -- (veya ++) variable'dan sonra yazilinca PRE INCREMENT oluyor

        System.out.println(t);    // 6






    }
}
