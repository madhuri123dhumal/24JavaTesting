package assignemenTwo;

public class ThirtyNine {

    static void main(String[] args) {
        ThirtyNine thirtynine=new ThirtyNine();
        thirtynine.addition();
        subtration();
        multiplication();
        thirtynine.subtraction();
    }

    public void addition()
    {
     int a=10;
     int b=30;
     int sum=a+b;
     System.out.println("The Sum is "+sum);
    }

    public static void subtration()
    {
        int a=50;
        int b=30;
        int sub=a-b;
        System.out.println("The Subtraction is "+sub);
    }

    public static void multiplication()
    {
        int a=20;
        int b=3;
        int mul=a*b;
        System.out.println("The Multiplication is "+mul);
    }

    public void subtraction()
    {
     int a=10;
     int b=2;
     int sub=a/b;
     System.out.println("The subtraction is "+sub);
    }


}
