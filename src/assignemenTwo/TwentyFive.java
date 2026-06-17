package assignemenTwo;

public class TwentyFive {

    static void main(String[] args) {
        A();

    }

    public static void  A()
    {
        B();
        System.out.println("Method one");
    }
    public static void B()
    {
        C();
        System.out.println("Method Two");

    }
    public static void C()
    {

        System.out.println("Method Three");

    }


}
