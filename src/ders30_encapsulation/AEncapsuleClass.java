package ders30_encapsulation;

public class AEncapsuleClass {

    private String hastaneIsmi = "Yildiz Hastanesi";
    // hastane ismi gorulebilsin ama degistirilemesin                                     gorulecek ama yazilamicak
    // getter method'u lazim


    public String getHastaneIsmi() {                          // hastaneIsmi icin getter metodu olusturduk==>  code  -  generate - getter
        return hastaneIsmi;
    }

    public void setHastaUcreti(int hastaUcreti) {            // hasta ucreti icin setter metodu olsuturduk==>  code  -  generate - setter
        this.hastaUcreti = hastaUcreti;
    }

    private int hastaUcreti;
    // hasta ucretleri de giris yapilabilsin ama ucreti sigortadan alinacagi icin         yazilacak ama gorulemicek
    // personel hasta ucretlerini goremesin
    // setter metodu lazim

    private String hemsireIsmi;
    private String hemsireAdresi;
    // bu instance variable'lara herkes ulasabilsin
    // bu durumda public yapmak akla gelen ilk cozum olacaktir
    // bu variable'lari public yapmak yerine, private yapip , getter ve setter olusturmak da ayni oslevi gorur

    // code gittik generate yaptik  getter ve setter var ayni satirda onu kullandik
    // kullanimda kolaylik sagladi

    public void setHastaneIsmi(String hastaneIsmi) {
        this.hastaneIsmi = hastaneIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }

    // setter ve getter method'larini olusturmak icin:  ustte; code  sonra generate orda getter ve setter var


}
