package K05_wrapperClass_MatematikselIslemler;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java Candir";
        int sayi = 34;

        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(2));


        int sayi1 = 5;
        Integer sayi2 = sayi1;

        Integer sayi3 = 3456;
        int sayi4 = sayi3;





        int sayi5 = 25;
        short sayi6 = 45;
        byte sayi7 = 23;

        int sayi8 = sayi6;
        sayi6 = sayi7 ;


        Short sayi9 = 45;



        String fiyat1 = "23";
        String fiyat2 = "45";

        System.out.println( fiyat1 + fiyat2 );



        int fiy1 = Integer.parseInt(fiyat1);
        int fiy2 = Integer.valueOf(fiyat2);

        System.out.println("Fiyatlarin toplami : " + ( fiy1 + fiy2));


        fiyat1 = "23.45";
        fiyat2 = "34.43";

        double f1 = Double.parseDouble(fiyat1);
        double f2 = Double.valueOf(fiyat2);

        System.out.println("Fiyatlarin toplami : " + ( f1 + f2));


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);


        char harf = 's';


        System.out.println(Character.isUpperCase(harf));

        System.out.println(Character.isLowerCase(harf));

        System.out.println(Character.isDigit(harf));
        System.out.println(Character.isLetter(harf));
        System.out.println(Character.isAlphabetic(harf));


        System.out.println(Character.toUpperCase(harf));


    }
}