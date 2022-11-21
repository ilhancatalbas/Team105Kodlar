package ders21_ArrayList_EKSIKK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_Sorular_BenimCozumum01 {

    public static void main(String[] args) {

        // kullanicidan istedigi kadar isim alip
        // Q'ya bastiginda girdigi isimleri bize liste olarak dondurecek
        // bir method olusturun

        //listeOlustur();

        System.out.println(listeOlustur());


    }

    public static List<String> listeOlustur(){

        List<String > isimler = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        String girilenIsim="";

        while (!girilenIsim.equalsIgnoreCase("q")){

            System.out.println("Liste icin isim giriniz \nbitirmek icin q'ya basin");
            girilenIsim= scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){
                isimler.add(girilenIsim);
            }
        }

        return isimler;

    }
}
