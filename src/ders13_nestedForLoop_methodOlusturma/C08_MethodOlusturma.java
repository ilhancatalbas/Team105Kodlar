package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {

    public static void main(String[] args) {

        // kullanicidan 2 sayi alip bunlarin toplamini olusturan bir method olusturun


        isteToplaYazdir();                           // burda methodu cagirdik. main methodun icinde cagirdik
        isteToplaYazdir();


    }


    public static void isteToplaYazdir(){            // public le basladik. static: main method'dan kullanabilmek icin. bana birsey dondurmeyecek sadece yazdiracagi icin void dedik
                                                     // sayiyi kullanicidan alacagimiz icin parametre olusturmamiza gerek yok. main'den sadece calistiracagiz
                                                     // kullanicidan nasil sayi aliriz?  scanner aliriz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("girilen sayilaarin toplami : " + (sayi1+sayi2));


        // ustteki yazdigimiz main methodun icinde degil. main methodda bunu cagirmamiz lazim (method call). yoksa sout calisir ama bisey gorunmez


    }

}
