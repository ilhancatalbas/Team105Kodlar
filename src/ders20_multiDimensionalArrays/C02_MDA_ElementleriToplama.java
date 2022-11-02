package ders20_multiDimensionalArrays;

public class C02_MDA_ElementleriToplama {

    public static void main(String[] args) {

        int[] arr1= {3,5,7,8};    // 23

        int toplam=0;

        for (int i = 0; i <arr1.length ; i++) {

            toplam+=arr1[i];
        }
        System.out.println(toplam);

        //___________________________________________________________


        int [][] arr ={{1,2},{3,4,5},{7}};
        // elementlerini toplayalim

        toplam=0;

        for (int i = 0; i < arr.length ; i++) {                      // mesela arr[i] diyince bize ilk index 0 olarak {1,2} getirecek ama biz bunu toplayamayiz. for loop olustugunda inner array'in icindeki array ulasiyoruz
                                                                     // elementlere ulasmak istiyorsak icine bir kere daha for loop olusturacagiz. Dinamik yapacagiz. arr[i]'nin length'tina kadar git diyecegiz
            for (int j = 0; j <arr[i].length ; j++) {                // boylece 0'inci index aldigimizda 0'inci index'in array'in uzunlugunu alacak, 1. index dendiginde1. index'teki arrayin uzunlugunu alacak. 2 aldigimizda....

                toplam+= arr[i][j];
            }
        }
        System.out.println("2 katli arrayin elementleri toplami "+ toplam);  // 22



    }
}
