package K06_increment_decrement;

public class C04_PreIncrement_PostIncrement {

    public static void main(String[] args) {


        int a = 20;
        int b = 40;

        a++;
        b--;

        System.out.println("36.satirda a : " + a + ", b : " + b);

        ++a;
        --b;

        System.out.println("41.satirda a : " + a + ", b : " + b);


        System.out.println( a++ );

        System.out.println("46.satirda a : " + a + ", b : " + b);


        System.out.println(  ++a );

        System.out.println("51.satirda a : " + a + ", b : " + b);


        System.out.println(b--);

        System.out.println("56.satirda a : " + a + ", b : " + b); // a : 24, b : 37





        System.out.println(--b);// 36

        System.out.println("64.satirda a : " + a + ", b : " + b);


        a = b++;

        System.out.println("69.satirda a : " + a + ", b : " + b);



        a= ++b;

        System.out.println("75.satirda a : " + a + ", b : " + b);




        b = a++ / 2 ;

        System.out.println("82.satirda a : " + a + ", b : " + b); // a : 39, b : 19





        b = ++a / 2 ;

        System.out.println("90.satirda a : " + a + ", b : " + b); // a : 40, b : 20



    }
}