package HasanlaCalisma_day01;

public class C04_KakHasan {

    public static void main(String[] args) {

        // soru 3 -Kullanicidan yasini isteyin, 65 yas ve uzeri ise
        //         ”Emekli olabilirsin” yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.
        //          yas 120 den buyuk, 18'den kucuk olmasin


        int yas=55;

        if (yas>120 || yas<18){
            System.out.println("Hatali giris yaptinz");
        }
        else if (yas>=65) {
            System.out.println("emekli olabilirsin");
        }

        else {
            System.out.println("emekli olmak icin kalan sure: "+ (65-yas));
        }


    }
}
