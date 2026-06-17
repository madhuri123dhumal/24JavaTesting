package assignemenTwo;

public class TwentyOne {
     static void main(String[] args) {
         show(5,6);//static method calling

         TwentyOne twentyone=new TwentyOne();
         twentyone.display(20,30);  //non static method calling

    }


    public static void show(int a,int b)
    {
        int c=a+b;
        System.out.println("The addition number "+c);
    }


    public void display(int c,int d)
    {
        int sum=c+d;
        System.out.println("The Sum is "+sum);
    }

}
