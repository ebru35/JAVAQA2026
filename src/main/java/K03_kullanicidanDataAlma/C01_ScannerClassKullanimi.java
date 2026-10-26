package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C01_ScannerClassKullanimi {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfrn ondalikli bir sayi giriniz");

        double ondalikliSayi=scanner.nextDouble();

        System.out.println("Lütfen bir tamsayi giriniz");

       int tamsayi= scanner.nextInt();

        System.out.println(ondalikliSayi + tamsayi);

        System.out.println(ondalikliSayi*tamsayi);

    }
}
