package thisandSuperKeyStudy;

public class B extends A{

    int x =100; //global variable of B
    //a=30; is a gloabale varaibale of A class

    static void main(String[] args) {
        B b=new B();
        b.show();
        b.addition();

    }


    public  void show(){
            int x=150;
         int sum2=this.x+20;
        System.out.println(sum2);
        int sum3=x+50;  // here x varaiable is used local variable
        System.out.println(sum3);
        int sum4=super.a+100; // super keyword is for used variable of a super class
        System.out.println(sum4);



    }

    public void addition()
    {
        int a=60;
        int sum1=super.a+10;//here a variable is used as a global variable used of this keyword 110
        System.out.println(sum1);
    }
}