package abstractStudy;

public abstract class B extends A {


    static void main(String[] args) {
     // B b=new B();
     //  b.show();
      // b.show1();
      // b.show2();
    }

    @Override
    public void show2() {

        System.out.println("Show 2 method is implementd in B class");
    }
    public abstract void show3();
}
