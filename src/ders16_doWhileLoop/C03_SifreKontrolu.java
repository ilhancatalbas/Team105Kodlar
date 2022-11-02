package ders16_doWhileLoop;

import java.util.Scanner;

public class C03_SifreKontrolu {

    public static void main(String[] args) {

        // sorunun genel anlatimi en altta var

        /*Soru 2-Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
                 kontrol edin ve sifredeki hatalari yazdirin.
                 Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
                 sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
                  -Sifre kucuk harf icermelidir
                  -Sifre buyuk harf icermelidir
                  -Sifre ozel karakter icermelidir
                  -Sifre en az 8 karakter olmalidir.

         */

        Scanner scan = new Scanner(System.in);
        String sifre="";
        int bayrak;
        boolean sifreDogruMu;

        do{
            System.out.println("Lutfen bir sifre giriniz");
            sifre=scan.nextLine();
            // tum hatalari soylemesini istiyorsak, bagimsiz if cunleleri ve bayrak kullanmaliyiz
            bayrak=0;
            int sonuc = kucukHarfKontroluYap(sifre);                   //kucukHarfKontroluYap  metodu yok. eger yaklasirsan maouse ile java istiyorsan boyle bir method olusturayim dioyr
            // kucuk harf kontrolu yapan bir method olustururalim
            // kucuk harf varsa 1, yoksa 0 dondursun
            bayrak = bayrak + sonuc;

            // Sifre buyuk harf icermelidir

            sonuc = buyukHarfKontroluYap(sifre);
            // buyuk harf kontrolu yapan bir method olustururalim
            // buyuk harf varsa 1, yoksa 0 dondursun

            bayrak = bayrak+sonuc;

            // -Sifre ozel karakter icermelidir
            sonuc = ozelKarakterKontroluYap(sifre);
            bayrak = bayrak+sonuc;

            //-Sifre en az 8 karakter olmalidir.
            if (sifre.length()<8){
                System.out.println("Sifre enaz 8 karakter olmalidir");
            }else {
                bayrak++;
            }

            // bayrak 4 ise sifre tamam, degilse hata vardir
        }while (bayrak !=4);                                     // bayrak 4 olmadigi muddetce tekrar tekrar caliscak
        System.out.println("Sifreniz basariyla kaydedildi");     // while loop'un disina ciktiysa bunu yazdiri. demekki dongu bitmis

    }

    public static int ozelKarakterKontroluYap(String sifre) {

        int bayrak = 0;
        String ozelkarakterler = "-=?><!@#$%^&*()_+/*";
        // sifre ozel karakter icermelidir
        // bunun icin tum harfleri kontrol edecek bir for loop olusturmaliyim
        // eger sifrenin karakterlerinden bir tanesini ozelKarakterler String'i iceriyorsa bizim icin yeterli olur

        for (int i = 0; i < sifre.length(); i++) {
            if (ozelkarakterler.contains(sifre.substring(i,i+1))){
                bayrak++;
                break;
            }
        }
        // bayrak==0 ise ozel karakter yoktur, yani bir hata var var bunu yazdiracagiz
        if (bayrak==0){
            System.out.println("Sifre ozel karakter icermelidir");
            return 0;
        }else return 1;
    }

    public static int buyukHarfKontroluYap(String sifre) {

        int bayrak=0;
        // Sifre kucuk harf icermelidir
        // bunun icin tum harfleri kontrol edecek bir for loop olusturmaliyim
        // 1 tane kucuk harf bulmam yeterli olacak. (yeterli olacagi icin degil kullanmayacagiz)

        for (int i = 0; i < sifre.length(); i++) {                                                   // eger butun harfleri tek tek kontrol edeceksek, do'nun icinde for loop lazim.
                                                                                                     // 0'dan baslalayip sifre.lenght'ine kadar gidecek. esitlik olmadigi icin -1 ototmotik olarak gelecek
            if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){                                       // sifrenin i'inci index'indeki elementi kontrol edecegiz. bir tanesi kucukse bayragi 1 arttiracak
                bayrak++;                                                                            // bu arada biz; kucuk harf olmali diyoruz. olmamali deseydik hata yazdirsaydik ozaman ! yapip degildir yapacaksyik
                break;                                                                               // hata aramadik. tam tersine kucuk harf bulduk diye bayragi 1 arttikdik
            }                                                                                        // bayrak=0 sa hata vadir. kucuk harf yoktur

        }

        // bayrak==0 ise kucuk harf yoktur, yani bir hata var var bunu yazdiracagiz
        if (bayrak==0){                                                                               // bayrak=0'sa hata vadir. kucuk harf yoktur
            System.out.println("Sifre buyuk harf icermelidir");
            return 0;
        }else return 1;


    }

    public static int kucukHarfKontroluYap(String sifre) {                                            // eger kucuk harf varsa bana 0 dondursun, yoksa 1 dondursun
        int bayrak=0;
        // Sifre kucuk harf icermelidir
        // bunun icin tum harfleri kontrol edecek bir for loop olusturmaliyim
        // 1 tane kucuk harf bulmam yeterli olacak. (yeterli olacagi icin degil kullanmayacagiz)

        for (int i = 0; i < sifre.length(); i++) {

            if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                bayrak++;
                break;
            }

        }

        // bayrak==0 ise kucuk harf yoktur, yani bir hata var var bunu yazdiracagiz
        if (bayrak==0){
            System.out.println("Sifre kucuk harf icermelidir");
            return 0;
        }else return 1;
    }
}

/*  soruyu su mantikla cozduk. temel mantik:
4 tane sartimiz vardi.
-kucuk harf
-buyuk harf
-ozel karakter
-uzunluk lenght

butun kodumuzu suna gore planladik. sarti sagliyorsa bayragi 1 arttirdik. basta bayrak sifirdi. en sona geldigimizde herbiri sarti sagliyorsa bayragi 1 - 1 artti
biz soyle yaptik
do kontrolleri yap. nereye kadar?    while (bayrak !=4) olana kadar devam et.
kontrolleri yap. bayrak 4 degilse, yeniden bir daha kontrol yap. taki bayrak 4 olana kadar. temel kurgumuz bu.
bunun icerisinde kontrolleri saartlara gore yaptik
sart saglandikca bayrak 1 artti. 4 sart saglaninca while dongusunden cikti. sifre kaydedildi yazdi

tek tek metodlar yaptik ve bu metodlarin sartlari saglayayip saglamadigini kontrol ettik.
metodlar eger sartlari sagiliyorsa bayragi 1 yaptik. saglamiyorsa 0 yaptik.
ayrica iflerin altinada sartlara bakan bayraklar koyduk.

 */
