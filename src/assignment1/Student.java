package assignment1;

public class Student {
    int rollno;
    String name;


    public void SetStudentINfo() {
        rollno = 10;
        name = "madhuri";

    }

    public void getStudentInfo() {
        System.out.println(rollno);
        System.out.println(name);
    }


    static void main(String[] args) {
        Student student = new Student();
        student.SetStudentINfo();
        student.getStudentInfo();


    }
}