package methodStudy;

public class MathOperation1 {

    static void main(String[] args) {

        //called non static method from same class
        MathOperation1 mathOperation1=new MathOperation1();
        mathOperation1.add();
        //called non static method from another class
        MathOperation2 mathOperation2=new MathOperation2();
        mathOperation2.mul();

        //called static method from same class
        sub();

        //called static method from another class
        MathOperation2.div();

    }

    public void add()
    {
        int a=20;
        int b=15;
        int sum=a+b;
        System.out.println("The Sum is "+sum);
    }

    public static  void sub()
    {
        int x=30;
        int y=15;
        int sub=x-y;
        System.out.println("The subtraction  is "+sub);

    }
}
