package calismaGrubu_day01;

public class C09_kakHasan {

    public static void main(String[] args) {

        //kullanicinin verdigi sayinin faktoryelini bulunuz. kullanici 10 versin

        int sayi=10;

        int faktoryel = 1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel=faktoryel*i;

        }
        System.out.println(faktoryel);
    }
}
