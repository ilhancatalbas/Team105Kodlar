package ders12_forLoops;

public class C05_calisma_rakamlar_toplami {
    public static void main(String[] args) {

        // kullanicinin verdigi sayinin rakamlar toplamini bulunuz

        int sayi = 1453;                                          // kullanicinin verdigi sayi
        String sayiStr = ""+sayi;                                 // Hiclik ile (""), int sayiyi Stringe cevirdik. Stringe cevirince length'ini alabilecegiz, dinamik kod olacak

        int birlerBasamagi = 0 ;
        int rakamlarToplami = 0 ;

        for (int i = 1; i <= sayiStr.length(); i++) {             // buraya sayiStr.length() yaparak dinamik bir kod yaptik

            birlerBasamagi = sayi%10;                             // bu formulun mantigi - rakamlar toplami 4. gun dersi
            rakamlarToplami = rakamlarToplami+birlerBasamagi;     // sonra bu birler basamagini rakamlar toplamina ekleyecek.
            sayi=sayi/10;                                         // buda birler basamgiyla ismiz bittigi icin, birler basamagindan kurtulmak icin
        }

        System.out.println(rakamlarToplami);                      // curly braces in icine yazsaydik tek tek yazacakti
                                                                  // disina yazarak sadece sonucu aldik
    }
}
