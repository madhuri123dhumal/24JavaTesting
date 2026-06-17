package methodStudy;
public class StudentInfo {

    static void main(String[] args) {
        studentData();
        studentData("madhuri", 01, 'A', 78.34f, true);
    }

    //name(String),int(roll_no),div(char),marks(float),Result(boolean)
    public static void studentData() // Method Without Parameter
    {
        String name = "Swara";
        int roll_no = 13;
        char div = 'B';
        float marks = 87.67f;
        boolean Result = true;
        System.out.println("============");
        System.out.println("My name is " + name);
        System.out.println("My roll no is " + roll_no);
        System.out.println("My div  is " + div);
        System.out.println("My marks are " + marks);
        System.out.println("My Result  is " + Result);
        System.out.println("============");

    }
    public static void studentData(String name, int roll_no, char div, float marks, boolean Result) //method with parameter
    {
        System.out.println("============");
        System.out.println("My name is " + name);
        System.out.println("My roll no is " + roll_no);
        System.out.println("My div  is " + div);
        System.out.println("My marks are " + marks);
        System.out.println("my result is " + Result);
        System.out.println("============");

    }


}

