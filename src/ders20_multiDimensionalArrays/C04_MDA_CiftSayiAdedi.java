package ders20_multiDimensionalArrays;

public class C04_MDA_CiftSayiAdedi {

    public static void main(String[] args) {
        
        // verilen 2 katli bir int array deki cift sayi adedini bulan kod yaziniz
        
        int[][] arr= {{4,6},{3,5,8},{1,0,4}};

        int sayac=0;
                                                           // mantik ayni. 2 katli bir array in tum elementlerini kontrol etmek istedgimizde for loop. yine ayni mantik: yukari bir sayac olustur adedeti bul.
        for (int i = 0; i <arr.length ; i++) {             // bu dis array in uzunluguna kadar

            for (int j = 0; j < arr[i].length; j++) {      // buda ic arrayin uzunluguna kadar

                if (arr[i][j] %2==0){      // bu tum elementlleri gozden geciriyor demek. gozden gecirip 2 ye bolunenleri bulunca sayaci 1 artiracak
                    sayac++;


                }
            }
        }

        System.out.println("arraydeki cift sayi adeti : " + sayac);

        // Multi dimensional Array'in tum elementlerine ulasmamiz gerektiginde, katman sayisi kadar ic ice loop olusturmaliyiz
        
        
        
    }
}
