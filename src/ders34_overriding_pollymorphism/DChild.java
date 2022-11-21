package ders34_overriding_pollymorphism;

public class DChild extends CParent{

    // NOT: Object class'i butun class larin parentidir
    //      non primitiveler objecttir
    //      object class'i butun parentidir

    // Overridding Kurallari
    // 1- access modifier method signature'a dahil olmadigindan
    //    overridden ve overriding access modifier'lar farkli olabilir
    //    child parent'i sinirlandiramaz
    //    yani overridding methodu access modifier'i
    //    ayni veya daha genis kapsamli olmalidir
    //    private -- default -- protected -- public  (siralama)

    public void method1(){
    }


    // 2- private ve static method'lar override edilemez
    //    ayni isimde method olusturulunca Java CTE vermez
    //    ancak override issareti cikmaz ve
    //    @Override notasyonu kullanilmak istenirse CTE olur
    //    yani Java bunlari farkli class'lardaki farkli methodlar olarak kabul eder


    public static void method2(){

    }

    private void method3 (){

    }

    // 3- return type method signature'ina dahil olmadigindan farkli secilebilir
    //    Ancak return type void veya primitive ise ayni olmak zorundadir
    //    Eger return Type'lar non-primitive ise
    //    Child class'daki return type, parent class'daki return type'i
    //    ile ayni veya child'i olmalidir

    public void method4 (){

    }

    public String method5 (){
        return "";

    }



}
