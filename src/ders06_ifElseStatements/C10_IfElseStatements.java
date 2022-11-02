package ders06_ifElseStatements;

public class C10_IfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
        //“Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        char cinsiyet='M';
        int yas= 52;

        if (cinsiyet=='E' && yas>=65){
            System.out.println("Emekli Olabilirsin");

        } else if (cinsiyet=='E' && yas<65) {
            System.out.println("Erkeklerin emeklilik yasi 65 dir");
            System.out.println("Emekli omak icin " + (65-yas) + " sene daha calismalisin");
            
        } else if (cinsiyet=='K' && yas>=60) {
            System.out.println("Emekli olabilirsin");
            
        } else if (cinsiyet=='K' && yas<60) {
            System.out.println("Kadinlarin Emeklilik yasi 60 dir");
            System.out.println("Emekli omak icin " + (60-yas) + " sene daha calismalisin");
            
        }

    }
}
