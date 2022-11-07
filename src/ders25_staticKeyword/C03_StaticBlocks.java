package ders25_staticKeyword;

public class C03_StaticBlocks {
                                                        // eger bir class calistirildiginda bir yerlerden bilgi almamiz gerekiyorsa kullaniriz
                                                        // birden fazlaysa ustteki  once calisir. main method arada olsa bile main method dan once calisir

    static {
        System.out.println("2. static blok calisti");
    }

    static {
        System.out.println("1. statik blok calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
    }
}
