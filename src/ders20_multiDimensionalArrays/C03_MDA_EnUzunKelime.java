package ders20_multiDimensionalArrays;

public class C03_MDA_EnUzunKelime {

    public static void main(String[] args) {

        // verilen multi dimensional String bir array'daki
        // en uzun String'i bulan kod yaziniz

        String[][] arr={{"ilker","Nesrin"}, {"Hasan","Heysem", "Adem", "Yusuf Enes",}};

        String enUzunKelime=arr[0][0];

        for (int i = 0; i <arr.length ; i++) {           // outer array'in elemanlarini kontrol eder

            for (int j = 0; j <arr[i].length ; j++) {    // inner array'in elemanlarini kontrol eder

               // arr[i][j]                              // bu su demek: bunu yazdirirsan tum elementleri yazdirirsin. bunu elden gecirirsen ne yapmak istersen onu yapabilirsin

                if (arr[i][j].length()>enUzunKelime.length()){  // bu gelen uzunlugu en uzun kelimenin uzunlugundan daha buyuk ise (ozaman bu daha uzun kelime demektir)
                    enUzunKelime=arr[i][j];                     // yeni en uzun kelime bu olsun. demektir
                }
            }
        }

        System.out.println("en uzunkelime : " + enUzunKelime);
        

    }
}
