package ders13_nestedForLoop_methodOlusturma;

public class C04_NestedForLoop {

    public static void main(String[] args) {

        /* asagidaki sekli yazdiran bir kod hazirlayin

        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *

         */


        for (int i = 1; i <=4 ; i++) {                   // yukaridan asagiya    outer loop  denir

            for (int j = 1; j <=6; j++) {                // soldan saga          inner loop  denir

                System.out.print("* ");                  // bisey atamaya gerek yok. sout'a ("* ") yazdir bosluk koy yeter

            }

            System.out.println(" ");

        }


    }
}
