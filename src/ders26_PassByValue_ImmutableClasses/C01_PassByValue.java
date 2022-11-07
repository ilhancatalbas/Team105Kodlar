package ders26_PassByValue_ImmutableClasses;

public class C01_PassByValue {

    public static void main(String[] args) {

            double fiyat = 100;

            System.out.println(indirimUygula(fiyat));   // 90
            System.out.println(indirimUygula(fiyat));   // 90
            System.out.println(indirimUygula(fiyat));   // 90

            System.out.println(fiyat);                  // 100

            fiyat = indirimUygula(fiyat);

            System.out.println("indirim uygulanmis yeni fiyat : " + fiyat);



    }

    // kodlarimizn anlasilir olmasi icin main methodadan diger methodlara
    // parametre olarak gonderdigimiz variable'lar icin ayni isimli variable olusturmayi TERCIH EDERIZ.

    // java methodlar arasinda gecis yaparken variable'i degil
    // variable'in value'sunu pass eder

    // bu javanin Pass By Value'yu tercih etmesinden kaynaklaniyor

    // eger methodun icerisinde yaptiginiz degisikligin main methodun icerisinde gecerli olmasini isterseniz,
    // main method icerisinde   fiyat=indirimUygula(fiyat)
    // atamasini yapabiliriz

        public static double indirimUygula(double fiyat) {
            // %10 indirim yapsin

            fiyat = fiyat*0.9;    // fiyata atama yaptik kalici olarak 90 oldu

            return fiyat;
        }
}

// biz fiyata atama yaptik eski fiayatin %10 indirimli hali olsun dedik.
// metodu cagirdiktan sonra 90 oluyor ama main methoddaki fiyat degismez 100 oluyor.

// java value uzerinden islem yaptigi icin methodlar arasi value gonderir
// pass by value = value gecirmek demek

