package ders28_varargs_StringBuilder;

public class C05_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java candir.");

        System.out.println(sb.capacity());    // 16 +12 =28
        System.out.println(sb.length());      // 12

        System.out.println(sb.reverse());                      // reverse method'u ters cevirir  :)
        sb.reverse();                                          // Java candir       alttakiler ters olmasi diye tekrar terse cevirdik

        sb.replace(0,4,"Yaaaaaa");             // baslangici ver, bitisi ver, bunun yerine gelecegi ver
        System.out.println(sb);                               // Java'yi sildi. (0 - 4 arasi). Yaaaaaa koydu.    Yaaaaaa candir.    oldu


        // sb.insert(18,"bu bir yalandir");          // calismadi bu kisim eksik
        // System.out.println(sb);

        // String str = "Java cok guzel";            // calismadi bu kisim eksik

        // sb.insert(21,9,14);                      // calismadi bu kisim eksik

        // System.out.println(sb);

    }
}
