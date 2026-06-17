package arrayStudy;

public class ArraySample3 {

    static void main(String[] args) {
        int test[][]=new int[2][2]; //array declaration multidimensional array

        //array initialization
        test[0][0]=10;
        test[0][1]=20;
        test[1][0]=30;
        test[1][1]=40;

        //array usage
        System.out.println(test[0][0]);
        System.out.println(test.length);

        //row using outer for loop
        for(int i=0;i<=test.length-1;i++)
        {
            // for column using inner loop
            for(int j=0;j<=test.length-1;j++)
            {
                System.out.print(test[i][j] +" ");
            }
            System.out.println();
        }








    }
}
