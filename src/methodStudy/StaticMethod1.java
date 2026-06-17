package methodStudy;

public class StaticMethod1 {

    static void main(String[] args) {
        //call Static method to same class
        //call with method name

        a();
        b();

        //call static method from nother class
      //  called static method from another class
        //  Syntax->calssname.methodname

        StaticMethod2.test1();
        StaticMethod2.test2();
    }

    public static void a() {
        System.out.println("The called static method a for same class>>>>a");

    }

    public static void b() //method declaration
    {
        System.out.println("\"The called static method a for same class>>>>b"); //
    }

}
