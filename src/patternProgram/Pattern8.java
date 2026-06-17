package patternProgram;

public class Pattern8 {
    static void main(String[] args) {

//        *
//       * *
//      * * *
//     * * * *

        int row = 4;
        int col = 4;
        int space =3;
        int star = 1;

        //outer loop for row
        for (int i = 1; i <= row; i++) {
            //inner loop for space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("* ");
            }
            System.out.println();
            star++;
            space--;


        }


    }
}
