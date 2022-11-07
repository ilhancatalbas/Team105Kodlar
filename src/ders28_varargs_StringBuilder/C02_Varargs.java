package ders28_varargs_StringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {

        topla(5,6);
        topla(5,3,8);
        topla(2,4,6,8);
        topla(1);
        topla();
        topla(1,2,3,4,5,6,7,8,9);                    // ister 0 element, ister 1, ister 10, istegin kadar element yazabilirsin

        /*
        bir methodda parametre sayisini sinirlandirmak istemezsek, standart bir variable yerine varargs kullaniriz.
        (varargs = variable arguments demektir)

        varargs data turunun yanina  ...  (3 nokta) konularak deklere edilir
        int... ==> sayisi belirli olmayan int parametreler alan bir array'dir.

         */


    }
    public static void topla(int... sayilar) {
        int toplamSonucu=0;
        for (int each: sayilar
        ) {
            toplamSonucu += each;
        }
        System.out.println("Girilen sayilarin toplami : " + toplamSonucu);
    }
}

