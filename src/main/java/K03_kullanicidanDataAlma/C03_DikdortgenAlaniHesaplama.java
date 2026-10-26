package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C03_DikdortgenAlaniHesaplama {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Kenar uzunluklarını girin");

        double kisaKenar= scanner.nextDouble();
        double UzunKenar=scanner.nextDouble();


        System.out.println("Dikdörtgen alani: " +kisaKenar*UzunKenar);



    }



}
