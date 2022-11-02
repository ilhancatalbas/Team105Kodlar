package ders06_ifElseStatements;

public class C10_ilhanCalisma {

    public static void main(String[] args) {

        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        char cinsiyet='t';
        int yas= -5;

        System.out.println("Cinsiyet ve Yas giriniz" );

        if (cinsiyet=='K' && yas>=60){
            System.out.println("((kadin) Emekli olabilirsin");

        } else if (cinsiyet=='K' && yas<60) {
            System.out.println("(Kadin) Emekli olamk icin " + (60 - yas) + " sene calismalisin");

        } else if (cinsiyet=='E' && yas>=65) {
            System.out.println("(Erkek) Emekli olabilirsin");

        } else if (cinsiyet=='E' && yas<65) {
            System.out.println("(Erkek) emekli olmak icin " + (65-yas) + " sene calis");

        }else{
            System.out.println("baska bi is bak");


        }


    }}
