package day06;

import java.util.Random;
import java.util.Scanner;

public class B01_BenTekarCozum {

    public static void main(String[] args) {

        // tas akgit makasi bilgisayarla oyna. 5 olan kazansin

        System.out.println();

        System.out.println("\t\tTas - Kagit - Makasa Hos Geldin. Oyuna hazirsan bir sayi sec");

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userScr = 0;
        int compScr = 0;

        int userSecim = 0;
        int compSecim = 0;


        do {
            userSecim = scan.nextInt();
            compSecim = random.nextInt(3)+1;

            if (userSecim==1 && compSecim==2){
                compScr++;
                System.out.println("KAGIT TASI SARAR " + "\nSenin Secimin : " + userSecim + " | Computer Secimi : " + compSecim +  "\nSenin Durumun: " + userScr + " -- computer Durumu : " + compScr);


            } else if (userSecim==1 && compSecim==3){
                userScr++;
                System.out.println("TAS MAKASI KIRAR " + "\nSenin Secimin : " + userSecim + " | Computer Secimi : " + compSecim +  "\nSenin Durumun: " + userScr + " -- computer Durumu : " + compScr);


            } else if (userSecim==2 && compSecim==1){
                userScr++;
                System.out.println("KAGIT TASI SARAR " + "\nSenin Secimin : " + userSecim + " | Computer Secimi : " + compSecim +  "\nSenin Durumun: " + userScr + " -- computer Durumu : " + compScr);


            } else if (userSecim==2 && compSecim==3){
                compScr++;
                System.out.println("MAKAS KAGIDI KESER " + "\nSenin Secimin : " + userSecim + " | Computer Secimi : " + compSecim +  "\nSenin Durumun: " + userScr + " -- computer Durumu : " + compScr);


            } else if (userSecim==3 && compSecim==1){
                compScr++;
                System.out.println("TAS MAKASI KIRAR " + "\nSenin Secimin : " + userSecim + " | Computer Secimi : " + compSecim +  "\nSenin Durumun: " + userScr + " -- computer Durumu : " + compScr);


            } else if (userSecim==3 && compSecim==2){
                userScr++;
                System.out.println("MAKAS KAGIDI KESER " + "\nSenin Secimin : " + userSecim + "Computer Secimi : " + compSecim +  "\nSenin Durumun: " + userScr + " -- computer Durumu : " + compScr);


            } else {
                System.out.println("BeRaBeRe");


            }

        }while (userScr !=5 && compScr !=5);{
            if (userScr>compScr){
                System.out.println("You Win");
            }else {
                System.out.println("You Lost");
            }
        }

    }
}
