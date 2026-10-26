package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C06_Swap {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci tamsayiyi giriniz...");
        int sayi1 = scanner.nextInt();

        System.out.println("Ikinci tamsayiyi giriniz...");
        int sayi2 = scanner.nextInt();

        int temp = 0;
        temp = sayi2;
        sayi2 = sayi1;
        sayi1 = temp;

        System.out.println("sayi1'in yeni degeri : " + sayi1); // 40
        System.out.println("sayi2'nin yeni degeri : " + sayi2); // 25


    }
}