package ders10_stringManipulations;

public class C06_IndexOf {

    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a"));       // 9  verir buda bize ilk a' nin index'ini dondurur. say sifirdan a yi kacta bulucak bak. 9'da buldu

        System.out.println(str.indexOf('c'));       // 8   'c' cha r olarakda bize index verebilir

        System.out.println(str.indexOf("hersey"));  // 15      birden fazla harf karakter varsa yani charsequence varsa o blogun basladigi yeri verir. "hersey" basladigi yer 15

        System.out.println(str.indexOf("e",9));  // 13    aramaya 9'dan basla dedi. 9'dan sonraki "e" verir bize. buda 13



        // 13. index'deki e'den bir sonraki e'nin indec'ini bulalim

        System.out.println(str.indexOf("e",13));    //   dersek 13 uncu index'ten sonra e arar. 13'te e oldugu icin derek 13'u verir

        System.out.println(str.indexOf("e",14));    //   dersek 14 uncu index'ten sonra e arar. 16'u verir



        // cumledeki 2. c'nin index'ini yazdirin. (metni gormeden yaptigimiz dusun)

        // once ilk c yi bulalim sonra 2. c yi bulalim

        int ilkcIndex = str.indexOf("c");   // 8 verdi bize. bir sonrakinide soyle buluruz alttaki sout

        System.out.println(str.indexOf("c",ilkcIndex+1));  // 22      // yani diyoruzki +1 diyerek. ilk 'c' den sonraki 'c' diyoruz


        System.out.println(str.indexOf("ali"));     // index olarak int dondurmesi bekleniyor. ve yok
                                                    // yoksa eger  0 derse sanki cumlenin basi gibi olur. olmayan bisey icin herzaman -1 dondurur
                                                    // -1 gorunce bizde olmadigini anlariz


        // olmayan ne aratirsan arat hata vermez  -1  doner herzaman





    }
}
