package ExceptionStudy;

public class Exception4 {
    static void main(String[] args) {

        String a="test";
        try{

            System.out.println(a.charAt(11));
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }



    }
}
