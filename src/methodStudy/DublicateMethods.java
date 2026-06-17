package methodStudy;

public  class DublicateMethods {

    static void main(String[] args) {

        addition(2, 4);

        DublicateMethods dublicateStudy = new DublicateMethods();
        dublicateStudy.addition(3,"madhuri");
        dublicateStudy.addition("swara",8,8);
        addition("Akshay",5);
    }


    public static void addition(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    public void addition(int a, String name) {
        System.out.println(a);
        System.out.println("my name is "+name );

    }

    public void addition(String name, int a,int b) {
        System.out.println("my name is "+name );
        System.out.println(a);
        System.out.println(b);


    }

    public static void addition(String name, int a) {
        System.out.println("my name is "+name );
        System.out.println(a);
    }
}

//dublicate methods identify first on method name and then parameter and then sequence of parameter
//public static void addition(String name, int a) {}
//public  void addition(String name, int a) {}
 //these two methods are dublicate  because method same name parameter pass same and sequence of parameter is same (String int )