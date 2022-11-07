package ders29_stringBuilder_accessModifier;

public class C05_AccessModifier {

    public static void main(String[] args) {

        C04_AccessModifiers obj = new C04_AccessModifiers();

        obj.isim="Tugay";                     // bir onceki class'da ismin Access Modifier defaultdu. Dolayisiyla deger atayabiliriz

        System.out.println(obj.isim);        // Tugay


        C04_AccessModifiers obj2 = new C04_AccessModifiers();

        System.out.println(obj2.isim);        // deger atanmadigi icin, default atanan degerini yazdirir.  C04_AccessModifiers bak orda gorursun default degeri


        // obj.sayi=20                        // private variable'lara baska class'dan ulasilamaz.


        /* ozetle: private'i icinde bulundugu class'dan kullanabiliriz
                   default olanlari icinde bulundugu class'dan kullanabiliriz,   icinde bulundugu package'dan kullanabiliriz
                   Protected'da child class devreye giriyor. Bazi class'lari baska class'larin child'i yapabiliriz.
                   public olanlari kendi class'indan, herhangi bir package'dan kullanilabilir. (Herkes kullanabilir)



         */



    }
}
