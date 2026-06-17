package controlFlowStatement;

public class IfStudy {

    static void main(String[] args) {



   //     //if(condition) true>>body false>>no body
   //     {
    //
   //     }

        //if marks are 35 ypu are pass
        int marks=60;
        if(marks>35)
        {
            System.out.println("You are pass"); //condition true
        }
        if(marks>=35)
        {
            System.out.println("you are pass");//condition true
        }

        if(marks<35)
        {
            System.out.println("you are fail");
        }

        if(marks<=35)
        {
            System.out.println("you are fail ");
        }
        if (marks==35)
        {
            System.out.println("you are fail");
        }
        if(marks!=35)
        {
            System.out.println("you are pass"); //condition true
        }

        //if  your  gender is F then you are a female

        char gender='F';
        if(gender=='F')
        {
             System.out.println("You are female");
        }
        if (gender!='F')
        {
            System.out.println("you are male"); //not print
        }
         //if you are live in city pune


        String city ="pune";

      if(city=="pune")
      {
          System.out.println("my city is pune");


      }


    if(city!="pune")
    {
        System.out.println("my city is pune");// not print condition false
    }






    }
}
