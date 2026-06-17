package thisandSuperKeyStudy;

public class A {
    int a=30;
    int b=40;



    static void main(String[] args) {
        A a =new A();
        a.addition();

    }

    public void addition()
    {
            int a=60;
            int sum1=this.a+10;//here a variable is used as a global variable used of this keyword
            System.out.println(sum1);
    }




}
