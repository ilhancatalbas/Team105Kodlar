package ders27_immutableClasses_DateAndTime;

import java.time.LocalTime;

public class C05_LocalTime {

    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();

        System.out.println(saat);              //17:54:30.568679100       sondaki 10 rakam nano saniye

        LocalTime saat2= LocalTime.of(19,10,20);

        System.out.println(saat.compareTo(saat2));              // saati karsilastiriyoruz  compare=karsilastirma

        System.out.println(saat2.withNano(45565));   // 19:10:20.000045565    sondaki nano saniye olarak ekledi


    }
}
