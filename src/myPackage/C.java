package myPackage;

import accessSpecifier.A;

public class C extends A {

    static void main(String[] args) {

        A a = new A();
        a.test4(); // test 4 method allowed beacause this is public method

        C c = new C();
        c.test3();  // test 3 is protest that why we are craeted sub clas
        //and inherit the property c
         int sum3=1+c.c; // protected variable
        int sum4 = 1 + a.d; //public variable
      //  System.out.println(sum3);
        System.out.println(sum4);


    }
}
