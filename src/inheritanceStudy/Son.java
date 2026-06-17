package inheritanceStudy;

public class Son extends Mother{
    int b=30;

     static String name="madhuri";

    static void main(String[] args) {
        height();//static method from same class
        Son son=new Son();
        son.hoobies();//non static method from same class
        System.out.println("===================================");
        son.Nature(); // non satatic call another class
        Mother.weight();

        System.out.println(name);
        System.out.println(bloodgroup);
        System.out.println(son.a);
        System.out.println(son.b);



    }

    public void hoobies()
    {
        System.out.println("child Hobbies");
    }
    public static void height()
    {
        System.out.println("Childs Height");
    }

}
