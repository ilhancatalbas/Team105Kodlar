package ders24_constructors;

public class Araba {

    String marka= "Marka belirtilmedi";
    String model= "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public Araba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public Araba(String mrk, String mdl){
        marka=mrk;                                        // artik class icinde atama yapamak istemedimizden dolayi. cons. icinde atama yapmak istiyoruz
        model=mdl;

    }

    //constructor'i intelliJ'nin otomatik olusturmasini istiyorsak, ust menuden code, sonra generate sonra constructor'i secebiliriz

    public Araba(String marka, String model, int fiyat) {
        this.marka = marka;                                // buardaki this'ler olmasa java bu scop'dan disari cikamiyor
        this.model = model;                                // this ile biz java'ya bu bizim markamiz modelimiz diyoruz. yukaridakiler yani
        this.fiyat = fiyat;
    }

    public Araba(){                                       // biz cons olusturdugumuz icin, java default cons. sildigi icin parametresiz bir cons olusturduk

    }

    @Override
    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil   : " + yil +
                "\nfiyat : " + fiyat ;
    }


}
