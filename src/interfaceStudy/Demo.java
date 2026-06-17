package interfaceStudy;

public class Demo {


    static void main(String[] args) {


       Demo demo=new Demo();
      demo.test();
        int a=10;
        System.out.println(a);
        a=a+1;   // hereis reinitailization value of
        System.out.println(a);

        final int b=15;
        System.out.println(b);
       // b=b+1;  // if we used a final access specifier we Cannot reassign a value to final variable 'b'
        System.out.println(b);



        }

        public void test(){

        System.out.println("tets method from the Demo class");
        }

        final void test2()
        {
         System.out.println("tets 2 method is final DEmo class");
        }






}
