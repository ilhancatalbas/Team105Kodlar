package ders04_matematikselIslemlerIncrementDecrment;

public class C04_Modulus {

    public static void main(String[] args) {

        // 1453'un rakamlar toplamini bulunuz


        int sayi = 1455;

        int rakamlarToplami = 0;                         // burayi 0 degerini atiyoruz. atamazsak hata verir. derki; deger atamadin ki neyle toplayayim.
        int birlerBasamagi = 0;

        birlerBasamagi = sayi%10;                        // 1- birler basamagini al
        rakamlarToplami += birlerBasamagi;               // 2- birlerbasamagini rakamlar toplamina ekle
        sayi = sayi/10;                                  // 3 birler basamaginndan kurtul. bir sonraki basamaga sayiyi 10'na bolerek gecebilirsin

        birlerBasamagi = sayi%10;
        rakamlarToplami += birlerBasamagi;
        sayi = sayi/10;

        birlerBasamagi = sayi%10;
        rakamlarToplami += birlerBasamagi;
        sayi = sayi/10;

        birlerBasamagi = sayi%10;
        rakamlarToplami += birlerBasamagi;
        sayi = sayi/10;

        System.out.println("Verilen sayinin rakamlar toplami : " + rakamlarToplami);

    }
}
