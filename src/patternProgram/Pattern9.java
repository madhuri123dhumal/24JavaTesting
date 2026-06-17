package patternProgram;

public class Pattern9 {

    static void main(String[] args) {
//   * * * *
//    * * *
//     * *
//      *

        int row = 4;
       // int col = 4;
        int space = 0;
        int star = 4;

        //outer for loop for row
        for (int i = 1; i <= row; i++) {
            //inner loop for space

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= star; k++) {
                System.out.print("* ");
            }
            System.out.println();
            space++;
            star--;

        }


    }
}
