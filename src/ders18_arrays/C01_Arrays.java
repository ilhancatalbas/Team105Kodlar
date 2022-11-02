package ders18_arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        int[] arr1 = {2, 4, 6, 8, 10};

        // array'in bir elementine ulasmak ve update etmek istersek

        System.out.println(arr1[2]);         // 6 gelir.    buradada saymaya index 0'dan baslanir

        arr1[3]=20;                          // yap dersek gider 3. indexte 8'i bulur bunu 20 ile degistirir

        System.out.println(arr1[3]);         // 20     yazdirinca sonuc 20 cikar

        System.out.println(arr1.length);     //  5   length dedigi icin index degil. karistirma. 5 karakter var


        // son elemnti yazdirin

        System.out.println(arr1[arr1.length-1]);       // 10


        // array'in tum elementlerini yazdirin

        for (int i = 0; i < arr1.length; i++) {

            System.out.println(arr1[i]+" ");
        }

        //  arr1[5]=35;            // dersek eger; java dediki: 32. satirda sorun var. hatada su; Index 5 out of bounds for length 5

        // arry'in uzunlugu sonradan degistirilemez
        // eger array'de olmayan bir index'e atamak yapmak istersen
        // ArrayIndexOutOfBoundsException   hatasi aliriz
        // bu hata Compile Time Error CTE degil
        // run time error'dur.
        // CTE ile run time error arasindaki fark sudur; sen bunu yazinca sorun yok ama ben hatayi calistirinca hatayi anladim demek.
        // run time yani calismadan hatayi anlamadi




    }
}
