package ders15_overloading_whileLoop;

public class C02_Overloading {

    public static void main(String[] args) {

        carpim(3,5);                       //   method call sirasinda method parantezine  yazilanlara argument diyoruz

        carpim(3.4,2);

    }

    //   Argument: methol call sirasinda method parantezine yazilanlara argument denir

    //   Bir class da ayni isim ve ayni signature'a sahip iki metod olmaz

    //   Method overloading olan class'larda java hangi method'un calisacagina su sekilde bakar
    //   1- once method ismine bakar
    //   2- argument sayisi ile parametre sayisina bakar
    //   3- argument ve parametre uyumuna bakar
    //   4- minimum data casting                                               java en az casting yapacagi methodu secer
    //                                                                         mesela; int'in double'a cevrilmesine casting diyoruz


    public static void carpim(int sayi1, int sayi2){

        System.out.println("iki integer sayinin carpimi: "+sayi1*sayi2);         // carpim int int                       // bunu copy past yapsan java izin vermez.
    }                                                                                                                    // carpim metodu kismen sorun degil ama signature larida ayni


    public static void carpim(int sayi3, int sayi4, int sayi5){

        System.out.println("uc integer sayinin carpimi: "+sayi3*sayi4*sayi5);    // carpim int int int                   // buna itiraz etmez cunku signaturlari farkli oldu
    }

    public static void carpim(double sayi1, int sayi2){                          // carpim double int

        System.out.println("double integer sayinin carpimi: "+sayi1*sayi2);
    }

    public static void carpim(int sayi1, double sayi2){                          // carpim int double

        System.out.println("integer double iki sayinin carpimi: "+sayi1*sayi2);
    }

    public static void carpim(double sayi1, double sayi2){                       // carpim double double

        System.out.println("double double iki sayinin carpimi: "+sayi1*sayi2);
    }




}
