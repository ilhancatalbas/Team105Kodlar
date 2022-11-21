package ders35_expection;

public class C02_ArithmeticException {

    public static void main(String[] args) {

        // verilen 2 tam sayiyi birbirine bolup
        // sonucun tam sayi kismini yazdirin

        int sayi1= 20;
        int sayi2= 0;

        try {

            // riskli oldugunu ongordugumuz kodlar
            System.out.println(sayi1/sayi2);
            System.out.println("Bakalim bu satir calisca mi?");

        } catch (ArithmeticException e) {        // bir problemle karsilasirsan
            // catch (Exception e) ongordugumuz risk

            System.out.println("sayi sifira bolunemez");
            // catch (o'dan sonraki {} catch blogu denir
            // beklenen risk gerceklesirse calisacak kodlar
        }

        /*
           bazi exception'lar if else ile handle edilebilir ancak
           tum exception'lar icin if else yeterli olmaz


         */



    }
}
