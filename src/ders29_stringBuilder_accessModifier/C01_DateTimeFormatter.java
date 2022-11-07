package ders29_stringBuilder_accessModifier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_DateTimeFormatter {

    public static void main(String[] args) {

        LocalDateTime zaman = LocalDateTime.now();

        System.out.println(zaman);         // 2022-11-04T21:06:41.033618500

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/YYYY");

        System.out.println(zaman.format(dtf1));               // 06/11/2022       zaman'i yazdik. zamana format at dedik. dtf1 e gore formatladi. (format atti dateTimeFormat'a gore)

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d:MMM:YY");        // mesela gunu 04 degilde 4 seklinde yazsin istiyorsak dd degil d olarak belirtmemiz gerekiyor
                                                                                 // ayida 11 seklinde degilde, ayin ilk 3 harfini yazsin istiyorsak MM dedil MMM seklinde yazmamiz gerekiyor
        System.out.println(zaman.format(dtf2));                                  // yilida son iki hanesini yazmamiz gerekiyorsa YY seklinde yazmaliyiz. kisaltma mantigi bu aslinda.
              //  6:Nov:22                                                       // kisaltmalarin aciklamalari pdf notlarda var.

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("d.MMMM.YYYY EEEE");

        System.out.println(zaman.format(dtf3));       // 6.November.2022 Sunday  // zamani formatla. Neye gore? dtf3'e gore formatla

        DateTimeFormatter dtf4 =  DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(zaman.format(dtf4));       // 10:17 AM              // (zaman.format(dtf4)   zamanimi dtf4'e gore formatla


    }
}
