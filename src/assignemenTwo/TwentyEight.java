package assignemenTwo;

public class TwentyEight {

    static void main(String[] args) {
        studentInfo(12,"madhuri",'A',52,true);

        TwentyEight twentyeight=new TwentyEight();
        twentyeight.studentInfo1(56,"Swara",'B',56,true);

    }

    public static void studentInfo(int rollno,String name,char Div,float percentage,boolean Result)
    {

        System.out.println("The roll no is "+rollno);
        System.out.println("The name  is "+name);
        System.out.println("The Div is "+Div);
        System.out.println("The percentage  is "+ percentage);
        System.out.println("The result  is "+ Result);
        System.out.println("================================================");


    }

    public void studentInfo1(int rollno,String name,char Div,float percentage,boolean Result)
    {


        System.out.println("The roll no is "+rollno);
        System.out.println("The name  is "+name);
        System.out.println("The Div is "+Div);
        System.out.println("The percentage  is "+ percentage);
        System.out.println("The result  is "+ Result);


    }

}
