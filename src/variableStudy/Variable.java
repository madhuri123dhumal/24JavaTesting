package variableStudy;

public class Variable {
    int a=30;  //when you declare a variable in the class it is global variable
    int b=40; //global variable

    static void main(String[] args) {
    Variable variable=new Variable();
    variable.add();
    variable.show();
    }

    public void add()
    {
        int a=10; //local variable
        int b=20; //local variable

        int sum=a+b;
        System.out.println("My addition is "+sum);  //a=10,b=20 add =30

        int sum1=this.a+b; //here used a as a global variable a=30,b=20 add 50
        System.out.println("My addition is "+sum1);

        int sum2=a+this.b; //here b is used as a global variable a=10,b=40 add 50
        System.out.println("My addition is "+sum2);

    }
    public void show()
    {
        int c=50;
        int d=30;

        int sub=c-d; // here used local vaiable c 50 d=30 sub 20
        System.out.println("my subtraction is "+sub);

        int sub1=c-this.a; //here used global variable a  c=50,a=30 sub 20
        System.out.println("My Subtraction is "+sub1);

        int sub2=b-c; //here b used global variable b=40 c=50 sub -10
        System.out.println("My Subtraction is "+sub2);

    }














}
