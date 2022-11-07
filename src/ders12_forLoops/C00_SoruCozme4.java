package ders12_forLoops;

import java.util.Scanner;

public class C00_SoruCozme4 {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir sayi alin,
        // 1’den baslayarak tum tamsayilari yazdirin, sira
        // 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        // 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        // hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz  yazdirin

        int sayi;
        sayi=50;

        for (int i = 1; i <=sayi ; i++) {

            if (i%5==0 && i%3==0){
                System.out.print("fizzbuzz ");
            } else if (i%3==0) {
                System.out.print("fizz ");
            } else if (i%5==0) {
                System.out.print("buzz ");
            }else {
                System.out.print(i + " ");
            }

        }





    }



}

