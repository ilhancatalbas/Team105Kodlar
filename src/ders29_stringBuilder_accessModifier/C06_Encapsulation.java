package ders29_stringBuilder_accessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {

    /*
        Buyuk projelerde datay gorme (read) veya datayi degistirme yetkilerini (write)
        yetkilerini birbirinden bagimsiz olarak duzenlemek istenebilir.             yani gorsun ama yazamasin yazsin ama goremesin

        Access modifier ile class uyelerine baska class'lardan erisim sinirlandirilabilir
        ANCAK
        ulasilabilen dataya hem okuma hem yazma yapilabilirken
        ulasilamayan data ne okunabilir ne de degistirebilir.                   yani access modifier ile bu problemi cozme ihtimali yok. ozaman yeni bir sinirlandiriciya ihtiyac var

        gercek hayattaki ihtiyaclar dusunuldugunde java'ya yetki sinirlamayi uyarlamak istersek

        -Eger okuma ve yazma yetkisini birlikte vermek veya vermemek soz konusu ise access modifier kullanilir

        -Egre okuma ve yazma yetkileri birbirinden ayrilacaksa access modifier yeterli olmaz
        Encapsulation (getter ve setter method'lari) kullanilmalidir.
*/

    // get ve set daha onceki java objelerinde karsimiza cikmisti

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);

        // sayilar.get()                                              // sayilar.get uygulamasina deger atamasi yapamayiz. atama kabul etmez. Sadece getirir.
                                                                      // Okumaya izin var, ama deger atamaya (yazmaya) izin yok

        // System.out.println(sayilar.set(1));                        // deger vermek istemiyorum. sadece sayilar.set diyip, 1. sini gormek istiyorum.  olmazz
                                                                      // bu seferde diyorki;  set varsa  mutlaka deger atamalisin   diyor.
                                                                      // eski eleman kacti seni ilgilendirmez, sen degerini ata diyor



    }
}
