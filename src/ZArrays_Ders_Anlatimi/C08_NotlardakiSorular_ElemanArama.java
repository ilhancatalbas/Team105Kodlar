package ZArrays_Ders_Anlatimi;

public class C08_NotlardakiSorular_ElemanArama {

    public static void main(String[] args) {

        // Soru 4-Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //        kullanildigini yazdiran bir method olusturun.


        int [] arr = {1, 2, 4, 5, 3, 6, 7, 4, 2, 3, 5, 1, 3, 2, };

        int arananEleman = 2;

        elemanAra(arr,arananEleman);

    }

    public static void elemanAra (int[] arr, int arananEleman){

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arananEleman==arr[i]){
                count++;
            }
        }

        if (count==0){
            System.out.println("Aranan sayi array'de yok");

        }else {
            System.out.println("aranan : " + arananEleman+ " sayisi arrayde " + count + " kere kullanilmistir");
        }





    }
}
