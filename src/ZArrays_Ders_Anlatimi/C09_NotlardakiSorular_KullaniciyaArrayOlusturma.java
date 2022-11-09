package ZArrays_Ders_Anlatimi;

import java.util.Arrays;
import java.util.Scanner;

public class C09_NotlardakiSorular_KullaniciyaArrayOlusturma {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip
        //        array’i olusturan ve
        //        bize donduren bir method olusturun.

        // bu defa parametre yok. main method'un icerisinde bisey olmayacak. Method'da olacak kullanicidan alacagiz


        int [] kullaniciArrayi = arrayOlustur();                  // bu methodu ya yazdirabiliriz yada bu degere atayabilirdik, burda degere atadik

        System.out.println(Arrays.toString(kullaniciArrayi));     // buradada yazdirdik


    }

    public static int [] arrayOlustur (){                         // butun bilgileri kullanicidan alacagi icin parametre yok

        Scanner scan = new Scanner(System.in);

        System.out.println("Olusturulacak array'in boyutunu giriniz");

        int lenght = scan.nextInt();                              // kullanicidan lenght aldigimiz icin (kac sayi olacagini) artik array'i olusturabiliriz

        int [] kullaniciArayi = new int[lenght];                 // arrayimiz olustu, icinde hic element yok. Bunuda kullanicidan almamiz gerekir. kullanicidan lenght kadar deger almamiz gerekiyor.
                                                                 // direk deger atayabildigimiz gibi, bu sekildede array olusturabiliyorduk
        for (int i = 0; i < lenght; i++) {

            System.out.println("Array'e eklenecek bir sayi giriniz");

            kullaniciArayi[i] = scan.nextInt();                  // kullanicinin girdigi array'ide kullaniciArrayi'nin i'inci index'ine kullanican alinan degeri (yani scan.nextint'i) giris yapicaz

        }

        return kullaniciArayi;




    }
}
