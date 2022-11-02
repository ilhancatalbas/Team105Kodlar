package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {


        /* soru3: kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        * Isminiz: John
        * Soyisminiz: Doe
        * Yasiniz: 44
        * Kyadiniz Basariyla tamamlanmistir     */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");             // String icin kullanilabilen next () sadece ilk space kadar olan kismmi alir
        String isim = scan.nextLine();                             //  nextLine() ise o satirda yazilan tum bilgiyi alir. (uzun kelimeler icin)

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        System.out.println("isminiz:" + isim +"\nsoyisminiz: " + soyisim +"\nyasiniz: " + yas + "\nKaydiniz basariyla tamamlanmistir" );







    }
}
