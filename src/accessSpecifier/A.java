package accessSpecifier;

public class A {

    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;


    private void test1() //private
    {
        System.out.println("private test1 A class");
    }

    void test2()//default
    {
        System.out.println("default test2 A class");
    }

    protected void test3() //protected
    {
        System.out.println("protected test3 A class");
    }

    public void test4() //public
    {
        System.out.println("public test4 A class");

    }

    static void main(String[] args) {

        A a = new A();
        a.test1();
        a.test2();
        a.test3();
        a.test4();
        int sum1 = a.a + 10;
        int sum2 = a.b + 10;
        int sum3 = a.c + 10;
        int sum4 = a.d + 10;
        System.out.println(sum1);//private
        System.out.println(sum2);//default
        System.out.println(sum3); //protected
        System.out.println(sum4); //public




    }


}
