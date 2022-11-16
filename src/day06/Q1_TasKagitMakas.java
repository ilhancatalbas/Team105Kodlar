package day06;

import java.util.Random;
import java.util.Scanner;

public class Q1_TasKagitMakas {

    public static void main(String[] args) {

        // tas akgit makasi bilgisayarla oyna. 5 olan kazansin

        // NOT: Java util'de Random diye bir class var. Bu bilgisayarin rastgele secimler yapabilmesi icindir



        Scanner scan = new Scanner(System.in);
        Random random = new Random();                                   // random olusturduk. Java util'de random diye bir class var. Rastgele atama yapmasi icin.


        int userChoise = 0;                                            // kullanicinin secimi
        int compChoise = 0;                                            // bilgisayarin secimi
        int user = 0;                                                  // kimin kazandigi noktasinda, user in puani
        int comp = 0;                                                  // kimin kazandigi noktasinda, comp in puani

        // en uygun olani do while, cunku hicbir sarta bakmaksizin oyunu baslatmasi. dongumuzun devam etme sarti, user'inda computer'inda 5'ten farkli olma sarti olmasi lazim

        do {

            System.out.println("seciminizi yapin : \n\t 1 for Rock\n\t 2 for Paper\n\t 3for Scissor");
            userChoise = scan.nextInt();
            compChoise =random.nextInt(3)+1;

            if (userChoise==1 && compChoise==2){
                System.out.println("Your choise = "+ userChoise + " | Computre choise = : " +compChoise +
                        "\npaper wraps Rock ==> computer +1");
                comp++;
                System.out.println("User = " + user + " | Computer = " + comp);
            }else if (userChoise==1 && compChoise==3){
                System.out.println("Your choise = "+ userChoise + " | Computre choise = : " +compChoise +
                        "\nRock smash Scisors ==> User +1");
                user++;
                System.out.println("User = " + user + " | Computer = " + comp);
            }else if (userChoise==2 && compChoise==1){
                System.out.println("Your choise = "+ userChoise + " | Computre choise = : " +compChoise +
                        "\npaper wraps Rock ==> user +1");
                user++;
                System.out.println("User = " + user + " | Computer = " + comp);
            }else if (userChoise==2 && compChoise==3){
                System.out.println("Your choise = "+ userChoise + " | Computre choise = : " +compChoise +
                        "\nScisors cut Paper  ==> computer +1");
                comp++;
                System.out.println("User = " + user + " | Computer = " + comp);
            }else if (userChoise==3 && compChoise==2){
                System.out.println("Your choise = "+ userChoise + " | Computre choise = : " +compChoise +
                        "\nScisors cut Paper ==>  User +1");
                user++;
                System.out.println("User = " + user + " | Computer = " + comp);
            }else if (userChoise==3 && compChoise==1){
                System.out.println("Your choise = "+ userChoise + " | Computre choise = : " +compChoise +
                        "\nRock smash Scisors ==> computer +1");
                comp++;
                System.out.println("User = " + user + " | Computer = " + comp);
            }else {
                System.out.println("It's a tie");
                System.out.println("User = " + user + " | Computer = " + comp);

            }



        }while (user !=5 && comp !=5);{
            if (user>comp) System.out.println("You are the winner !!!");
            else System.out.println("Sorry you are loser :( ");



        }








    }
}
