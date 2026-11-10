package K05_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C02_Modulus {

    public static void main(String[] args) {

        System.out.println( 25 / 10 );
        System.out.println( 15 / 4 );


        System.out.println(  35 % 10  );

        System.out.println( 15 % 4 );

        int sayi = 45;

        System.out.println(  sayi % 2 );


        System.out.println( sayi % 5 );

        System.out.println( sayi % 3 );




        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();
        System.out.println( girilenSayi % 10);

        System.out.println(  259 / 10 );







    }
}