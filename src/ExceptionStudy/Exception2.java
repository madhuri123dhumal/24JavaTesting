package ExceptionStudy;

public class Exception2 {

    static void main(String[] args) {

        System.out.println("hi");
        try {
            System.out.println(10 / 2);
        } catch (ArithmeticException e) {
            System.out.println("Can not divided by zero");

        }
        System.out.println("Hello");
    }
}
