package casting;

public class CastingStudy {

    static void main(String[] args) {


        byte a = 10;  //1 byte
        System.out.println(a);

        //implicit Casting
        //lower to higher
        //memory>>increase>>widening casting
        //no data loss

        int b = a; //4 byte
        System.out.println(b);  //memeory losss


        double c = a;
        System.out.println(c);

        System.out.println("=====================================");

        //explicit highet to lower
        //  memory >>decrease>>narrowing castimg
        //possible data loss

        double m=45.458;
        System.out.println(m);

        short n=(short)m;
        System.out.println(n);  //data loss



    }
}
