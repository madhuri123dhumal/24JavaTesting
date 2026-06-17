package interfaceStudy;
// sample 1 ,sample 2,A
public class A implements Sample2 {

    static void main(String[] args) {
        A a = new A();
        a.test1();
        a.test2();
        a.test3();
        a.test4();
    }


    @Override
    public void test3() {
        System.out.println("test 3 method is sample 2 and completed on A class");


    }

    @Override
    public void test4() {
        System.out.println("test 4 method is sample 2 and completed on A class");

    }

    @Override
    public void test1() {
        System.out.println("test 1 method is sample 1 and completed on A class");

    }

    @Override
    public void test2() {
        System.out.println("test 2 method is sample 1 and completed on A class");


    }


}
