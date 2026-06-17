package variableStudy;

public class A {


    int  a = 50;   //this is a global variable   non static variable
    static int b = 30;  //this is static global variable  static variable
    static int c=50;

    static void main(String[] args) {
        int a = 15;
        int b = 80;
        A a1 = new A();
        a1.add();
        sub();
        int sum = a1.a + 10;   //in this used global variable
        System.out.println(sum);

        int sum1 = 10 + b;   //in this static variable used
        System.out.println(sum1);
    }

    public void add() {

        int a = 12;
        // int b=100;

        int sum2 = this.a + 15; //used global variable
        System.out.println(sum2);

        int sum3 = 55 + A.b;  //used static variable
        System.out.println(sum3);

        int sum4 = a + b; // used local variable
        System.out.println(sum4);

    }
    public static void sub() {

        int a = 60;  //used local variable
        int b = 100;



        int sub = a + b;
        System.out.println(sub);



        int sub1 = a + A.b;  //used static variable class name .method name
        System.out.println(sub1);    //global variable not used in static method

        int sub2 =a + c;
        System.out.println(sub2);






    }
}
