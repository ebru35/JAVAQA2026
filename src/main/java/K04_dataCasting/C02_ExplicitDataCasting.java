
package K04_dataCasting;

public class C02_ExplicitDataCasting {

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



        byt = (byte) shrt;
        byt = (byte) sayiInt;
        byt = (byte)lng;
        byt = (byte)flt;
        byt = (byte)dbl;


        sayiInt = byt;
        sayiInt = shrt;
        sayiInt = (int)lng;
        sayiInt = (int)flt;
        sayiInt = (int)dbl;

        dbl = byt;
        dbl = shrt;
        dbl = sayiInt;
        dbl = lng;
        dbl = flt;


    }
}