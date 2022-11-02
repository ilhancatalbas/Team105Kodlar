package ders10_stringManipulations;

public class C09_Soru {

    public static void main(String[] args) {

        /* kullanicidan bir cumle ve bir metin alin
        cumlede metnin durumuna gore
        1- cumle metni iceriyor
        2- cumle metni sadece 1 kere iceriyor
        3- cumle metni birden fazla iceriyor   yazdirin

         */

        String cumle = "Java cok guzeldir cok.";
        String metin = "cok";

        int ilkIndex = cumle.indexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);
                                                    // buna gore ilk indexle son index birbirine esitse bir kere kullanilmistir
                                                    // esit degilse birden cok kullanilmistir

        if (ilkIndex==(-1)){
            // ilk index -1 ise hic bulunamadi demektir
            System.out.println("cumle metni icermiyor");

        } else if (ilkIndex==sonIndex) {
            System.out.println("cumle metni 1 kere iceriyor");

        }else {
            System.out.println("cumle metni 1 den fazla iceriyor");


            // aciklama video 10 time 2saat 40 inci dakikada var

        }


    }
}
