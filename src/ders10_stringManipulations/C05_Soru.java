package ders10_stringManipulations;

public class C05_Soru {

    public static void main(String[] args) {

        // mail kontrolu yapan bir program hazirlayin
        // 1- mail @ isareti icermiyorsa "gecersiz email" yazdirin
        // 2- @gmail.com icermiyorsa "gmail adresi giriniz" yazsin
        // 3- @gmail.com ile bitmiyorsa "yazim hatasi" yazdirin


        // burda izleyecegimiz yol adimlari tek tek kontrol edecegiz.
        // bunuda if-else ile yapabilir


        String email = "catalbasilhan@gmail.com";

        if (!email.contains("@")){                     // email.contains("@") yaparsan bu iceriyorsa olur. basina ! isarerti koyarsan icermiyorsa olur

            System.out.println("gecersiz email");
        
        } else if (!email.contains("@gmail.com")) {

            System.out.println("gecersiz email");
        
        } else if (!email.endsWith("@gmail.com")) {

            System.out.println("yazim hatasi");
            
        }else {

            System.out.println("kaydiniz alinmistir");
        }


    }
}
