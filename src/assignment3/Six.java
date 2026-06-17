package assignment3;
//6. Write a program to display the grade of a student based on marks:
//>=90 → A+, >=75 → A, >=60 → B, >=40 → C, else Fail.
public class Six {

    static void main(String[] args) {

        int marks=73;
        if(marks>=90)
        {
            System.out.println("The Grade is A+");
        }
        else if(marks>=75)
        {
            System.out.println("The Grade is A ");
        }
        else if(marks>=60)
        {
            System.out.println("The Grade B");
        }
        else if(marks>=40)
        {
            System.out.println("The Grade is C");
        }
        else
        {
            System.out.println("Fail");
        }




    }
}
