package methodStudy;

public class MethodReuse {
    static void main(String[] args) {

        MethodReuse methodReuse=new MethodReuse();
        methodReuse.addtion();
        methodReuse.addition(5,5);
        methodReuse.addition(5);
    }


    public void addtion() //method without parameter //zero parameter method
    {
        int a=7;
        int b=5;
        int sum = a+b;
        System.out.println("The Sum is "+sum);
    }

    public void addition(int a,int b)       //Method with parameter //Two parameter method
    {
     int sum=a+b;
     System.out.println("The sum is "+sum);
    }

    public void addition(int a) //method with parameter //single parameter method
    {
        int sum=100+a;
        System.out.println("The sum is "+sum);
     }




}
