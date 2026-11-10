package K05_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();
        int birlerBasamgindakiRakam = 0;
        int rakamlarToplami = 0;


        birlerBasamgindakiRakam = sayi % 10;

        rakamlarToplami = rakamlarToplami + birlerBasamgindakiRakam;

        sayi = sayi / 10;


        birlerBasamgindakiRakam = sayi % 10;


        rakamlarToplami = rakamlarToplami + birlerBasamgindakiRakam;

        sayi = sayi / 10;
        rakamlarToplami = rakamlarToplami + sayi;


        System.out.println("Girilen sayinin rakamlar toplami : " + rakamlarToplami);












    }
}