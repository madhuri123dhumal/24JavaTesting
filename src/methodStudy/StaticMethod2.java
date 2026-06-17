package methodStudy;

public class StaticMethod2 {
    static void main(String[] args) {
        //to call non static method we need to create a object
        // syntax->classname.objectname=newclassname();
        //object called syntax->objectname.methodname();
        StaticMethod2 staticmethod2 = new StaticMethod2();  //carete object
        staticmethod2.test3();  //called object

    }
    public static void test1() {
        System.out.println("The called static method from another class>>>test1");
    }
    public static void test2() {
        System.out.println("The called static method from another class>>>test2");
    }

    public void test3() //this is a non static regular method
    {
        System.out.println("The called non  static method from same class>>>test3");
    }
}
