package constructorStudy;

import java.lang.classfile.instruction.NewObjectInstruction;

public class NewConst {

  int a; //global varibale
   int b ;


    static void main(String[] args) {

        NewConst newconst = new NewConst();
        newconst.addition();
      NewConst newconst1=new NewConst(100,200);
      newconst1.addition();

    }


    public void addition()  //this is a non static method and used global  variable in these method
    {
        int sum =a+b;
        System.out.println("My addtion is " + sum);
    }

    public NewConst() //user defined constructoe with zero parameter
    {
          a = 5;
          b = 5;

         System.out.println(a);
        System.out.println(b);

    }

    public NewConst(int x,int y)
    {
        a=x; //100
        b=y; //200
        System.out.println(x);
        System.out.println(y);
    }


}