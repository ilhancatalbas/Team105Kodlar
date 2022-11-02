package Ben01_calisma;

public class ilh01_SoruforLoop {

    public static void main(String[] args) {

        // verilen stringi ters den yazdir

        String str = "hadi bakalim unuttun mu";

        String tersden="";

        for (int i = str.length()-1; i >=0 ; i--) {

            System.out.print(tersden=str.substring(i,i+1));

        }

        System.out.println();


        //soru 1- 24 den 32 ye kadar olan sayilari yazdir yanyana

        for (int i = 24; i <32 ; i++) {

            System.out.print(i+" ");
        }

        System.out.println();


        //soru2-  2 basamkli sayilardan 50 ye kadar olanlari 3 ile bolunenleri yazdirin yanyana

        for (int i = 10; i <=50 ; i++) {

            if (i%3==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();



        //soru 2h- 2 basamakli sayilardan 7 ile bolunebilenleri yanyana yazdirin yanyana

        for (int i = 10; i <100 ; i++) {

            if (i%7==0){
                System.out.print(i+" ");
            }
        }

        System.out.println("");


        //soru4-  15 ile 25 arasindaki sayilari toplayip yayyana yazdirin


        int toplam=0;

        for (int i = 15; i <=25 ; i++) {

            toplam=toplam+i;
        }
        System.out.print(toplam);





    }
}
