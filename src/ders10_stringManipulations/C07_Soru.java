package ders10_stringManipulations;

public class C07_Soru {
    public static void main(String[] args) {

        // kullanicidan bir cumle ve bir metin alin
        // cumlede metnin durumuna gore
        // 1- cumle metni icermiyor
        // 2- cumle metni sadece 1 kere iceriyor
        // 3- cumle metni birden fazla iceriyor
        // seceneklerinden uygun olani yazdirin

        String cumle = "Java cok guzeldir cok.";
        String metin = "Java";

        if (!cumle.contains(metin)){

            System.out.println("cumle metni icermiyor");       // BURADA SU DIYOR     cumle metni icermiyor mu

        }else {
            int ilkIndex = cumle.indexOf(metin);   // 5

            int ikinciIndex = cumle.indexOf(metin,ilkIndex+1);    // ya -1 olacak yada bir index icerecek

            if (ikinciIndex==(-1)){
                System.out.println("cumle metni sadece 1 kere iceriyor");
            }else {
                System.out.println("cumle metni birden fazla iceriyor");
            }

            // bu sorunun aciklamasi: diyorki ilk if'te cumle metni    cumle metni icermiyormu   diye soruyor.
            // olumsuz soruyor (enbasta unlem isareti var). niye olumsuz sordu, cunku icermiyorsa if devreye girer else devreye girmez
            // yani olmayan bir kelime dersen if bunu yakalar. eger yakalayamazsa iceriyor anlami cikacak
            // eger iceriyorsa else devreye girecek ve alternatifleri yakalamaya calisacak
            // kisaca if icermiyorsayi gecmis else gelmis. yani 1 kere iceriyor anlami cikmis. sonrasinda daha kac tane var diye else bakacak
            // ilkindex buldugunu +1 yapmis. buda bundun 1 tane harf atla baska varmi demek. 1 tane atlarsa o buldugunu sayamaz birdaha
            // bunun sonucuda -1 cikarsa bu su demek. baska bulamadim. buda birkez sadece bir kez iceriyor anlami cikar mantiksal olarak

            // anlasilmadiysa hala videoyu tekrar izle 10 ders



        }





    }
}
