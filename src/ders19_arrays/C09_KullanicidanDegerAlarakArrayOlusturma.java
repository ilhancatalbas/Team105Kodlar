package ders19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidanDegerAlarakArrayOlusturma {

    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi alip bir array olusturun
        // kullanici eleman girisini bitirmek icin 0'a bassin

        Scanner scan = new Scanner(System.in);

        int[] arr= {0};

        int girilensayi=0;


        do {

            System.out.println("arraye eklemek icin tam bir sayi giriniz" +
                    "\nBitirmek icin 0'a basin");

            girilensayi= scan.nextInt();
                                                                 // kullanici  ilk defa deger giriyorsa eger array'in icindeki 0'in indexteki element 0'sa ilk defa giriyordur
            if (arr[0]==0){                                      // arr'nin 0'inci indexindeki sayi sifirsa ilk defa deger giriyordu.
                arr[0]=girilensayi;                              // arr'nin 0'inci indexindeki deger girilensayi olsun
            }else if(girilensayi!=0){                            // degilse eger    C08_ArrayeElemanEklemeMethodu'na    yollayacagiz.
                arr=C08_ArrayeElemanEklemeMetodu.arrayeElemanEkle(arr,girilensayi);            // bizim arrayimizi ve girilecek sayiyi ona yollayip, bunuda arraye esitleyecegiz.

            }

        }while (girilensayi!=0);

        System.out.println(Arrays.toString(arr));

    }



}
