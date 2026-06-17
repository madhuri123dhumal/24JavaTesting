package patternProgram;

public class Pattern12 {

    static void main(String[] args) {

//      *
//     ***
//    *****
//   *******
//    *****
//     ***
//      *

        int row = 7;
        int star = 1;
        int space=3;

        //outer for loop for row
        for (int i = 1; i <= row; i++) {

            //inner for loop for star
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for(int k=1;k<=star;k++)
            {
                System.out.print("*");
            }
            System.out.println();

            if (i < 4) {

                star=star+2;
                space--;
            }
            else
            {
                star=star-2;
                space++;

            }


        }


    }
}
