package methodStudy;

public class NonStaticMethod1 {

    static void main(String[] args) {
      //call the static method from same class
        test2();
        //call the static method from another class
        NonStaticMethod2.test4();
        //call the non static regular method from same class need create object

        NonStaticMethod1 nonStaticMethod1=new NonStaticMethod1();
        nonStaticMethod1.test1();

        //call the non static regular method from another class
        NonStaticMethod2 nonStaticMethod2=new NonStaticMethod2();
        nonStaticMethod2.test3();

    }

    public void test1()
    {
        System.out.println("This is non static method from same class test1 ");

    }
    public static void test2()
    {
        System.out.println("This is static method called from same class test2 ");

    }


}
