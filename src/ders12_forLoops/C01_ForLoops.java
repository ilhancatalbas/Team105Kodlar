package ders12_forLoops;

public class C01_ForLoops {

    public static void main(String[] args) {

        String str = "Java\n";

        System.out.println(str.repeat(10));

        // repeat olmasaydi 10 kere   System.out.println(str);   yazacaktik. kullanissiz bir islem olurdu


        // mesela deseydik ki 1'den 100' ekadar sayilari yazdirin
        // 3 basamkli 23 ile bolunebilen sayilari yazdirin.
        // tek tek bunlari yapmak cok zahmetli olacakti

        for (int i = 0; i < 10; i++) {

            System.out.print(i + " ");

        }






    }
}
