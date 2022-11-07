package ders28_varargs_StringBuilder;

public class C06_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Guzeldir");

        sb.deleteCharAt(0);              // bu indexteki char'i silecek

        sb.delete(3,5);                   // baslangic ve bitis indexini verince , o arayi silecek

        System.out.println(sb.indexOf("a", 2));
    }
}
