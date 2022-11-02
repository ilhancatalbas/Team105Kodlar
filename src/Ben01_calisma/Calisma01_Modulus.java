package Ben01_calisma;

import java.util.Scanner;

public class Calisma01_Modulus {

    public static void main(String[] args) {



        int sayi= 82;
        System.out.println(sayi%8);


       /*
        Scanner scan = new Scanner(System.in);
        int sayi2=scan.nextInt();
        System.out.println(sayi2%=7);
        */

        int sayi3= 18;
        System.out.println(sayi3%=5);

        int sayi4 = 15795;
        System.out.println(sayi4%=2);

        int sayi5 = 1453;
        System.out.println(sayi5%=6);

        int sayi6 = 1982;
        System.out.println(sayi%=7);

        double sayi7 = 2022;
        System.out.println(sayi7%=8);

        double sayi8= 1923;
        System.out.println(sayi8%=9);

        double sayi9 = 125.28;
        System.out.println(sayi9%=5);



        // 1543 sayisi cift bir sayimidir
       int sayi10 = 1544;

       if (sayi10%2==0){
           System.out.println("cift sayidir");
       }else {
           System.out.println("cift sayi degildir");
       }


       // 2022 sayisi cift sayi ise rakamlar toplamini bulunuz

        int input = 9998;

       if (!(input%2==0)){
           System.out.println("sayi cift degil");
       }else{
           int birler = input%10;
           int onlar = (input/10)%10;
           int yuzler = (input/100)%10;
           int binler = (input/1000)%10;

           System.out.println(input + " cift sayidir, " + "rakamlar toplami : " + (birler + onlar + yuzler+ binler));


       }






    }
}
