package ExceptionStudy;

public class Exception6 {

    static void main(String[] args) {

        String a=null;
        try{
            System.out.println(a.length());
        }
        finally {
            System.out.println("finally block executed");
        }
        System.out.println("end of code ");
    }
}
// try will thorow the exception   only finally block executed then display the what exception is thrown
// but try willl not throw the exceptiion all code executedd  finally out of filla