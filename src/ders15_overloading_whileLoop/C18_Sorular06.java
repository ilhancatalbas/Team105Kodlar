package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C18_Sorular06 {

    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayi alin
        // sayilarin toplami 500'e esit olur veya gecerse
        // girilen sayi adedi,
        // girilen sayilarin toplami ve "Bu kadar yeter" yazdirin


        Scanner scan = new Scanner(System.in);




        int sum = 0;
        int count =0;

        while (sum<=500){

            System.out.println("Lutfen bir sayi giriniz");

            int sayi = scan.nextInt();
            sum+=sayi;
            count++;
        }

        System.out.println("Girilen sayi adeti : " + count + " toplami : " + sum + "\nBukadar yeterli tesekkur ederiz");




    }
}
