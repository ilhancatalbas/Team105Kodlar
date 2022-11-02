package ders13_nestedForLoop_methodOlusturma;

public class C02_StringTersineCevirme {

    public static void main(String[] args) {

        // Soru 10 - Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String input = "java her gecen gun guzellesiyor";
        String tersInput = "";

        for (int i = input.length()-1; i >=0 ; i--) {

            tersInput += input.substring(i,i+1);
            
        }
                                                             // BURASI ONEMLI
        System.out.println("Ters hali : " + tersInput);      // biz isteneni yaptik ve tersInput denilen variable'a kaydettik



    }
}
