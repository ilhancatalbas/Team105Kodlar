package HasanlaCalisma_day01;

public class C08_kakHasan {

    public static void main(String[] args) {

        //2 basamkli sayilardan 50 ye kadar olanlari 3 ile bolunenleri yazdirin yanyana

        for (int i = 10; i <50 ; i++) {

            if (i%3==0){

                System.out.print(i + "-");
            }
        }

        System.out.println();

        //15 ile 25 arasindaki sayilari toplayip yazdirin

        int toplam=0;
        for (int i = 15; i <=25 ; i++) {
             toplam += i;
        }

        System.out.println(toplam);

        System.out.println();


        //13 den baslayip 100e kadar sayilari 7 ser 7 ser arttirip yanyana yazdirin

        for (int i = 13; i < 100; i+=7) {

            System.out.print(i + " ");
        }

        System.out.println();

        //1den 10 na kadar sinirlar dahil olan sayilarin karelerini yazdirin yanyana. aralarinda bosluk olsun

        for (int i = 1; i <=10 ; i++) {

            System.out.print(i*i+" ");
        }





    }
}
