package ZArrays_Ders_Anlatimi;

import java.util.Arrays;

public class C16_AyseHocaPractise_02 {

    public static void main(String[] args) {

        // create an array of 5 floats and calculate their sum


        float [] sayilar = {1.2f, 2.3f, 3.7f, 4.1f, 5.5f};

        float sum = 0;

        for (int i = 0; i < sayilar.length; i++) {

            sum+=sayilar[i];
        }

        System.out.println(("Toplam : " + sum));



        System.out.println("****************WHILE COZUMU**************");

       sum=0;                                            // toplami burda sifirladik. yoksa yukaridan devam ederdi
       int index = sayilar.length-1;

       while (index>=0){
           sum += sayilar[index];
           index--;
       }
        System.out.println(("Toplam (while): " + sum));



       System.out.println("****************DO WHILE COZUMU**************");

        sum=0;
        index =0;

        do {
            sum += sayilar[index];
            index++;

        }while (index<sayilar.length);

        System.out.println(("Toplam (dowhile): " + sum));





    }
}
