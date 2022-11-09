package ders08_ternarySwitch;

public class C06_SwitchCase {

    public static void main(String[] args) {
        
        // kullanicinin girdigi gun numarasinin 
        // gun ismini yazdirin
        
        int gunNo=5;
        
        // Asagidaki normal If Else ile yapim

        /*

        if (gunNo==1){
            System.out.println("Pazartesi");
        } else if (gunNo==2) {
            System.out.println("Sali");
        }else if (gunNo==3) {
            System.out.println("Carsamba");
        }else if (gunNo==4) {
            System.out.println("Persembe");
        }else if (gunNo==5) {
            System.out.println("Cuma");
        }else if (gunNo==6) {
            System.out.println("Cuamrtesi");
        }else if (gunNo==7) {
            System.out.println("Pazar");
        }else {
            System.out.println("Gecersiz gun numarasi");
        }
                                                                */          // switch: anahtar, salter demek. Degistirgec
                                                                            // switch biseyleri degistirecek ama neye gore. paranteze yazdigimiz degiskene gore.  switch (gunNo){  bu body
                                                                         // body'nin icinde case'ler olur. onlarida gun
        //swutch statements'daki default,  else benziyor. bunlar degilse, default olsun gibi
        // kullanicinin yazdigi deger case deki hangi numaraya denk geliyorsa o calisir.
        // ama ortada bi numaraya denk gelirse, ondan sonraki butun numaralar calisir, bu olmasin sadece tek bir case calissin istiyorsak, aralra break koyariz

        //  asagidaki yukaridaki ornegin Switch ile yapi

        switch (gunNo){
            case 1  :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecersiz gun no");


        }
    }
}
