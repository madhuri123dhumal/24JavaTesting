package controlFlowStatement;

public class IfElseStudy {

    static void main(String[] args) {

        // if makrs are greater than 35 i will pass otherwise i will fail

        int marks = 70;
        if (marks >= 35)
        {
            System.out.println("you are pass");
        } else
        {
            System.out.println("ypu are fail");
        }

        //if salary is credited pay will else wait;

        String salary="credited";
        if(salary=="credited")
        {
            System.out.println("Pay bills");
        }
        else
        {
            System.out.println("wait");
        }


        //you sername is start A then your division is A else your division B

        char div='A';
        if(div=='A')
        {
            System.out.println("your division is A");
        }
        else
        {
            System.out.println("your division is B");
        }



    }


}
