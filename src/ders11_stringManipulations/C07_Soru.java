package ders11_stringManipulations;

import java.util.Locale;

public class C07_Soru {

    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini ayri ayri alin.
        // - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        // - esit veya soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        /*

        String isim = "mehmet";
        String soyIsim = "istanbullu";

                 BENIM COZDUGUM YONTEM   BIRAZ UZUN OLDU :)

        if (isim.length()>soyIsim.length()){
            System.out.println(isim.substring(0,1).toUpperCase(Locale.ROOT) + isim.substring(1).toLowerCase()
                    + " " + soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1).toLowerCase());
        }else{
            System.out.println(isim.substring(0,1).toUpperCase()+ isim.substring(1).toLowerCase()
                    + " " + soyIsim.toUpperCase());
        }

         */

        // HOCANIN COZDUGU

        String isim = "mehmet";
        String soyIsim = "harunlular";

        String yeniIsimSoyisim;

        if (isim.length()>soyIsim.length()){                 // isim ve soyisim ilk harfler buyuk

              yeniIsimSoyisim = isim.substring(0,1).toUpperCase()+
                                    isim.substring(1).toLowerCase()+
                                    " "+
                                    soyIsim.substring(0,1).toUpperCase()+
                                    soyIsim.substring(1).toLowerCase();




        }else{                    // isim ilk harf buyuk digerlri kucuk. soyisim buyuk

            yeniIsimSoyisim = isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase()+
                    " " +
                    soyIsim.toUpperCase();

        }

        System.out.println(yeniIsimSoyisim);


    }
}
