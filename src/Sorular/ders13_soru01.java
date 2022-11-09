package Sorular;

public class ders13_soru01 {

    public static void main(String[] args) {

        //     kullanicinin verdigi sayinin rakamlar toplamini bulunuz


        /*int sayi = 1453;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=sayi%10;
        rakamlarToplami += birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami += birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami += birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami += birlerBasamagi;
        sayi=sayi/10;

        System.out.println(rakamlarToplami);

         */


        //     kullanicinin verdigi sayinin rakamlar toplamini bulunuz


        int sayi = 295326;
        String str = ""+ sayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        for (int i = 1; i <=str.length(); i++) {

            birlerBasamagi = sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
        }

        System.out.println(rakamlarToplami);


    }


}
