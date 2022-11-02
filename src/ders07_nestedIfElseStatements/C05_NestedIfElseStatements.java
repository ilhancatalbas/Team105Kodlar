package ders07_nestedIfElseStatements;

public class C05_NestedIfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        int urunAdedi= 25;
        boolean kartVarmi= false;
        double listeFiyati = 20;
        double toplamFiyat = 0 ;

        // ana degisken kart olsun

        if (kartVarmi){

            // kart vada  kart yok    baska ihtimal yok
            // kart varsa ihtimal su: 10 urunden fazlami varmi 10 urunden azmi var

            // kartmi yokmuya gore yapimizi 2 ye bolduk.
            // kart varsa ihtimalleri yazdik. sonrada kart yoksaya gore ihtimalleri yazdik

            if (urunAdedi<0){
                System.out.println("Hatali urun adeti girisi");

            } else if (urunAdedi<10) {
                toplamFiyat= urunAdedi*listeFiyati * (0.85);
                System.out.println("%15 indirimli toplam fiyat " + toplamFiyat);
                
            }else {
                toplamFiyat= urunAdedi*listeFiyati * (0.80);
                System.out.println("%20 indirimli toplam fiyat " + toplamFiyat);

            }

            // burdada kart yoku cozecegiz

        }else{
            // kart yok
            if (urunAdedi<0){
                System.out.println("Hatali urun adeti girisi");

            } else if (urunAdedi<10) {
                toplamFiyat= urunAdedi*listeFiyati * (0.90);
                System.out.println("%10 indirimli toplam fiyat " + toplamFiyat);

            }else {
                toplamFiyat= urunAdedi*listeFiyati * (0.85);
                System.out.println("%15 indirimli toplam fiyat " + toplamFiyat);

            }





        }


    }
}
