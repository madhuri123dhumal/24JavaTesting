package logicalProgram;

import java.util.Arrays;

public class AnagramStudy {

    static void main(String[] args) {

        String S1="madhuri";
        String S2="avaj";

        char[] ar1=S1.toCharArray();
        char[] ar2=S2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if(Arrays.equals(ar1,ar2))
        {
            System.out.println("String is Anagram");

        }
        else
        {
            System.out.println("String is  not Anagram");

        }

    }
}
