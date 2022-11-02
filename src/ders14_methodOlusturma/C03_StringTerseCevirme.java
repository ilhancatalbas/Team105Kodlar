package ders14_methodOlusturma;

public class C03_StringTerseCevirme {

    public static void main(String[] args) {

        // parametre olarak bir String kabul edip
        // String'in terse cevrilmis halini donduren bir method olusturun

        String input = "Java kod yazdikca ogrenilir";

        System.out.println(stringiTerseCevir(input));

    }

    public static String stringiTerseCevir (String input){

        String tersStr="";

        for (int i = input.length()-1; i >=0 ; i--) {

            tersStr = tersStr+input.charAt(i);
        }

        return tersStr;
        
    }

}
