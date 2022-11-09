package ZArrays_Ders_Anlatimi;

public class C11_NotlardakiSorular_ElemanlariSagaKaydirma {

    public static void main(String[] args) {

        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        //         sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        //         Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

        // Napicaz kisaca; 4'u 5'in yerine, 5'u 6'nin yerine, 6'u 7'in yerine, en son olarakda 7'yi 4'un yerine alacagiz
        // Hatirlatma; kum dolu kova, su dolu kova mantigini hatirla.


        int[] arr = {4, 5, 6, 7};

    }

    public static int [] sagaKaydir (int[] arr){                      // bir array olsunki saga kaydirsin, parametre lazim.

        int bosKova = arr[arr.length-1];                              // array'in son elementini bos kovaya koyduk

        for (int i = arr.length-2; i >0 ; i++) {                      // array'in sondan 2. elementini son elemente atayacagiz. sondan basa geldigi icin i-- olacak

            arr[i+1]=arr[i];                                          // saga kaydirdigimiz icin i+1 olani i ye atamadik

        }

        arr[0]=bosKova;


    }
}
