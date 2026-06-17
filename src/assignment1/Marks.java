package assignment1;

public class Marks {

    int marks1;
    int marks2;


    public void setmarks() {
        marks1 = 50;
        marks2 =100;
    }
    public  void getmarks()
        {
          System.out.println(marks1);
          System.out.println(marks2);

        }

    static void main(String[] args) {
        Marks marks=new Marks();
        marks.setmarks();
        marks.getmarks();
    }
    }

