package calismaGrubu_day01;

public class C10_kakHasan {

    public static void main(String[] args) {

        // kullaninin verdigi sayinin asal sayimi degilmi
        // asalsa kac tane boleni var

        int sayi = 10;
        int bayrak=0;

        for (int i = 2; i <sayi-1 ; i++) {

            if (sayi%i==0){
                System.out.print("asal sayi degil");
                bayrak++;

            }else {
                System.out.print("asal");

            }

            System.out.println("tane bolen var: " + bayrak);

        }





    }
}
