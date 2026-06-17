package ExceptionStudy;

public class Exception7 {
    static void main(String[] args) {
        String a="test";

        try{
            System.out.println(a.charAt(3));
        }
        finally
        {
            System.out.println("finally block executed ");
        }
        System.out.println("end the program");
    }
}
// if the try block not throws the exception it will executed all try finally and out of finally
