package ders30_encapsulation;

public class EChild extends DParent {                  // extends yazip parentimizin adini yazdik DParent

    /*
      java'daki inheritance'in insanlrdan en buyuk farki :
      insanlarda parent child edinebilir ama chil parent'ini secemez
      Java'da ise tam tersidir
      - siz bir class olusturdgunuzda, daha once olusturlmus class'lardan inherit (miras almak) etmek istediginiz class'i PARENT EDINIRSINIZ

      Bir class baska bir class'i inherit etmek istediginde
      extends keyword ile bunu deklare eder
     */

    public static void main(String[] args) {

        EChild child1 = new EChild();                         // child class'dan bir obje olusturduk. yas diye bir deger atadik.
                                                              // objeyi child dan olusturuyoruz.
        child1.yas=30;
        child1.isim="Mahmut";
        child1.isEnough=false;


        // bende yoksa babamda vardir ornegi


    }
}
