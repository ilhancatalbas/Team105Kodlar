package ders07_nestedIfElseStatements;

public class C02_IfElseStatements {

    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        // degisken sayimiz 2
        // birinci degisken urun adeti
        // ikinci degiskenken boolen   kart   ya vardir yada yoktur   true yada false

        // kendime Not1: urunAdeti*listeFiyati   satis fiyati olur

        // kendime Not2: kartvarmi==true    yazmaktansa          kartvarmi   yazmak yeterli

        int urunAdeti=8;
        boolean kartvarmi= false;
        double listeFiyati= 12.5;
        double toplamFiyat= 0;

        if (kartvarmi && urunAdeti>=10) {
            toplamFiyat= urunAdeti*listeFiyati * (0.8);
            System.out.println("% 20 indirimli toplam fiyat " + toplamFiyat);

        } else if (kartvarmi && urunAdeti<10 && urunAdeti>0) {
            toplamFiyat= urunAdeti*listeFiyati * (0.85);
            System.out.println("% 15 indirimli toplam fiyat " + toplamFiyat);

        } else if (!kartvarmi && urunAdeti>10) {
            toplamFiyat=listeFiyati*urunAdeti * (0.85);
            System.out.println("Kartsiz %15 indirimli toplam fiyat " + toplamFiyat);

        } else if (!kartvarmi && urunAdeti<10 && urunAdeti>0) {
            toplamFiyat=listeFiyati*urunAdeti * (0.9);
            System.out.println("kartsiz %10 indirimli fiyat " + toplamFiyat);

        }else{
            System.out.println("Gecersiz Giris");
        }


    }
}
