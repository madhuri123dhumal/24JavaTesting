package logicalProgram;

public class ReverseString {

    static void main(String[] args) {
        String s="Madhuri";
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
             char t=s.charAt(i);
             rev=rev+t;
        }

        System.out.println(rev);
    }

}
