package ders17_scope;

import java.util.Scanner;

public class C05_ObjectVariables {

    public static void main(String[] args) {

        // C03 class'indaki instance variable'lari nasil ulasabiliriz
        // instance variable'larin diger adi obje variable'laridir
        // instance variable'lara obje uzerinden ulasabiliriz



        C03_ObjectVariables pers1= new C03_ObjectVariables();

        System.out.println(pers1.perIsmi);   // isim girilmedi
        System.out.println(pers1.perYasi);   // 0

        pers1.perIsmi="suleyman";
        pers1.perYasi=35;
        pers1.perTelefonu="555 222 222";

        System.out.println(pers1.perIsmi);    // suleyman
        System.out.println(pers1.perYasi);    // 35


        C03_ObjectVariables pers2= new C03_ObjectVariables();

        pers2.perIsmi="Latife";
        pers2.perYasi=32;
        pers2.perTelefonu="5551111111";

        System.out.println(pers1.perIsmi);    // suleyman
        System.out.println(pers2.perIsmi);    // latife


        C03_ObjectVariables pers3 = new C03_ObjectVariables();

        pers3.perIsmi="Heysen";
        pers3.perYasi=30;
        pers3.perTelefonu="55533333333";

        System.out.println(pers1.perYasi);          //suleyman
        System.out.println(pers2.perYasi);          // latife
        System.out.println(pers3.perTelefonu);      // 30



    }
}
