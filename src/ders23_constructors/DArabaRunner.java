package ders23_constructors;

public class DArabaRunner {

    public static void main(String[] args) {

        // DAraba class'indan bir obje olusturalim

        DAraba arb1= new DAraba();

        System.out.println(arb1.marka);  // Marka belirtilmedi
        System.out.println(arb1.model);  // Model belirtilmedi
        System.out.println(arb1.yakit);  // null
        System.out.println(arb1.yil);    // 0
        System.out.println(arb1.fiyat);  // 0

        arb1.marka="Tofas";
        arb1.model= "Kartal";
        arb1.yakit="Benzin";
        arb1.yil= 1991;
        arb1.fiyat=50000;
        arb1.maxHiz(arb1.yakit);

        System.out.println(arb1.marka);  // Tofas
        System.out.println(arb1.model);  // Kartal
        System.out.println(arb1.yakit);  // Benzin
        System.out.println(arb1.yil);    // 1991
        System.out.println(arb1.fiyat);  // 50000
        System.out.println(arb1.maxHiz(arb1.yakit)); //230

        DAraba arb2 =new DAraba();     // mesela burada java araba objesi olusturur. class da  tanimlanan ozelliklerini, constructor sayesinde tanimlar. marka, model, yakit, yil, fiyat gibi
                                       // bir kopya variable olusturuyor, class'da olusturulan degerlere atiyor
                                       // arabamcom da bu sorular sorular soruldugunda musteri frontend gordugu bu sorulari cevaplar,
                                       // devoloper'in yazdigi kodlar o cevapi ordan alir backend'de ilgili yere atamasini yapar

        // arb2'nin ozelliklerini yazdirmak istsek

        System.out.println("Marka : " + arb2.marka +
                           "\nModel : " + arb2.model +
                           "\nYakit : " + arb2.yakit +
                           "\nYil : " + arb2.yil +
                           "\nFiyat : " + arb2.fiyat);

        DAraba arb3 = new DAraba();                         // herseferinde tek tek sout'la ugrasmamak icin to string metodunu kullanacagiz
                                                            // onceki class'a gidip: ust menude 'code': ordada 'generate' den, 'toString'den olusturabilirz
                                                            // onceki class'dada olusan code da  dizaynini kistedigim gibi degisebilirim. araba yerine guzel araba yaz istersen
        System.out.println(arb3);
        System.out.println(arb1);

        DAraba arb4 = new DAraba();
        System.out.println(arb4);


    }
}
