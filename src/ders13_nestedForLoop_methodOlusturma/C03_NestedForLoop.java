package ders13_nestedForLoop_methodOlusturma;

public class C03_NestedForLoop {

    public static void main(String[] args) {

        // 1-4 arasi sayilar icin carpim tablosu olusturalim

        // dis dongu satirlari kontrol eder  (yukaridan asagiya olan rakamlar diyebiliriz

        for (int i = 1; i <=4 ; i++) {

            // ic dongu her satirda olan degerleri kontrol eder    (soldan saga olan rakamlar)
            for (int j = 1; j <=4 ; j++) {

                System.out.print(i*j + " ");         // asagidaki sout olmasaydi boyle yazacakti    // 1 2 3 4 2 4 6 8 3 6 9 12 4 8 12 16

            }

            // ic dongu bittiginde alt satira inmeliyiz. ic dongu bir ustteki suslu parantezle bitiyor.
            // bunuda ic dongu disina bir bos sout la yapabiliriz. Asagidaki gibi. yoksa yanyana yazar
            // biz her donguden sonra bir alta yazsin istiyoruz

            System.out.println("");         // ayni zamanda dikkat bunda ln de var
            
        }

    }
}
