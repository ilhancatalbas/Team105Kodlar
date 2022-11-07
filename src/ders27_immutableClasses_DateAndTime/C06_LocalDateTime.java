package ders27_immutableClasses_DateAndTime;

import java.time.LocalDateTime;

public class C06_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime zaman = LocalDateTime.now();

        System.out.println(zaman);                       // 2022-11-03T18:05:12.605476500
                                                         // burda hersey ile oynayabiliriz
        System.out.println(zaman.getDayOfYear());        // bugun yilin 307. gunu

        System.out.println(zaman.plusDays(10));          // zaman.plus ile ne kadar istersek okadar ileri gidebiliriz. butun secenekler cikiyor noktadan sonra. ayni sekilde minus ile e geri gidebiliriz


    }
}
