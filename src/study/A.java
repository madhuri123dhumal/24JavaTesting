package study;

public class A {

    static void main(String[] args) {

        A a= new A();
        A a1=new A(6,6);

    }


    public A() {

        System.out.println("hello ");

    }

    public A(int a,int b)
    {
        System.out.println(a);
        System.out.println(b);
    }
}