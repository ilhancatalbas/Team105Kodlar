package ders38_abstractClasses;

public abstract class CParentAbstractClass {
    /*
    Abstract bir class abstract method'lara sahip olabilir
    Bir class'i abstract yapmak icinclass declaration'ina abstract keyword eklenmelidir.


     */

    public abstract void mecburiMethod1();

    public abstract void mecburiMethod2();
    // soyut (abstract) methodlarin body'si olmaz

    public String concreateMethod(){
        // Bugune kadar kullandigimiz normal method'lara
        // soyut olmayan method demek yerine concreate method denir
        return "";
    }



    /*
    Bir parent class'da child class'larin mutlaka override edecegi bir method olusturdugumuzda
    method body'si gereksizlesir
    cunku hic calismiyacaktir

    1- abstract parent class'dan obje olusturulamayacagi icin objeler icin bu method kullanilamaz
    2- child class'larda mecburen obu method'u verride edeceklerinden,
    bu method'un body'si asla KULLANILMAYACAKTIR

    Java hic kullanilmayacak bu method body'leri yazmamaiza imkan tanimistir

     */

    // Child class'larin mutlaka override etmesini istedigimiz method'lari
    // abstract olarak tanimlar ve body'siz olarak olustururuz.
}
