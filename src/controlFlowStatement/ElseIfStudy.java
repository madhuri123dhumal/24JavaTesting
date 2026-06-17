package controlFlowStatement;

public class ElseIfStudy {

    static void main(String[] args) {


        // if age less than 5 free ticket
        //else if age less than 18 child ticket
        //else if age is less than 60 adult ticket
        //else senior citizen discount

        int age = 23;
        if (age <= 5) {
            System.out.println("Free Ticket");
        } else if (age <= 18) {
            System.out.println("child ticket");

        }
        else if (age <= 60)
        {
            System.out.println("Adult ticket");
        }
    else
        {
            System.out.println("Senior citizen discount");
        }







    }



}
