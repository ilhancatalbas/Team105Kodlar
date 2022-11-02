package ders13_nestedForLoop_methodOlusturma;

public class C06_NestedForLoopUcgen {

    public static void main(String[] args) {

        /*
        1
        2 4
        3 6 9
        4 8 12 16
        5 10 15 20 25                                 // bu soruyu yaptim ama nasil yaptigimi bilmiyorum !!!
                                                      // j ile i yi niye carptik
         */

        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(j*i + " ");

            }

            System.out.println("");
            
        }


        //             ASAGIDAKI SORUYU COZ

        /*      1
               1 2
              1 2 3
             1 2 3 4
         */





    }
}
