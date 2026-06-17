package variableStudy;



public class C      {


    int a = 30; // it is a global variable
    int b = 10;  // it is a global variable
    static int m = 100;

    static void main(String[] args) {
        C c = new C();
        c.addition();
      C.sub();
    }

    public void addition() {
        int a = 4;   //it  is a local variable
        int b = 20;    //it  is a local variable
        int sum = a + b;  //a=4,b=7 in this a and b variable is used as a local variable
        System.out.println("The addition is " + sum);   //24
        int sum1 = this.a + b; //in this a variable used as a global variable (a=5,b=7)
        System.out.println("The addition is " + sum1);   //50
        int sum2 = a + this.b; //in this b variable used as a global variable (a=4,b=20)
        System.out.println("The addition is " + sum2);   //14
        int sum3 = C.m + b;  // m variable is used as a static global variable
        System.out.println("The addition is " + sum3);   //120
    }

    public static void sub() {

        int a = 70; //it  is a local variable
        int b = 50; //it  is a local variable
        int sub = a - b; // a=70,b=50
        System.out.println("The Subtraction is " + sub);//20
        int sub1 = C.m - b;  //m=100,b=50  m variable is used as a static variable
        System.out.println("The Subtraction is " + sub1);//50
    }

}
