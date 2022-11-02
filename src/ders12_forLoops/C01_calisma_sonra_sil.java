package ders12_forLoops;

public class C01_calisma_sonra_sil {

    public static void main(String[] args) {


        //1453 rakamlar toplamini

        int sayi = 1453;

        int birlerBasamagi = sayi%=0;
        int onlarBasamagi = (sayi/10)%0;
        int yuzlerBasamagi = (sayi/100)%0;
        int binlerBasamagi = (sayi/1000)%0;

        System.out.println(binlerBasamagi+onlarBasamagi+yuzlerBasamagi+binlerBasamagi);










    }
}
