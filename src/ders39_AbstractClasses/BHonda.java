package ders39_AbstractClasses;

public abstract class BHonda extends Araba{

    // Abstract bir class'i parent edindigimizde
    // iki alternatifimiz olur
    // 1- Parent'imiz olan abstract class'daki abstract method'lari overide etmek
    // 2- proje yapimiz gerektiyorsa bu class'idaabstract yapmak

    public void marka(){
        System.out.println("marka : Honda");
    }

    public abstract void yakit ();

    public abstract void guvenlik();

    public void ozelTeknoloji(){
        System.out.println("Tum Honda arabalar vtec teknolojisi kullanir");
    }
}
