package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodOf {

    public static void main(String[] args) {

        // dogumunuzdan bugune nekadar zaman gecti?

        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(1982,01,27);

        Period gecensure = Period.between(dogumGunu,bugun);

        System.out.println(gecensure);                     //P40Y9M7D

        System.out.println(gecensure.getYears());          // dogumumdan gecen sureyi yil olarak istedik   // 40

    }
}
