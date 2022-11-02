package ders08_ternarySwitch;

public class C08_SwitchCase {

    public static void main(String[] args) {

        // soru 6 - kullanicidan ay numarasini alip mevsimkeri yazdirin

        int ayNo=11;

        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("Kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilk Bahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaza");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Son Bahar");
                break;
            default:
                System.out.println("Gecersiz Ay Numarasi");



        }
    }
}
