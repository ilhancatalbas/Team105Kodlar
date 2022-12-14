package ders23_constructors;

public class DAraba {

    // bir proje olusturulurken tum classlarda main method olmasina gerek yoktur
    // cogu class obje olusturularak kullanilmak uzere hazirlanmis depolardir
    // bizde bu class'i araba obleri icin bir depo olarak dizayn edelim.

    // her class olusturuldugunda java o class'dan obje olusturulabilmesi icin
    // default bir constructor olusturur
    // bu default constructor gorunmez
    // default constructor parametresizdir ve bize standart bir obje olusturur

    // bu class da nasil calistigini anlamamiz icin arbalarla ilgili bir kac ozellik verecegiz

    String marka= "Marka belirtilmedi";
    String model= "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    @Override
    public String toString() {
        return "Araba Ozellikleri " +                                           // burda begenmedigim ozelliklerini degistirebilirim. DAraba yerine "Araba Ozellileri" yazdim. turnaklari kaldirdim
                "\nmarka : " + marka +                                      // parantezi kaldirdim
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil   : " + yil +
                "\nfiyat : " + fiyat ;
    }



    public int maxHiz (String yakit){
        int maxHiz=120;

        if (yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        }
        return maxHiz;


    }

}
