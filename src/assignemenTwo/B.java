package assignemenTwo;

public class B {

    static void main(String[] args) {

        A a=new A();
        a.method2(); // non sttaic method call by another class
        A.method1();// static method call by another class

        B b=new B();

        b.method4();// non static method call by same class
        method3();// static method call by same class
    }


    public static void method3()
    {
        System.out.println("The method 3");
    }
    public void method4()
    {
        System.out.println("The method 4");

    }
}
