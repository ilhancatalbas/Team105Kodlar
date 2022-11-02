package ders11_stringManipulations;

public class C02_replace {

    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.replace('a','A'));

        System.out.println(str.replace(' ','_'));

        System.out.println(str.replace("candir", "cok guzeldir"));

        System.out.println(str.replace(" ",""));


        // String'deki tum a'lari silin

        System.out.println(str.replace("a",""));   // a'larin yerine hiclik yazdi. Yani a'lari sildi


        // Java yerine Hava, candir yerine cok guzeldir   yazdirin

        System.out.println(str.replace("Java","hava").replace("candir","cok guzeldir"));

        //birden cok degisiklik icin: birinci replace'i yazdiktan sonra parantez sonrasina tekrar.replace yaparak tekrar bir kelime yazabiliriz


        // sadece 1. a'yi A yapin

        System.out.println(str.replaceFirst("a","A"));    // tek tirnakk char kabul etmiyor. Cift tirnak "" string yapicaz

        // .replaceFirst' u kullanarak sadece 1. yi yaptik


        // hiclik yerine _ (alt cizgi yapsak ne olur. hic bisey olmaz. her harf arasina _ koyar.  En bas ve en son dahil

        System.out.println(str.replace("","_"));    //_J_a_v_a_ _c_a_n_d_i_r_     .replaceFirst deseydik sadece en basa koyacakti



    }
}
