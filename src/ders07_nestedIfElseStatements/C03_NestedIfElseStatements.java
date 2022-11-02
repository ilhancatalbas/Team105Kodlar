package ders07_nestedIfElseStatements;

public class C03_NestedIfElseStatements {

    public static void main(String[] args) {
        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


        // degisken sayisi:  kadin, erkek ve cinsiyet

        System.out.println("EMEKLI OLMAK ICIN KRITERLERINIZ");

        char cinsiyet= 'k';
        int yas= 65;

        // nested if-else seklinde kullanim icin once ana degiskeni secip
        // ona gore ana yapiyi olusturalim

        //cinsiyet ana degisken olsun !!!!!!

        if (cinsiyet=='k' || cinsiyet=='K'){
            // Giris yapilan deger bir kadina ait demektir
            if (yas<15){
                System.out.println("Hatali yas girisi");
            } else if (yas<60) {
                System.out.println("Emekli olamazsin " + (60-yas) + " yil daha calismalisin (Kadin)");
            }else {
                System.out.println("Emekli olabilirsin (Kadin)");
            }

        } else if (cinsiyet=='e' || cinsiyet=='E') {
            // Giris yapilan deger bir erkege aittir
            if (yas<15){
                System.out.println("Hatali yas girisi (erkek)");
            } else if (yas<65) {
                System.out.println("Emekli olmak icin " + (65-yas) + " sene daha calismalisin (erkek)");

            }else{
                System.out.println("emekli olabilirsin (erkek)");
            }

        }else{
            System.out.println("Yanlis cinsiyet girisi");
        }


    }

}
