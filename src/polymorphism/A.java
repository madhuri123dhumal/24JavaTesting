package polymorphism;

  public class A {


    static void main(String[] args) {

        A a=new A();
        a.addition(10);
        a.addition(100,200);
        a.addition("demo",300);

        addition(100,"madhuri");
        addition("test11","test3");
        main(80);
        main();


    }
    public void addition(int a){
        int sum=a+10;
        System.out.println("the additiion is" +sum);

    }







      void addition(String d,int i){

        System.out.println("final additioo in A class");
    }

    public void addition(int a,int b){
        int sum=a+b;
        System.out.println("the additiion is" +sum);
    }

  //  public void addition(String h,int b){
      //  System.out.println("the string is " + h +  "the number is" +b);
   // }


    public static void addition(int m,String s){
        System.out.println("the string is " + s + "the number is" +m);
    }

    public static void addition(String o,String l){
        System.out.println("the string is " + o + "the number is" +l);
    }

    private  void addition(String city){// private method overloaded but not overriden
        System.out.println("the addition is private");

    }



    public static void main(){
        System.out.println("main method in A class");
    }

    public static void main(int a){
        System.out.println("main method in A class single parameter ");
    }

    // main method can be overloaded but different agrument

}
