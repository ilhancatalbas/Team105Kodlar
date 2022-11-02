package ders11_stringManipulations;

public class C04_replaceAll {

    public static void main(String[] args) {

        //kullanicinin girdigi metinde
        // harf disinda kalan tum karakterleri temizleyen bir kod yazin
        //NOT: space silinmemeli

        // String input = "Bu156gu%n *c7o&k i5yi dina*+25m7ik K1o2d3 y@az%d98i4k";  // diger teks yazdirabilirsin istersen

        String input = "Ja5+va cok 1*guzel";
                                                                                // MANTIK //
        input = input.replaceAll("\\d","");     // once rakamlari sildik bunu yaptik                    // Ja+va cok *guzel
        input = input.replaceAll(" ","5");      // sonra bosluklarin yerine rastgele bir sayi yazdik    // Ja+va5cok5*guzel
        input = input.replaceAll("\\W","");     // buda: harf ve rakam olmayan herseyi silecek          // Java5cok5guzel
        input = input.replaceAll("5"," ");      // sonrada 5 lerin yerine bosluk koyduk.                // Java cok guzel

        System.out.println(input);

        // bu kod dinamiktir



    }

}
