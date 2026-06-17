package patternProgram;

public class Pattern2 {

    static void main(String[] args) {
        //*
        //**
        //***
        //****
        //*****


        int row=5;
        int col=5;
        int star=1;

        //outer loop for row
        for(int i=1;i<=row;i++) {
            //inner loop for col
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            System.out.println();
            star++;
        }
    }
}
