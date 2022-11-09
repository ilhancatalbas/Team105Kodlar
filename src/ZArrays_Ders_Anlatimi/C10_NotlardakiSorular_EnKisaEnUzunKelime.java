package ZArrays_Ders_Anlatimi;

public class C10_NotlardakiSorular_EnKisaEnUzunKelime {

    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri
        //         yazdiran bir method olusturun.

        String [] arr = {"Hasan", "Adem", "Senturk", "Omer faruk"};

        enUzunEnKisaKelime(arr);


    }

    public static void  enUzunEnKisaKelime (String[] arr){        // neyin en uzun veya kisasini yazdircam? mecburen parametrye array gelmesi lazim.  (String[] arr)

        String enUzunKelime = arr[0];                             // 0'inci indexi bir deger vermemiz gerektigi icin yazdik
        String enKisaKelime = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length()>enUzunKelime.length()){            // 2 tane ayni uzunlukta isim varsa; > yaparsan oncekini alir. Esitlik koyarsak >= sonraki kelimeyi alir
                enUzunKelime=arr[i];
            }

            if (arr[i].length()<enKisaKelime.length()){
                enKisaKelime=arr[i];
            }
        }

        System.out.println("En uzun isim : " + enUzunKelime );
        System.out.println("en kisa isim : " + enKisaKelime);


    }

}
