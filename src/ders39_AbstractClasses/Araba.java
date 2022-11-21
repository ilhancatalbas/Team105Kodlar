package ders39_AbstractClasses;

public abstract class Araba {

    // araba class'ini inherit eden tum class'lar
    // motor, marka, kasa ve tekerlek method'larini override etmek zorunda kalsin
    // ancak Abs, klima methodlari opsiyonel olsun
    // isteyen child bu methodlari override etsin, isteyen overiide etmesin


    public abstract void motor();


    public abstract void marka();


    public abstract void kasa();


    public abstract void tekerlek();


    public void abs(){
        System.out.println("Guvenlik arttirmak isteyen arabalar ABS kullanmali");
    }

    public void klima (){
        System.out.println("Konfor atirmak isteyen arabalar klima kullanmali");
    }

}
