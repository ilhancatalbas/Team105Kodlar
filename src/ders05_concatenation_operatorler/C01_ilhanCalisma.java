package ders05_concatenation_operatorler;

public class C01_ilhanCalisma {

    public static void main(String[] args) {

        String aj= "Hello";
        String bj= "World";

        System.out.println(aj+bj);
        System.out.println(aj+" "+bj);

        String a= "Hello";
        int b = 2;
        int c = 3;

        System.out.println(a+b+c);    //  Hello23

        System.out.println(c+b+a);    // 5Hello

        System.out.println(a+(b+c));  //Hello5

        System.out.println(a+b*c);    //Hello6


        String s1= "java";
        String s2= " ";                    // hiclik    hiclik bir stringtir. kendinden sonrakinide stringe cevirir
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
