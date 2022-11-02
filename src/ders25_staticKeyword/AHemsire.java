package ders25_staticKeyword;

public class AHemsire {

    static String hastaneIsmi = "Yildiz Hastanesi";              // bu bilgiler herkes icin ortak oldugundan bunlari   static   olarak isaretleriz
    static String hastaneAdresi = "Cankaya / Ankara";
    static String bashekimIsmi = "Dr Mehmet Yilmaz";

    String personelIsim = "Isim belirtilmedi";                  // bu bilgiler
    String personelAdresi = "Adres belirtilmedi";
    String personelTelefon = "Telefon belirtilmedi";

                                                               // toSting metodu olusrmak istedigimizde, (code-generate-toString) static varibale lari koymuyor.
                                                               // bir class da static varibale da varsa sembolik olarak onada obje olusturulur
                                                               // 2. obje olusturuldugunda, bir obje daha olusturur java, atama yaptigimizda bunu kullanir
                                                               // static bir class uyeisi olan

    @Override
    public String toString() {
        return "AHemsire{" +
                "personelIsim='" + personelIsim + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ", \nhastaneIsmi ='" + hastaneIsmi + '\'' +            // istersek devamina static variable' 'larida ekleyebilirz
                ", hastaneAdresi ='" + hastaneAdresi + '\'' +
                ", bashekimIsmi ='" + bashekimIsmi + '\'' +

                '}';
    }
}
