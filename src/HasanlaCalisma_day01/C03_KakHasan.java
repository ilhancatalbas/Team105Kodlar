package HasanlaCalisma_day01;

import java.util.Scanner;

public class C03_KakHasan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");
        
        char ilkHarf= scan.next().charAt(0);
        
        if (ilkHarf=='o' || ilkHarf=='O'){
            System.out.println("ocak");
        } else if (ilkHarf=='s' || ilkHarf=='S') {
            System.out.println("subat");            
        } else if (ilkHarf=='m' || ilkHarf=='M') {
            System.out.println("mart veya mayis");
        }else {
            System.out.println("gecerli bir harf giriniz");
        }

        System.out.println("_________________________________");

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise“ Eskenar ucgen”,
        // ikizkenar ise“ Ikizkenar ucgen”,
        // cokkenar ise“ cokkenar ucgen”,  yazdirin

        Scanner ucgen = new Scanner(System.in);


        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("eskenar ucgen");
        } else if (kenar1!=kenar2 && kenar2!=kenar3 && kenar1!=kenar3) {
            System.out.println("cokkenar ucgen");

        } else{
            System.out.println("ikizkenar ucgen");

        }


    }
}
