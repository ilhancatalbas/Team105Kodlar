package ders12_forLoops;

public class C06_DikkatEdilecekler {

    public static void main(String[] args) {

        /* SONSUZ LOOP

        for (int i = 0; i < -10; i++) {

            System.out.println(i+"");


         }
                                           */


        // ilk deger bitis sarti true olmuyorsa
        // for body'si hic devreye giremez



        for (int i = 0; i >10 ; i++) {

            System.out.println(i);

        }

        // bir loop'un sonunu bekelemeden bitirmek istersek

        // mesela; kullanicinin verdigi bir sayinin asal sayi olup olmadigini bulun
        // asal sayi: 1 ve kendisinden baska sayiya bolunmeyen sayidir

        int sayi= 5300;
        boolean bayrak=false;         // buraya bayrak koyarak yapiyoruz. asalmi degil asalmi degil....
                                      // asali bulunca duracak

        for (int i = 2; i <=sayi-1 ; i++) {                   //sayi -2  ile 102 ye kadar demek istiyoruz

            if (sayi %i==0){
                bayrak=true;           // askimiz bitti         // yaptigimiz bayrakla true gorunce duracak
                break;
            }

        }

        System.out.println(bayrak);

        if (bayrak){
            System.out.println("asal sayi");
        }else{
            System.out.println("asal sayi degil");
        }
    }
}
