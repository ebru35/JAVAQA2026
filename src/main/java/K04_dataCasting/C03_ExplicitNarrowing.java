package K04_dataCasting;

public class C03_ExplicitNarrowing{

    public static void main(String[] args) {


        double db1 = 34.01;
        double db2 = 45.99;
        float fl1 = 23.7F;

        int sayi = (int)db1 ;
        System.out.println("34.01'in int'a cast edilmis degeri :  " + sayi);

        sayi = (int)db2;

        System.out.println("45.99'un int'a cast edilmis degeri :  " + sayi);

        sayi = (int)fl1;

        System.out.println("23.7'ninn int'a cast edilmis degeri :  " + sayi);



        int sayi1 = 29;

        byte byt1 = (byte)sayi1;
        System.out.println("29'un byte'a cast edilmis degeri : " + byt1);

        short sayi2 = 130;
        byte byt2 = (byte)sayi2;
        System.out.println("130'un byte'a cast edilmis degeri : " + byt2);


        long sayi3 = 140;
        byte byt3 = (byte)sayi3;
        System.out.println("140'in byte'a cast edilmis degeri : " + byt3);


        float sayi4 = 258.5F;
        byte byt4 = (byte)sayi4;
        System.out.println("258.5'in byte'a cast edilmis degeri : " + byt4);



        double sayi5 = 530;
        byte byt5 = (byte)sayi5;
        System.out.println("530'un byte'a cast edilmis degeri : " + byt5);




















    }
}