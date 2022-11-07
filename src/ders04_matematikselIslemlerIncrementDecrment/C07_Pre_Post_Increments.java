package ders04_matematikselIslemlerIncrementDecrment;

public class C07_Pre_Post_Increments {

    public static void main(String[] args) {

        int a = 10;                //                                              a=10 olarak baslayacak

        int b = a++;               // once islem, sonra artirma.                   b=a yani b=10 olacak. cunku buraya kadar a=10 idi. Sonra a'nin degerini bir articagiz. artik a=11 oldu

        int c= ++b;                // once artir, sonra islem                      c=++b dedigi icin, once 10 olan b'yi 1 artirip 11 yapicaz. artik b=11 oldu.  sonuc olarakda c=11 oldu

        System.out.println("a : " + a + ", b : " + b + ", c : " + c);           // burada yazdirma en son islem oldugu icin a, b, ve c nin yeni degerleri yazdirilacak // 11  11  11

                                                                                // pre yada post increment'e dikkat edilecek cozulecek soru


        a=20;

        b=++a;

        c= a++;

        System.out.println("a : " + a + ", b : " + b + ", c : " + c);

        a=30;

        System.out.println(a++);   // 30

        System.out.println(--a);  // 30

        System.out.println(a--);  // 30

        System.out.println(a);   // 29





    }
}
