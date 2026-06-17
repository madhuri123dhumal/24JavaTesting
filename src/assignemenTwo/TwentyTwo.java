package assignemenTwo;

public class TwentyTwo { //same as twenty four

    static void main(String[] args) {

        TwentyTwo twentytwo=new TwentyTwo();
        twentytwo.show();  // non static call


    //  display();

    }
    public static void display()
    {
        //show(); // here non static method not call in sttaic method
       System.out.println("The method one ");
    }

    public  void show()
    {
        display();

     System.out.println("The Method Two");
    }



}
