package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C13_Sorular04 {

    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayi alin
        // sayilarin toplami 500'e esit olur veya gecerse
        // girilen sayi adedi,
        // girilen sayilarin toplami ve "Bu kadar yeter" yazdirin

        Scanner scan = new Scanner(System.in);




        int toplam =0;
        int sayiAdedi = 0;

        while (toplam<=500){

            System.out.println("Lutfen bir sayi giriniz");
            int sayi = scan.nextInt();
            toplam+=sayi;
            sayiAdedi++;

        }

        System.out.print("Girilen sayi adeti : " + sayiAdedi + " girilen sayi toplami " + toplam + "\nBukadar yeter");






    }
}
