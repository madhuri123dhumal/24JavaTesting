package ExceptionStudy;

public class VotingQualification {
    static void main(String[] args) {
        int age=20;
        if(age<18)
        {
            throw new InvalidAgeException ("your age is not valid for voting");
        }
        else
        {
            System.out.println("your age is valid for voting");
        }




    }
}
