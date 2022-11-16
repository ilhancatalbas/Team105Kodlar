package day06;

import java.util.Scanner;

public class B02_SoruKurtKuzu {

    public static void main(String[] args) {

        System.out.println("\tBir varmis bir yokmus. Bir kayikci nehirden karsiya kurt, kuzu ve lahanayi gecirmek istiyormus" +
                "\n\tFakat kayiginda yer olmadigi icin bunlari teker teker gecirmek zorundaymis." +
                "\n\tKayikci bunlari nasil karsiya gecirir");
        System.out.println();

        System.out.println("Karsiya gecmesini isteginiz objeyi seciniz. Kurt:1, Kuzu:2, Lahana:3" +
                           "\nKarsiya geceni geri almak icin: Kurt:4, Kuzu:5, Lahana");

        Scanner scan = new Scanner(System.in);

        int choise =1;        // Kurt
        int choise2 =2;        // Kuzu
        int choise3 =3;        // Lahana

        do {

            choise = scan.nextInt();

            if(choise==1){
                System.out.println("Eyvah! Kuzu lahanayi yiyecek");

            } else if (choise==2) {
                System.out.println("hersey Normal");

            }else if (choise==3){
                System.out.println("Kurt kuzuyu yuttu");

            }


        }while (choise==4);{

        }



    }
}
