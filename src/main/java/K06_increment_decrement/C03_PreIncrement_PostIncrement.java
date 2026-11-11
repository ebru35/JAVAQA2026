package K06_increment_decrement;

public class C03_PreIncrement_PostIncrement {

    public static void main(String[] args) {


        int a = 20;



        int b = a;
        a++;

        System.out.println("16.satirda a: " + a + " , b : " + b );




        int c = 20;



        c++;

        int d = c;



        System.out.println("37.satirda c: " + c + " , d : " + d );

        a = 20;


        b = a++;


        System.out.println("45.satirda a: " + a + " , b : " + b );


        c = 20;




        d = ++c;


        System.out.println("57.satirda c: " + c + " , d : " + d );



    }
}