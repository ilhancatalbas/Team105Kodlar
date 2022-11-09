package ZArrays_Ders_Anlatimi;

public class C04_DerstekiOrnekler01 {

    public static void main(String[] args) {

        //     SORULAR ORNEK CALISMA

        // array'in bir elementine ulasmak istersek ve update etmek istersek

        int [] arr1 = {2, 4, 6, 8, 10};

        System.out.println(arr1[2]);                                       // arr1'in 2. elementini istedik.  6'yi verdi

        arr1[3]=20;                                                        // arr1'in 3/ elemntini 20 yap dedik. index'i 3 olan element 8'dir. 8'i sildi 20 yapti

        System.out.println(arr1[3]);

        // son elementi yazdirin
        System.out.println(arr1[arr1.length-1]);                           //10   //  son elemnti yazdirmak icin, arr1 variable yazdiktan sonra, index'i [] icine yazdigimiz icin,
                                                                           // [] icine arr1'in son index'i seklinde isteyecegiz son elementi.   arr1[arr1.length-1]

        // array'in tum elementlerini yazdirin

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] +" ");                               // arr1'in i'inci index'indeki elementi yazdirdigimizda  // 2 4 6 20 10
        }


        // array'in uzunlugunu sonradan degistirilemez

        arr1[5]=35;

        // Eger array'de olmayan bir index'e atama yapmak isterseniz ArrayIndexOutOfBoundsException hatasini verir
        // bu hata CTE degil, RUn time error'dur. 5. index olup olmadigini ancak calistirilinca anliyor






    }
}
