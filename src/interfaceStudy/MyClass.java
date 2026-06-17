package interfaceStudy;

public class MyClass implements MyInterface{
    @Override
    public void test() {
        System.out.println("The incompleted method complete in implementation class");


    }

    @Override
    public void test1() {
        System.out.println("the incompleted method completed in implementation class");
    }



    static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.test();
        myClass.test1();

    }
}
