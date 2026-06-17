package arrayStudy;

public class ArraySample4 {

    static void main(String[] args) {
         String subject[][]={{"ab","bc","cd"},{"de","ef","fg"}};

         //out for loop is used for row

        for(int i=0;i<= subject.length-1;i++)
        {

            for(int j=0;j<= subject.length-1;j++)
            {
                System.out.print(subject[i][j]+" ");
            }
            System.out.println();
        }
    }
}
