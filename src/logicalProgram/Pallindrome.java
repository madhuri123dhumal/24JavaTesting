package logicalProgram;

public class Pallindrome {


    static void main(String[] args) {
        //mom dad radar

            String s="rADAR";
            String rev="";

            for(int i=s.length()-1;i>=0;i--)
            {
                 char temp=s.charAt(i);
                 rev=rev+temp;
            }
            System.out.println("Given String is "+s);
            System.out.println("The Reverse String is "+rev);

            if(s.equals(rev))
            {
                System.out.println("given String is pallindrome"+s);
            }
            else
            {
                System.out.println("given String is not  pallindrome"+s);

            }

    }
}
