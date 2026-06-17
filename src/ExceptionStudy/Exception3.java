package ExceptionStudy;

public class Exception3 {
    static void main(String[] args) {

        System.out.println("hello");
        //String a = null;
        String b = "test";
        try {
           // System.out.println(a.length());
            System.out.println(b.charAt(8));
        } catch (NullPointerException e) {

            System.out.println("object can not null");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("check inde");
        }

    }


}

