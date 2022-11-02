package ders05_concatenation_operatorler;

public class C01_concatenation {

    public static void main(String[] args) {

        // sadece asagida verilen variable lari kullanarak istenen degerleri yazdiralim

        String s1= "java";
        String s2= " ";
        String s3= "kolay";
        String s4= "";

        int y= 3;
        int z= 4;

        System.out.println((y*z)+s2+s1+s2+s3);                //  12 JAva Kolay
        System.out.println((y+z)+s2+s1+s2+s3);                //  7 Java Kolay
        System.out.println(s4+y+z+s1+s2+s3);                  //  34Java Kolay
        System.out.println(s1+(y*z)+s3);                      //  Java12Kolay
        System.out.println(s1+y+z+s3);                        //  Java34Kolay
        System.out.println(s1+(y+z)+s3);                      //  Java7Kolay


    }
}
