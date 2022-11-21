package ders39_AbstractClasses;

public class CHondaCivic extends BHonda{


    @Override
    public void motor() {
        System.out.println("Honda Civic araclar vtec teknolojili cevreci motorlar kullanir");

    }

    @Override
    public void kasa() {
        System.out.println("Civic araclar sedan veya hb kasa kullanir");

    }

    @Override
    public void tekerlek() {
        System.out.println("civic araclar 205*16*55 teker kullanir");

    }

    @Override
    public void yakit() {
        System.out.println("Civic araclar benzinlidir");

    }

    @Override
    public void guvenlik() {
        System.out.println("Civic araclar guvenlik standardina uyar");

    }

    @Override
    public void abs() {
        System.out.println("Honda civic arabalar standart olarak ABS kullanir");
    }

    @Override
    public void klima() {
        System.out.println("Honda civic arabalar standart olarak klima kullanir");
    }

    public static void main(String[] args) {

        /*
        Abstract parent class'lardaki abstract method'lar
        concrete child class'lar tarafindan mecburen override edilir

        Ancak abstract parent'lardaki concrete method'lari
        override etmek mecburi degildi
        eger child class'a uyarlamak isterseniz override edebilirsiniz
        veya override etmeyip parent class'daki haliyle kullanabilirsiniz

         */
        CHondaCivic civic1 = new CHondaCivic();
        civic1.abs();                // Civic
        civic1.klima();              // Civic
        civic1.marka();              // Honda
        civic1.ozelTeknoloji();      // Honda
    }
}
