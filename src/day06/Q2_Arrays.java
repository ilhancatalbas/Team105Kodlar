package day06;

import java.util.Arrays;

public class Q2_Arrays {

    public static void main(String[] args) {


            int[] integers;                                  //kullanmadan once uzunlugunu belirtmek zorundayiz
            integers = new int[5];

            System.out.println(Arrays.toString(integers));         // arrays classindan yardimm allarak Array.toString  yazddiriyoruz

            integers[0]=1;
            integers[1]=2;
            integers[2]=3;
            integers[3]=4;
            integers[4]=5;

            System.out.println(Arrays.toString(integers));           // Array'in son hali

            char [] charlar = new char[3];
            charlar[0]= 'A';
            charlar[1]= 'B';
            charlar[2]= 'C';

            String charlarString = Arrays.toString(charlar);          // bu kisa yol. Herseferinde Arrays.toString yapmamak icin. artik charlar dedigimiz direk yazdiracak

            System.out.println(charlar);

            String [] isimler = new String[3];                        // new String[3] oldugu yere sadece uzunluk yazilir



            isimler [0] ="Ayse";
            isimler [1] ="Fatma";
            isimler [2] ="Hayriye";

            System.out.println(Arrays.toString(isimler));

            // Soru: Ayse ile Fatma'nin yerini degistirelim

            String bosKova = isimler[0];

            isimler [0] = isimler[1];
            isimler [1] = bosKova;

            System.out.println("yeni hali : " + Arrays.toString(isimler));







    }
}
