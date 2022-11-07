package ders28_varargs_StringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {

        topla(5,6);

        // topla(5,3,8);             // dediki java 2 seyi kontrol eder. 1 simi   2 variable ve parametrenin uyumlu olmasi. 3 argument oldugu icin kabul etmedi.
                                     // altini kirmizi cizdi alternatifleri soyluyor. more actions
        topla(5,3,8);

        topla(2,4,6,8);             // 4 parametreli bir method olusurduk

        // parametre sayisi degistikce bizden yeni method olusturmamaizi ister.



    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("4 sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));    //4 sayinin toplami : 20
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {                   // 3 sayinin toplami : 16
        System.out.println("3 sayinin toplami : " + (sayi1+sayi2+sayi3));
    }

    public static void topla(int sayi1, int sayi2) {
        System.out.println("2 sayinin toplami : " + (sayi1+sayi2));               // 2 sayinin toplami : 11

    }
}
