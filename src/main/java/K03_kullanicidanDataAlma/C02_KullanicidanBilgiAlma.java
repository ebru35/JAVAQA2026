package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C02_KullanicidanBilgiAlma {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz");
        String isim= scanner.next();

        System.out.println("lütfen soyisminizi giriniz");
       String soyisim= scanner.next();

        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scanner.nextInt();

        System.out.println("Kaydiniz başarıyla tamamnlanmıştır");
    }
}
