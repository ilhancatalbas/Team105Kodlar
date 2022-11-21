package ders23_constructors;

public class HAraba {

                                            // instanve varibale; objeye bagli variable

    String marka= "Marka belirtilmedi";
    String model= "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public HAraba(String mrk,String mdl,String ykt, int yl,int fyt){

        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;
    }

    public HAraba(String mrk,String mdl,int yl){
        // istersek paramtreleri azaltarakta constructor olusturabiliriz
        marka=mrk;
        model=mdl;
        yil=yl;


    }


    public HAraba(){                                                 // bu bir parametresiz constructor.
        // gorunur durumdaki parametresiz construcor
        // default constructor DEGILDIR.
        // Default constructor'in body'si de bos olur
        // ancak parametresiz constructor'da body'e kod yazilabilir

        // parametresiz constructor'in body'sinde kod yoksa
        // default constructor ile ayni islevi gorur
        // ama yinede gorunur durumdaysa default cons. denmez


    }

    // biz gozle gorulur herhangi bir constructor olusturdugumuzda
    // Java default constructor'i siler
    // bu durumda daha once olusturulmus olan objelerin sorun olmamasi icin
    // class'a parametresiz bir constructor eklememiz faydali olur


    @Override
    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil   : " + yil +
                "\nfiyat : " + fiyat ;
    }

    public int maxHiz (String yakit){
        int maxHiz=120;

        if (yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        }
        return maxHiz;


    }


}
