package ders21_ArrayList_EKSIKK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ElementEkleme {

    public static void main(String[] args) {

        // ogretmenden ogrenci notlarini alip bir list olusturun
        // ogretmen 100'den buyuk bir sayi girip, bitirdiginde
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        List<Double> notlar =ListeOlustur();

        System.out.println(notlar);

        raporla(notlar);


    }

    public static void raporla(List<Double> notlar) {
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        int ogrenciSayisi= notlar.size();
        double notlarToplami=0.0;
        double sinifNotOrtalamasi=0.0;
        int ortalamaUstundekiOgrenciSayisi = 0;

        // not lar toplamini bulalim

        for (int i = 0; i <notlar.size() ; i++) {

            notlarToplami+= notlar.get(i);
        }

        // not ortalamasini bulalim

        sinifNotOrtalamasi=notlarToplami/ogrenciSayisi;

        // ortalama ustundeki ogrenci sayisi bulalim

        for (int i = 0; i < notlar.size(); i++) {                    //Butun notlari gozden geciriyoruz. ortalamadan buyukmu degilse saymiyoruz buyukse sayiyoruz

            if (notlar.get(i)>sinifNotOrtalamasi){
                ortalamaUstundekiOgrenciSayisi++;
            }
        }

        //raporlar icin istenenleri yazdiralim

        System.out.println("Girilen not sayisi: " +ogrenciSayisi +
                "\nGirilen notlarin ortalmasi: "+ sinifNotOrtalamasi+
                "\n Ortalama uzerinde not alan ogrenci sayisi: "+ ortalamaUstundekiOgrenciSayisi);




    }

    public static List<Double> ListeOlustur(){

        List<Double> notlar = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        Double girilenNot=(double)5;                // int i double cast ettik

        while (girilenNot<=100){

            System.out.println("lutfen listeye girmek icin not giriniz" +
                    "\nBitirmek icin  100'den nuyuk sayi girin");
            girilenNot= scan.nextDouble();

            if (girilenNot>0){
                notlar.add(girilenNot);
            }
        }
        return  notlar;

    }
}
