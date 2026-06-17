package constructorChainging;

public class Demo {

    static void main(String[] args) {
       // Demo demo=new Demo();

    }

    public Demo()
    { this(3); // single constructor  run
        //System.out.println("DEMO Class without parameter  ");
    }
    public Demo(int a)
    { this("madhuri");
        System.out.println("DEMO Class with  single parameter ");
        System.out.println(a);

    }
    public Demo(String a)
    {
       this("madhuri",23);
        System.out.println("DEMO Class with  single parameter ");
        System.out.println(a);
    }
    public Demo(String a,int b)
    {
        System.out.println("DEMO Class with  single parameter ");
        System.out.println(a);
        System.out.println(b);


    }
}
