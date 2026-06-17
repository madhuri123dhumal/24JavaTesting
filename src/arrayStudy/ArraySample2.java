package arrayStudy;

import java.util.Arrays;

public class ArraySample2 {

    static void main(String[] args) {

        int rollnum[]={1,101,58,06,85,57};
        //System.out.println(rollnum[2]);
        System.out.println("=====================");
        for(int i=0;i<=rollnum.length-1;i++)
        {
         System.out.println(rollnum[i]);
        }

        Arrays.sort(rollnum);
        System.out.println("=====================");

        for(int i=0;i<=rollnum.length-1;i++)
        {
            System.out.println(rollnum[i]);
        }
        System.out.println("=====================");

        for(int i=rollnum.length-1;i>=0;i--)
        {
            System.out.println(rollnum[i]);

        }




    }
}
