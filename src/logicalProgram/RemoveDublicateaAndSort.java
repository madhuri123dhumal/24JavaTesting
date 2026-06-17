package logicalProgram;

import java.util.ArrayList;
import java.util.TreeSet;

public class RemoveDublicateaAndSort {
    static void main(String[] args) {

        int marks[]={12, 54, 23, 12, 87, 11, 100, 77, 12, 54};
       int count=0;
        TreeSet<Integer> ts=new TreeSet<>();  //automatic sort
        //we used for each loop

        for( int m:marks)
        {
            ts.add(m);
            count++;
        }
        System.out.println(ts);
        System.out.println("the total no are" +count);


        for(int t:ts)
        {
            System.out.println(t);
        }
//show me highest roll no

        ArrayList<Integer>a1=new ArrayList<>(ts);

     System.out.println(a1);

System.out.println("get highest marks "+a1.get(a1.size()-1));
System.out.println("get second highest marks "+a1.get(a1.size()-2));
System.out.println("get third highest marks "+a1.get(a1.size()-3));


    }





}
