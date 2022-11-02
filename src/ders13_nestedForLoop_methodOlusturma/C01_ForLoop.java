package ders13_nestedForLoop_methodOlusturma;

public class C01_ForLoop {

    public static void main(String[] args) {

        // soru 9 - kullanicadan bir String isteyin ve String'i tersten yazdirin

        String input = "Java ne kadar guzel";

        for (int i = input.length()-1; i >=0 ; i--) {

            System.out.print(input.charAt(i));        // burada sadece tersine cevrilip yazdirma var. kaydetme yok
                                                      // kaydetme C02 ilk soruda yapilacak

        }

    }
}
