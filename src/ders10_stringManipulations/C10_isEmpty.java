package ders10_stringManipulations;

public class C10_isEmpty {

    // is empty bize boolean dondurecek. bos mu degil mi  true yada false.   true=bos   false= bos degil
    // is empty su demek: icinde boslu yada baska bisey bile olsa, isempty  false doner
    // ama java ihtiyacin olursa diye icinde bosluk varsa (space), bunuda komtrol eden extradan bir method yapmis isBlank methodu
    // isBlank metodu ici bosluklardan olusuyor diyebiliriz

    public static void main(String[] args) {

        String str = "";

        System.out.println(str.isEmpty());

        str="    ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());      // isBlank'in gorevi: yani tamam biseyler var ama bisey yok yazmiyor

        str= "x";
        System.out.println(str.isEmpty());      // false doner cunku ici bos degil
        System.out.println(str.isBlank());      // false doner cunku ici bos degil

        // blank spaceleri kabul ediyor
        // ama empty kabul ediyor. empty diyorki "   "  bunu icinde bosluk var


    }

}
