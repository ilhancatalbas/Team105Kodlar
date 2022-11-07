package ders04_matematikselIslemlerIncrementDecrment;

public class C06_Pre_Post_Increment {

    public static void main(String[] args) {

        int a= 10;

        // a variable'nin degerini yazdirip, sonra a'nin degerini bir artirin

        System.out.println("a : " + a);
        a++;                                           // a'nin degeri artik 11 ama kullanici konsolda gormez. 10 olarak gorur.



        int b=10;

        // b variable'nin degerini bir artirip, sonra yazdirin

        b++;
        System.out.println("b : " + b);                // b'nin degeri artik 11 ve kullanici konsolda gorur. 11 olarak gorur



        int c = 10;

        // c variable'nin degerini yazdirip, sonra c'nin degerini bir artirin

        System.out.println("c : " + c++);              // 10          // tek satir kodla hallettik.  BURADA C 11 YAZMAYACAK. YAZDIKDAN SONRA C'NIN DEGERI BIR ARTACAK



        int d=10;

        // d variable'nin degerini bir artirip, sonra yazdirin

        System.out.println("d : " + ++d);              // 11          // tek satir kodla hallettik.  BURADA C'NIN DEGERI ONCE 1 ARTIP SONRA YAZACAK


        /*
           c++ veya ++d yi yazdirma ve atama isleminde kullanirsaniz
           c++ e' post increment denir. O satir icin once islemi yapar sonra artirmayi yapar
           ++d 'ye ise pre increment denir, once artirma yapip sonra islemi yapar

           islemin oldugu satirin bir alt satirina gecildiginda
           c'de  d'de bir artmistir

         */









    }
}
