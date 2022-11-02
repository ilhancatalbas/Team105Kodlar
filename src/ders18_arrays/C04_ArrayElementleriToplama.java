package ders18_arrays;

public class C04_ArrayElementleriToplama {

    public static void main(String[] args) {

        //Soru 2 - Verilen bir array'deki pozitif tamsayilari toplayip
        //         sonucu bize donduren bir method yaziniz.

        int [] arr = {3, -3, 5, -7, -6, 1, -2};

        // neticede toplamayi bir sonuca kaydetmem gerektigi icin bir toplam diye bir variable olusturacagim

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>0){                                         // diyorki soru sayi pozitifSE sarta bagli.bu sebebden if kullandik. pozitifse toplucam/ degilse bisey yapmicaz
                toplam += arr[i];                                  // bu sebebden if kullanip buyukse sifirdan diyoruzki sadece pozitif sayilar olsun
            }
        }                                                          // int toplam=0   dan baslayip buraya kadar olan kismi yok farzet. asagiya copy past yaptik, method istedigi icin

        System.out.println(toplam);

        //AMA SORUMUZ BIZDEN METHOD ISTIYOR. BU SEBEBDEN MAIN METHOD'UN DISINA CIKIP ORADA METHOD OLUSTURACAGIZ

        // onu ata, bunu yazdir, suna ata gibi bisey yok. ozaman sadece gormek icin yazdiriyoruz.

        System.out.println(pozitifElementleriTopla(arr));           // 9


    }

    public static int pozitifElementleriTopla (int[] arr){
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>0){
                toplam += arr[i];                                  // yuukaridaki islemi copy / past yaptik method hazir
            }
        }

        return toplam;

    }

}
