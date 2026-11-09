package K04_dataCasting;

public class C06_CharDataTuruMatematikselIslemler {

    public static void main(String[] args) {

        char chr1 = 'a';
        char chr2 = 'b';
        char chr3 = 'c';



        System.out.println( chr1 + chr2 + chr3 );

        System.out.println( 'a' + 'b' + 'c');


        System.out.println( "a" + "b" + "c");




        int sayi1 = 97;
        int sayi2 = 65;

        System.out.println( (char) sayi1 );
        System.out.println( (char) sayi2 );



        char ch5 = 'k';

        System.out.println(

                (char)(ch5 + 1) +", " + (char) (ch5+2) + ", " + (char)(ch5+3)
        );


        char chr6 = 'a';
        char chr7 = 'm';

        System.out.println(  chr6 > 'k');
        System.out.println(  chr7 > 'k');

    }
}