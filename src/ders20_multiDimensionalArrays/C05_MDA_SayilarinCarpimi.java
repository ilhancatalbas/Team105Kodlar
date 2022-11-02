package ders20_multiDimensionalArrays;

public class C05_MDA_SayilarinCarpimi {

    public static void main(String[] args) {

        //Soru 4-Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir method olusturun.

        int[][] arr= {{5,7},{5,8,9},{0,1}};

        System.out.println(elementleriCarp(arr));  // 0            // geldik en asagidan tekrar buraya. metodu cagirdik ve yazdirdik

    }


    public static int elementleriCarp(int[][] arr){



        int carpim = 1;                                            // carpim = 0 (sifir) olamaz. cunki sifirla carpimin sonucu hep sifirdir
                                                                   // tum elementleri gozden gecirecegimiz icin for loop olusturacagiz
        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                carpim*=arr[i][j];                                // napicaz: butun elementlerin carpimini istedigi icin. bu elemntleri carpimla carpicaz
            }
        }
                                                                  // simdi gir main metodun icerisine method call yap (cagir)
        return carpim;

    }
}
