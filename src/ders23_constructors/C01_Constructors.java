package ders23_constructors;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class C01_Constructors {

    public static void main(String[] args) {

        // Scanner class'indaki method ve variable'lari (ozellikleri) kullanmak icin scan objesi olustururuz
        // bu aslinda scanner class'indan bir obje olusturmak demektir
        // biz bir class'in ozellikleri dedigimizde ordaki method ve variable'lar olacaktir.
        // biz class'lari icine objeler olusturup kullanmak icin yapariz.


            Scanner           scan      =              new                      Scanner(System.in);
        // class adi        obje ismi        obje olusturmak icin keyword       Scanner constructor'i


        scan.nextInt();

        String str = new String("Java candir");
        String str2 = "Java ne guzel";

        str.toLowerCase();


    }

    public static void C01_constructor(){

        // method isimleri kucuk harfle baslar
        // class ismi ile ayni isimde olmamasi tercih edilir
        // return type varsa bu method'dur, constructor olamaz   ( return type = void )
        // cons return type i yoktur


    }
}
