package assignment1;

public class Result extends Marks {

    int total;


    public void calculate() {
        total = super.marks1+super.marks2;
    }

    public void getresult() {
        System.out.println(total);
    }


    static void main(String[] args) {
        Result result = new Result();
        result.setmarks();
        result.calculate();
        result.getresult();
    }
}

