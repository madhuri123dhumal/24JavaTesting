package constructorChainging;

public class Demo1  extends Demo {




    public Demo1(int b)
    {
        System.out.println("User defined with single parameter constructor mmmmm");
    }
    public Demo1(String w)
    { super();
        System.out.println("user defined with single parameter constructor DDDD");

    }

    public Demo1() {
        super(1);
    }

    static void main(String[] args)
    {
        Demo1 demo1=new Demo1();

    }
}
