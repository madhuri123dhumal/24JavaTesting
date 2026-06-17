package patternProgram;

public class Pattern1 {

    static void main(String[] args) {
        //*****
        //*****
        //*****
// row column and space  count in 1st line
        //star not symetric take start variable
        int rows = 3; //outer loop
        int col = 5; //Inner loop

//outer loop row
        for (int i = 1; i <= rows; i++) {
            //inner loop for col
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
