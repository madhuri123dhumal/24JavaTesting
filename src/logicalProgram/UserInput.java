package logicalProgram;

import java.util.Scanner;

public class UserInput {

    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.next();
        System.out.println("enter name is "+name);
        System.out.println("====================");
        System.out.println("please enter your rollno");
        int rollno=scanner.nextInt();
        System.out.println("enter roll no "+rollno);
        System.out.println("====================");

        System.out.println("please enter the marks");
       float marks=scanner.nextFloat();
       System.out.println("enter the marks"+marks);





    }
}
