package logicalProgram;

public class CountNoOfWhiteSpace {

    static void main(String[] args) {
         String s=" Tes ting  ";
         int counter=0;
         for(int i=0;i<=s.length()-1;i++)
        {
           char temp=s.charAt(i);

           if(temp==' ')
           {
               counter++;
           }
        }
        System.out.println("number of white spaces are "+counter);

    }
}
