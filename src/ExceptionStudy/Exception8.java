package ExceptionStudy;

public class Exception8 {
    static void main(String[] args) {
        String a="pune";
        try {
            System.out.println(a.charAt(9));
        }

        catch(NullPointerException e)
        {
            System.out.println("please check object can not be null");
        } catch (ArithmeticException e) {
            System.out.println("can not be divided by zero");
        }
        catch (Exception e)
        {
            System.out.println("something went wrong");
        }


        finally {
            System.out.println("finally block executed");
        }


    }
}
