package assignment3;
//4. Write a program to check whether a given character is a vowel or consonant.

public class Four {
    static void main(String[] args) {


        char ch = 'z';
        char lower = Character.toLowerCase(ch);
        System.out.println(lower);

        if(lower=='a'||lower=='e'||lower=='i'||lower=='o'||lower=='u')
        {
            System.out.println("The character are Vowel");
        }

        else
        {
            System.out.println("The Character are consonant ");
        }
    }
}
