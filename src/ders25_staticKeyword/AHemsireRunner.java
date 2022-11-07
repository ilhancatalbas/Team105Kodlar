package ders25_staticKeyword;

public class AHemsireRunner {

    public static void main(String[] args) {

        AHemsire h1 = new AHemsire();                      // hemsire class indan bir obje olusturuyoruz. bu parametresiz cons dur. defaultt java olusturuyor
        h1.personelIsim="Ayse";                            // h1. ile atama yapmak istersek yapabiliriz
        h1.personelAdresi= "ulus";
        h1.personelTelefon = "31212345";
        System.out.println(h1);                            // 8. satiri yazdigimizda, java hemen bir obje olusturuyor. h1 objesi. instance varibale'lari direk objenin uzerine isaretler
                                                           // isim, adres, telefon. onceki class da toString metodu olusturduk


        AHemsire h2 = new AHemsire();                      // aHemsire class'indan 2. bir obje olusturuyoruz
        System.out.println(h2);
        h2.personelIsim="Hatice";                          //h2 uzerinden bashekim isminide degistirirsek, h1 inde bashekim ismi degisir
        h2.personelAdresi="Sincan";                        // neden? cunku; bashekim herkesin bashekimi. static oldugu icin biri degistigi zaman herkes icinde degismis olur
        h2.personelTelefon="312323232";
        h2.bashekimIsmi = "Yasar Kemal";


        System.out.println("h1 : " +h1);                  // biz 2inci h2. yaptik diye h1 ler degismez
        System.out.println("h2 : " +h2);
                                                          // biz 20. satiri yazdigimizda java h2 objesibe gidecek.
                                                          // objede yoksa class da statik olarak varmidir diye bakar. varsa yeni atamayi yapar

                                                          // biz static bir variable da degisiklik yaparsak, o degisiklik o satirdan itibaren tum objeler icin olur. orn: bashekim ismi
                                                          // ama instance lar standart
        AHemsire h3 = new AHemsire();
        System.out.println("h3 : " + h3);
        h3.hastaneIsmi = "Java Hastanesi";                // bu satirdan itibaren tum objeler icin hastane ismi  Java Hastanesi'dir. alltaki sout da gordumuz gibi

        System.out.println(h2.hastaneIsmi);               // Java Hastanesi






    }


}
