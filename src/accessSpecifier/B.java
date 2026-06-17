package accessSpecifier;

public class B {

    static void main(String[] args) {
        A a=new A();
        //a.test1() here test1 is a private method so it can not access in another class
        a.test2();
        a.test3();
        a.test4();
            //int sum1=1+a.a; //here global a is a private variable so it can not access in another class
            int sum2=1+a.b;
            int sum3=1+a.c;
            int sum4=1+a.d;
            System.out.println(sum2);
            System.out.println(sum3);
            System.out.println(sum4);


    }
}
