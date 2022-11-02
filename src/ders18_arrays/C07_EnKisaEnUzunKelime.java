package ders18_arrays;

public class C07_EnKisaEnUzunKelime {

    public static void main(String[] args) {

        // soru 6- Verilen String bir array'deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun

        String[] arr = {"Hasan", "Adem", "Senturk", "Omer Faruk"};

        enUzunEnKisaIsimleriYazdir(arr);

    }

    public static void enUzunEnKisaIsimleriYazdir(String[] arr){                // yukarida String[] arr olusturduktan sonra bir method olusturacagiz. Bize birsey dondurmeyecek ama
                                                                                // yazdiran dedigi icin void olacak. Metod'un ismini yazdik. Biz burda neyin kisasi ve en uzununu yazdiracagiz.
                                                                                // parantez icine mecburen bir array yazmamiz lazim. String bir array gelmesi lazim sonra isim (arr)

        String enUzunKelime = arr[0];                                           // enuzun ve enkisa kelimelri olusturacagimiz variable'lari olusturmamiz lazim
        String enKisaKelime = arr[0];                                           // butun isimleri tek tek alip uzun-kisa karsilastirip hangisi uygunsa ona atayacak. for loop olusturalim

        for (int i = 0; i < arr.length; i++) {                                  // 0'in kendisine atadigimiz icin i=1 denbaslamak daha mantikli, arr.length'e kadar gidecek

            if (arr[i].length()>enUzunKelime.length()){                         // arr'nin i'inci uzunlugundaki kelime daha buyukse (>) neyden? en uzun kelimeden,
                enUzunKelime=arr[i];                                            // ozaman diyecegiz artik yeni en uzun kelime   enUzunKelime=arr[i];

            }

            if (arr[i].length()<enKisaKelime.length()){                         // ayni sekilde kisa ilede karsilastiracagiz
                enKisaKelime=arr[i];
            }

        }

        System.out.println("En uzun isim : " + enUzunKelime);                      // sona geldigimizde enuzun ve en kisa kelimeleri yazdirmamiz isteniyor
        System.out.println("En kisa isim : " + enKisaKelime);                      // yukarida main'in icinde methodu cagirip kullanacagiz

    }
}
