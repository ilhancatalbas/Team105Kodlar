package ders28_varargs_StringBuilder;

public class C04_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder(7);

        // Bu kod yazildiginda java 7 karakter alabilecek bir String Builder olusturur

        System.out.println(sb.capacity());             // olusturdugumuz sb nin kapasitesi kac?    // 7
        System.out.println(sb.length());               // hicbir deger atamadigimiz icin 0 verir   // 0

        sb.append("Java");                             // 7'yi gecmeyecek bir deger yazdik. java'dan sonra 3 bosluk yok. kapasitesi 7 oldugu icin bosluk  beklemek yanlis.
                                                       // 7 hafizada ayirdigi kapasite
        System.out.println(sb);
        System.out.println(sb.capacity());    // 7
        System.out.println(sb.length());      // 4



        sb.append(" guzeldir.");
        System.out.println(sb);               // java guzeldir
        System.out.println(sb.capacity());    // 7*2+2 = 16
        System.out.println(sb.length());      // 14



        sb.append(" ona ne suphe");
        System.out.println(sb);               // java guzeldir. ona ne suphe
        System.out.println(sb.capacity());    // 16*2+2 = 34
        System.out.println(sb.length());      // 27

        // kapasite ve lenght'i esitlemek istersek, asagidakini kullaniyoruz

        sb.trimToSize();
        System.out.println(sb.capacity());    // 27
        System.out.println(sb.length());      // 27


    }
}
