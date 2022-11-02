package ders24_constructors;

public class ArabaRunner {

    public ArabaRunner() {
    }

    public static void main(String[] args) {

        Araba arb1 = new Araba();      // degerleri olusturulmadigi icin tek tek atama yapacagiz

        arb1.marka="Citroen";          // artik arb1 e default deger bu degerleri yazicak
        arb1.model="C3";
        arb1.yakit="Benzin";
        arb1.yil=2020;
        arb1.fiyat=20000;

        System.out.println(arb1);

                                       // herseferinde tek tek atama yapmak yerine bu atamayi 1 kere yapalim
                                       // heryeni verdigimizde gecerli olsun. bunu icin parametreli constructor olusrmamaiz lazim
                                       // cons. class adiyla ayni olmali
                                       // biz Araba classini constructor olusturdugumuzda, java default cons. sildi. bized ayni class'a bide parametresiz constructor olusturuyoruz

        Araba arb2= new Araba("Volvo","CX60");    // bunu boyle parametreli yapinca yukarida gibi tek tek atama yapmamaiza gerek kalmadi
        System.out.println(arb2);                           // yazdirinca marka ve model bizim yazdigimiz digerleri default deger

        Araba arb3 =new Araba("Hyundai","i10",10000);
        System.out.println(arb3);

        Araba arb4 = new Araba("Porche","cayan","Lpg",1990,12000);
        System.out.println(arb4);

                                         // NOT: bir kac tane constructor varsa hangisinin caliscagini, java parametrelere gore karar verir


    }

}
