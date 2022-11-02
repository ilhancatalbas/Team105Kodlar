package ders10_stringManipulations;

public class C08_LastIndexOf {

    public static void main(String[] args) {

        String str = "Java hafiften beyin yakiyor";

        System.out.println(str.lastIndexOf("a"));        // last a'yi bulacak sonra bize indexini verecek

        System.out.println(str.indexOf('e'));                // aramaya sondan baslayip 'e' yi aricaz. son 'e' nin indexi bastan sayiyoruz
                                                             // saymayi sondan yapmiyoruz. sondaki e yi ariyoruz. karistirma

        System.out.println(str.lastIndexOf("java"));    // java ariyoruz ama aramaya sondan basliyoruz. j kucuk oldugu icin bulamaz -1'i verir. kucuk - buyuk harfe dikkat et

        System.out.println(str.lastIndexOf("Java"));    // ilk Java'nin ilk J si oldugu icin ilk index olacagi icin 0 (sifir) verir bize

        System.out.println(str.lastIndexOf("e", 14));     // e ariyorum ama 14 den basliyacagiz aramaya (b den (cunku b 14 teakbul ediyor)
                                                                        // geriye doru baslicaz) e'nin indexini bastan sayamaya baslicaz



    }
}
