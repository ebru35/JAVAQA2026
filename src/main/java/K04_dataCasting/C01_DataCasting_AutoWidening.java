package K04_dataCasting;

public class C01_DataCasting_AutoWidening {

    public static void main(String[] args) {

        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;
        String str = "Java Candir";

        int sayi2 = sayiInt;
        // int data turundeki bir degeri
        // yine int data turundeki bir variable'a atama yaparsak
        // bu data casting olmaz, ATAMA olur

        // bir variable'a baska data turundeki bir deger ATANABILIR MI?





        shrt = byt;


        sayiInt = byt;
        sayiInt = shrt;

        lng = byt;
        lng = shrt;
        lng = sayiInt;

        flt = byt;
        flt = shrt;
        flt = sayiInt;
        flt = lng;


        dbl = byt;
        dbl = shrt;
        dbl = sayiInt;
        dbl = lng;
        dbl = flt;

        // Sayi icin kullandigimiz byte, short, int, long, float ve double variable'lar ise
        // variable'in data turunden daha dar kapsamli olan data turundeki degerleri
        // hic bir islem yapmamiza gerek kalmadan kabul ederler
        // buna Auto Widening (Otomatik genisletme) denir

    }
}