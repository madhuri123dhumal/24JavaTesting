package arrayStudy;

import java.util.Arrays;

public class ArraySample1 {

    static void main(String[] args) {
        // i want to store batters name

        String batters[]=new String[5];
        batters[0]="Ishan";
        batters[1]="Rohit";
        batters[2]="Shubham";
        batters[3]="Virat";
        batters[4]="Surya";
        //if want to print the single aaray Array Usage
        System.out.println(batters[0]);
        System.out.println(batters[1]);
        System.out.println(batters[2]);
        System.out.println("==============================");
        System.out.println(batters.length); // length print the total capacity
        System.out.println("==============================");

        //int i=0;i<=batters.length-1;i++
        for(int i=0;i<=batters.length-1;i++) {
            System.out.println(batters[i]);
        }
            Arrays.sort(batters);
        System.out.println("==============================");


        for(int i=0;i<=batters.length-1;i++)
        {
            System.out.println(batters[i]);

        }
        System.out.println("==============================");

        for(int i= batters.length-1;i>=0;i--)
        {
            System.out.println(batters[i]);

        }

        //for sorting we used Arrays.sort method

        }



}
