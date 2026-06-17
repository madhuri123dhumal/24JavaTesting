package interfaceStudy;

public class Demo1 extends Demo{

    static void main(String[] args) {


        Demo demo1=new Demo();
        demo1.test();
        demo1.test2();

    }
    public void test(){

        System.out.println("tets method from the Demo class");
    }

//    final void test2()  method cannot overriden but inherited
//    {
//       System.out.println("tets 2 method is final DEmo class");
//    }



}
