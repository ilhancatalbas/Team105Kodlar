package ders34_overriding_pollymorphism;

public class BChild extends AParent{

    public void method1(){
        System.out.println("child class method1");
    }

    public void method2 (int a){
        // overriding olabilmesi icin
        // hem method ismi hemde method signature ayni olmalidir
        System.out.println("child class method2");
    }

    public void method2(String isim){
        System.out.println("child class String parametreli method2");


    }
    @Override
    public void method3() {
        // super.method3();
        // overridding varsa parent ve child class'daki
        // overidden ve overridding method'lardan sadece biri calisir
        // eger ikisini birden calistirmak isterseniz
        // super.overriddenMethodIsmi yazilir

        /*
          overridding method @Override notasyonu ile isaretlenebilir
          @override kullanilmayan overriding isleminde,
          parent class'daki overridden method silinirse hicbir sorun olmaz

          Ancak @override kullanilmayan overriding isleminde,
          parent class'daki overridden method silinirse veya signature i degistirilirse
          Java CTE verir, boylece overridden method'un silinmesi engellenir.


         */


    }
}
