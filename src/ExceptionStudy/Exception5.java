package ExceptionStudy;

public class Exception5 {
    static void main(String[] args) {

        String a = null;
        try {
            System.out.println(a.length());
        }
        catch (ArithmeticException e) {
            System.out.println("divided by zero not possible");
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("plase check index");
        }
        catch (NullPointerException e) {
            System.out.println("please check object should not be null");
        }

        catch (Exception e) {
            System.out.println("something went wrong");
        }
        System.out.println("hello program over");
    }
}
