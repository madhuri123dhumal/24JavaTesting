package abstractStudy;

public class C extends B {

    static void main(String[] args) {
         C c=new C();
         c.show3();

    }

    @Override
    public void show3() {
        System.out.println("Show 3method is implemented by classs c");

    }
}
