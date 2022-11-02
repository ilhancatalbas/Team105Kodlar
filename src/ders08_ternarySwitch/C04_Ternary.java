package ders08_ternarySwitch;

public class C04_Ternary {

    public static void main(String[] args) {

        // soru2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        int kenar1= 10;
        int kenar2= 12;
        int kenar3= 13;

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "Eskenar ucgen" : "Eskenar degil");


        // kenarlar sifir ve eksi olamayacagindan dolayi bunuda eklersek kod karisacaktir asagidaki gibi
        // ternary'i basit yapida kurmak lazim

        System.out.println(kenar1>0 && kenar2>0 && kenar3>0 && kenar1==kenar2 && kenar2==kenar3 ? "Eskenar ucgen" : "Eskenar degil");



        // soru5- Kullanicidan iki sayi alin ve
        // buyuk olmayan sayiyi yazdirin

        int sayi1= 11;
        int sayi2= 11;

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);







    }
}
