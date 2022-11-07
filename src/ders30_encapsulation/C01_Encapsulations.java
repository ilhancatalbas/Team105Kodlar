package ders30_encapsulation;

public class C01_Encapsulations {

    public static void main(String[] args) {

        AEncapsuleClass pers1 = new AEncapsuleClass();

        // pers1.hastaneAdi = "Java Hastanesi";                // hastane simi private olduguicin gorulemez

        // pers1.hastaUcreti=10000;                            // private oldugu icin kullanilamaz


        // pers1.hemsireAdresi="Ankara";                       //private oldugundan ulasilamaz

        // pers1.hemsireIsmi= "Yildiz Yildiz";                 //private oldugundan ulasilamaz

        System.out.println(pers1.getHastaneIsmi());            // bi bize bir String bir deger getiriyor direk. variable getirmiyor. deger atayamazsin
        // Yildiz Hastanesi                                    // ya karsisina bir variable olusturup deger atayabilirsin. yada yazdirabilirsin

        pers1.setHastaUcreti(500);                             // set hasta ucretide bir int parametre istiyor. diyorki hasta ucretini buraya parametre olarak yazmak zorundasin
                                                               // ve bu bisey dondurmeyecek bize. void oldugu icin istesekde yazdiramayiz. sonuna  .sout yapsak cikmaz. istesekde yazdirmak mumkun olmaz
                                                               // parantez icine bisey yazmassak kabul etmez. illa bisey yazmali yoksa CTE olur
                                                               // zaten bunun amaci atansin ama gorunemesindi

        // nolcak peki bu? biz bunu girecegiz. java bunu database koyacak. Database'den raporlama yapilacak. ama personel goremicek bunu

       // buna  data hidden   de deniyor. bilgi gizlemek gibi

       // getter ve setter method'lari
       // bazende erisimi sinirlandirma icin degil,
       // kullanicilarin islevi iyi anlamasi icin kullanilir  (develepor lar arasinda)

        System.out.println(pers1.getHemsireAdresi());    // pers1.getHemsireAdresidedigimizde bu bir method. bu bizi hemsire Adresi methoduna getiriyor. (onceki class'da)
        pers1.setHemsireAdresi("Istanbul");
        System.out.println(pers1.getHastaneIsmi());
    }
}
