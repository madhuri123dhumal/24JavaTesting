package methodStudy;

public class NonStaticMethod2 {


    public void test3() //this is non static regular method
    {
        System.out.println("This non static method called another class test3");
    }
    public static void test4() //this is static regular method
    {
        System.out.println("This static method called from another class test4");
    }
}
