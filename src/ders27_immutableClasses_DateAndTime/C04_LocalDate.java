package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;

public class C04_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih);          // bugunku tarihi atar bize.

        System.out.println(tarih.minusDays(100));
        System.out.println(tarih.minusWeeks(5).minusDays(3));

        System.out.println(tarih.plusMonths(5).plusWeeks(2).plusDays(3));

        System.out.println(tarih.getMonthValue());     // 11
        System.out.println(tarih.getMonth());          // NOVEMBER
        System.out.println(tarih.getDayOfMonth());
        System.out.println(tarih.getDayOfWeek());                       // tarih bilgilerini olusturabilirsin. ehliyeti nezaman almis. ranedvuya ne zaman gelmis vs
        System.out.println(tarih.getDayOfYear());                       // yilin kacinci gunu

        System.out.println(tarih.isLeapYear());                         // tarih bugun leap year mi, artik yilmi. false verdi artik yil degilmis
                                                                        // bugunku tarih olsun ama ay ekim degilde farkli bir ay yil olsun gibi yerlerde
        System.out.println(tarih.withYear(2000).isLeapYear());          // 2000 yili artik yilmi

        System.out.println(tarih.withYear(2020).withMonth(11).withDayOfMonth(13));   // 2020-11-13

        System.out.println(tarih.lengthOfYear());   // 365

        System.out.println(tarih.withYear(2020).lengthOfYear());        // 366   artik var

        System.out.println(tarih.withYear(1982).withMonth(1).withDayOfMonth(27).getDayOfWeek());   // hangi gun dogdugumuz gosterir

        LocalDate date1 = LocalDate.of(2011,11,11);
        LocalDate date2 = LocalDate.of(2010,10,10);

        System.out.println(date2.isBefore(date1));                       //    date2, date1'den oncemi   /true
        System.out.println(date2.isAfter(date1));                        //     sonra mi false

        System.out.println(tarih.equals(date1));                         // esitmi    false




    }
}
