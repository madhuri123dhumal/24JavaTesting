package logicalProgram;

import java.util.Scanner;

public class CountAndRemoveVowels {

    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter String");
        String givenString1=scanner.next();
        String givenString=givenString1.toLowerCase();
        String output="";
            int count=0;
        for(int i=0;i<=givenString.length()-1;i++) {
            char temp = givenString.charAt(i);


            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                count++;
                System.out.println("The Vowel found is " + temp);
                continue;
            }

            output = output + temp;
        }
            System.out.println("String without vowel is "+output);
            System.out.println("the number of vowel in string is "+count);

        }

    }








