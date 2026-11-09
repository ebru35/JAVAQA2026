package K04_dataCasting;

import java.util.Scanner;

public class C04_DataCasting {

    public static void main(String[] args) {





        Scanner scanner = new Scanner(System.in);
        System.out.println("Iki adet pozitif tamsayi giriniz...");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println(  "sayilarin birbirine bolumu : "  + (sayi1/sayi2)  );




        System.out.println(  "sonucu double'a cast edersek : "  + (double)(sayi1/sayi2)  );

        System.out.println(  "sayilardan birini double'a cast edersek  : "  + (   sayi1/ (double) sayi2    )  );




        System.out.println(  243 / 10 );

        System.out.println(5234 / 10 );

        System.out.println( 523 / 10 ) ;


    }
}