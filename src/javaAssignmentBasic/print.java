package javaAssignmentBasic;

public class print {

    int age=12;
    String name="madhuri";
    String city="pune";


    public void show() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(city);

    }

    static void main(String[] args) {


        print print=new print();
        print.show();
    }

}
