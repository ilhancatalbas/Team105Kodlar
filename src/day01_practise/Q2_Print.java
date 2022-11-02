package day01_practise;

public class Q2_Print {

    public static void main(String[] args) {

        int sayiA = 78905;

        int birler = (sayiA/1)%10;
        int onlar  = (sayiA/10)%10;
        int yuzler = (sayiA/100)%10;
        int binler = (sayiA/1000)%10;
        int onbinler = (sayiA/10000)%10;

        System.out.println(onbinler + "\n" + binler + "\n" + yuzler + "\n" + onlar + "\n" + birler);



        int sayi =1453;

        int birlerBas = sayi%10;
        int onlarBas = (sayi/10)%10;
        int yuzlerBas = (sayi/100)%10;
        int binlerBas = (sayi/1000)%10;

        System.out.println(binlerBas + " - " + yuzlerBas + " - " + onlarBas + " - " + birlerBas);


    }
}
