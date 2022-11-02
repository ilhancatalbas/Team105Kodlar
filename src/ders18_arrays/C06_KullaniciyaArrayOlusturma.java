package ders18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturma {

    public static void main(String[] args) {

        // soru 5- kullanicidan array'in boyutunu ve elementlerini alip
        // array'i olusturan ve bize donduren bir method olusturun

        // bu defa parametre yok. main methodun icinde bisey yok. nerden alicaz? kullanicidan alicaz. main method disina method olustur

        int[] kullaniciArrayi= arrayOlustur();                                       // enson yaptigimiz metodu buraya yazdik. (biz deger olarak atadik)
                                                                                     // bunu ya yazdirabiliriz yada bir deger olarak atayabiliriz
        System.out.println(Arrays.toString(kullaniciArrayi));                        // illede yazdiralim dersek; buda yazdirilmasi

    }


    public static int[] arrayOlustur(){                                               // bir parametre yok cunku main method'dan parametreye gonderilecek bisey yok.
                                                                                      // kullanicidan alicak. scanner lazim
        Scanner scan = new Scanner(System.in);

        System.out.println("Olusturulacak array'in boyutunu giriniz");                // kullanici bize bir tam sayi vermesini istedik

        int lenght = scan.nextInt();                                                  // kullanicidan length'i aldigimiz icin artik array olusturabiliriz

        int[] kullaniciArrayi= new int[lenght];                                       // boyutunu istedigi icin, [] icine kullanicidan aldigimiz length degerini yazicaz. Array'imiz olustu
                                                                                      // Array'in icinde hic element olmadigi icin bunuda kullanicidan alicaz. length kadar deger alicaz
        for (int i = 0; i < lenght; i++) {                                            // bunun icin for loop olusturduk. sifirdan baslasin length'e kadar gitsin.

            System.out.println("array'e eklenecek bir sayi giriniz");                 // herseferinde kullaniciya mesaj vercez.
            kullaniciArrayi[i] = scan.nextInt();                                      // kullanicinin girdigi arrayide, kullaniciArrayi'nin i'inci index'ine kullanicdan alinan degeri scan.nextInt'i giris yapicaz

                                                                                      // GENEL TEKRAR: kullanicida length'i aldik bir array olusturduk. sonra tum elementlere
                                                                                      // deger atamasi yapmak icin kullanicidan tekrar tekrar sayi isteyecegiz.
                                                                                      // scanle aldigimiz her sayisi o index'i array'e aticaz. En son return lazim
        }

        return kullaniciArrayi;







    }
}
