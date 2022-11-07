package ders18_arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        int[] arr1 = {2, 4, 6, 8, 10};

        // array'in bir elementine ulasmak ve update etmek istersek;

        System.out.println(arr1[2]);         // 6 gelir.    arr1'in 2. index'i demis.  buradada saymaya index 0'dan baslanir

        arr1[3]=20;                          //             arr1'in  3. elementini 20 yap dersek gider 3. indexte 8'i bulur ve siler bunu 20 ile degistirir.

        System.out.println(arr1[3]);         // 20          yazdirinca sonuc 20 cikar. 8 gitti yerine 20 geldi

        System.out.println(arr1.length);     // 5           length dedigi icin index degil. ( karistirma! ) 5 karakter var


        // son elemnti yazdirin

        System.out.println(arr1[arr1.length-1]);                  // 10    Bize son index lazim. Neyin son index'i lazim?  arr1'in son indexi lazim.
                                                                  //       ozaman, Once arr1 dedik. sonra arr1'in index'ini[] icinde istedik. son oldugu icinde -1'i kullandik. Yani son index   arr1.lenght-1

        // array'in tum elementlerini yazdirin

        for (int i = 0; i < arr1.length; i++) {                   // tum elementleri yazdirmak icin bir for dongusu olusturduk.  0'dan baslasin dedik ve arr1.lenght'ine kadar gitsin (yani uzunlugu kadar olsun demek)

            System.out.println(arr1[i]+" ");                      // arr1'in  i'inci index'indeki elementleri yazdiracagiz
        }

        //  arr1[5]=35;                                           // dersek eger; java dediki: 32. satirda sorun var. hatada su; Index 5 out of bounds for length 5

        // arry'in uzunlugu sonradan degistirilemez
        // eger array'de olmayan bir index'e atamak yapmak istersen
        // --   ArrayIndexOutOfBoundsException   --  hatasi aliriz
        // bu hata Compile Time Error CTE degil
        // run time error'dur.
        // CTE ile run time error arasindaki fark sudur; sen bunu yazinca sorun yok ama ben hatayi calistirinca hatayi anladim demek.
        // yani, java 5. index'in var olup olmadigini  ancak calistirilinca anliyor.
        // run time error'dur. yani calismadan hatayi anlamadi




    }
}
