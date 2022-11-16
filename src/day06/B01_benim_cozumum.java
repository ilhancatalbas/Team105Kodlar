package day06;

import java.util.Random;
import java.util.Scanner;

public class B01_benim_cozumum {

    public static void main(String[] args) {

        // tas kagit makasi bilgisayarla oyna. 5 olan kazansin

        // NOT: Java util'de Random diye bir class var. Bu bilgisayarin rastgele secimler yapabilmesi icindir

        Scanner scan = new Scanner(System.in);
        Random random =new Random();

        int user =0;
        int comp = 0;

        int userCh = 0;
        int compCh = 0;


        do {
            System.out.println("Bir rakam giriniz");
            userCh = scan.nextInt();
            compCh = random.nextInt(3)+1;

            if (userCh==1 && compCh==2){
                comp++;
                System.out.println("Tas kagidi sarar" + "\nSenin secimin : "+ userCh + " *** Computer secimi : " + compCh + "\nYou Score : " + user + " | Computer Score : " +comp);

            } else if (userCh==1 && compCh==3){
                user++;
                System.out.println("Tas makasi kirar" + "\nSenin secimin : "+ userCh + " *** Computer secimi : " + compCh + "\nYou Score : " + user + " | Computer Score : " +comp);

            } else if (userCh==2 && compCh==1){
                user++;
                System.out.println("Tas kagidi sarar" + "\nSenin secimin : "+ userCh + " *** Computer secimi : " + compCh + "\nYou Score : " + user + " | Computer Score : " +comp);

            } else if (userCh==2 && compCh==3){
                comp++;
                System.out.println("makas kagidi keser" + "\nSenin secimin : "+ userCh + " *** Computer secimi : " + compCh + "\nYou Score : " + user + " | Computer Score : " +comp);

            } else if (userCh==3 && compCh==1){
                comp++;
                System.out.println("Tas makasi kirar" + "\nSenin secimin : "+ userCh + " *** Computer secimi : " + compCh + "\nYou Score : " + user + " | Computer Score : " +comp);

            } else if (userCh==3 && compCh==2){
                user++;
                System.out.println("makas kagidi keser" + "\nSenin secimin : "+ userCh + " *** Computer secimi : " + compCh + "\nYou Score : " + user + " | Computer Score : " +comp);

            } else {
                System.out.println("Berabere");

            }


        }while (user !=5 && comp !=5);{

            if (user>comp){
                System.out.println("YOU WIN");
            }else {
                System.out.println("YOU LOST");
            }
        }



    }
}
