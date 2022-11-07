package ders27_immutableClasses_DateAndTime;

public class C01_Immutable {

    public static void main(String[] args) {

        // Bu kod calistiginda Java kac obje olusturur ?

        String str = "Ali";

        for (int i = 1; i <10 ; i++) {                           // 9. satirda java stack memory de str'i olusturacak. bunun point ettigi Heap memory de bir obje olusturacak ve degeride Ali olacak
            str+=".";                                            // 12. satirda atama var. i=0 oldugunda str'in sonuna bir tane  . (nokta) ekleyecegiz. yani  str=Ali.  olacak. str'a bir atama var.
        }                                                        // Java immutable olgundan degerini degistiremeceginden, referans yine stack memory deki str olacak, Heap memory gelecek yeni bir obje olusturacak  Ali.
                                                                 // pointer buna cevirip eskini yok edecek.
        System.out.println(str);                                 // Sonra i=1  olacak. Ali.  nin sonuna bir tane daha nokta koyacak. Ali.. olacak. Heap de yeni bir tane daha obje olusturacak. Ali..  oncekini yok edecek
                                                                 // boy boyle i=9 oluncaya kadar gidecek. Ali.........   bunu point edicek ve oncekileri silecek.

    }                                                            // 1 tane obje  String str = "Ali";  olustu.  for dongusunde 0'dan 9'a kadar yani 10 tanede for dongusunde olustu
}                                                                // yani cevap 1+10=11   (11 tane obje olustu)
