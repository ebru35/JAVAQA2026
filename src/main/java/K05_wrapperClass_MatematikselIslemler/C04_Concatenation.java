package K05_wrapperClass_MatematikselIslemler;

public class C04_Concatenation {

    public static void main(String[] args) {






        System.out.println( "Ali" + 3 + 4 + 5 + 6);

        System.out.println( "A" + true + 'd' + 45.6 + 34.5F);
        System.out.println( 3 + 'a' + "Ali");


        System.out.println( 3+ " " + 4);

        System.out.println( 3+ "" + 4);





        String str = "a";

        System.out.println( str + 5);



        String s1 = "Java";
        String s2 = " ";
        String s3 = "Candir";
        String s4 = "";

        int a = 3;
        int b = 4;



        System.out.println( a*b + s2 + s1 + s2 + s3    );


        System.out.println(  a + b + s2 + s1   );


        System.out.println(  a + b + s2 + s3   );
        System.out.println(  ""+a + b + s2 + s3   );


        System.out.println( s1 + a + b  );
        System.out.println( s1 + (a + b)  );






    }
}