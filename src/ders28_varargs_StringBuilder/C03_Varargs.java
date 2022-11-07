package ders28_varargs_StringBuilder;

public class C03_Varargs {

    public static void main(String[] args) {

        method1(3,4,5,6,7,8);                     // once asagida method olusturduk. sonra burada methodu yazinca a, b, c yi ayirdi geriye kalanlari varargs a eleman olarak koydu


    }


     public static void method1 (int a, int b, int c, int... sayilar){

     }

    //  public static void method1(int... sayilar, int a){             // bunu yapinca itiraz etti. int sayilar aslinda hepsini alir. sonuncuyu a silsem sorun olmaz. String yazsamda hata verir
                                                                       // hataya yaklasinca diyorki varargs parametresi listenin  sonunda olmali diyor

    // method'da parametre olarak varargs varsa, son parametre olmasi ZORUNLUDUR
    // bu durumda bir method'da 2 varargs parametre OLMAZ

}



