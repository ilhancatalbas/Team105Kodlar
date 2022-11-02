package ders16_doWhileLoop;

public class C02_DoWhileLoop {

    public static void main(String[] args) {

        // 10,11,12 sayilarini toplayan bir while loop olustururalim

        int sayi=10;
        int toplam=0;

        do {
                                                                            // while loop'un calismama ihtimali var ama do while loop mutlaka bir kere calisacak
            toplam= toplam+sayi;                                            // loop bady'si en az bir kere calisacak
                                                                            // bazin mutlaka bir kere calismasini isteyebiliriz. mesela kullancidan bir deger almadan kiyaslamayi yapamabiliriz
            sayi++;                                                         // burda toplam ile sayi++  yi while'in ustune yazdik.


           } while (sayi<=12);

        /* do while loop un iki avantaji vardir
           1- loop body'si en az bir kere calisir
              (while loop'da baslangiv degeri uygun degilse, loop body'si hic calismayabilir
           2-  while bitis kontrolu loop kadar calisir
              (while loop'da bir kere fazla calisirdi)

         */

        // yani while loop un calismama ihtimali var
        // ama do while loop'un hic bir sart olmaksizin body'si bir kere mutlaka calisiyor



    }
}
