package ders16_doWhileLoop;

public class C04_DoWhile {

    public static void main(String[] args) {

        // aciklama en asagida var

        // Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //         sayının tam kare olup olmadığını bulunuz,
        //         tamkare ise true değilse false yazdırınız.
        //         Ornek : input : 16, output: 4


        int input = 126;
        int baslangic = 1;
        int bayrak=0;

        do{
            if (baslangic*baslangic==input){

                System.out.println("true");
                bayrak++;
                break;
            }
            baslangic++;
        }while(baslangic*baslangic<=input);

        if (bayrak==0){
            System.out.println("false");
        }
    }
}

        /*  mantigi;
        121 tam sayimi, 1'den baslicaz kontrol etmeye 1*1=1,  121 esit degil break kadar olan kisim calismayacak.
        baslingic kismi 1 articak 2 olacak.   2*2=input mu?  hayir ozaman tekrar calismayacak. baslangic yine 1 articak
        4*4,   5*5, ..... 11*11=121 de input'u bulucak true yazdiracak.
        en sona geldi dongu bitti. true yazdirmadiysa flase yazdiraca

         */
