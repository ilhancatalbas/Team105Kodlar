package ders12_forLoops;

public class C05_calisma_rakamlar_toplami {
    public static void main(String[] args) {

        // kullanicinin verdigi sayinin rakamlar toplamini bulunuz

        int sayi = 24687531;                   // kullanicinin verdigi sayi
        String sayiStr = ""+sayi;              // int sayiyi Stringe cevirdik

        int birlerBasamagi = 0 ;
        int rakamlarToplami = 0 ;

        for (int i = 1; i <= sayiStr.length(); i++) {             // buraya sayiStr.length() yaparak dinamik bir kod yaptik

            birlerBasamagi = sayi%10;                             // bu formulun mantigi - rakamlar toplami 4. gun dersi
            rakamlarToplami = rakamlarToplami+birlerBasamagi;
            sayi=sayi/10;

        }

        System.out.println(rakamlarToplami);       // curly braces in icine yazsaktik tek tek yazacakti
                                                   // disina yazarak sadece sonucu aldik
    }
}
