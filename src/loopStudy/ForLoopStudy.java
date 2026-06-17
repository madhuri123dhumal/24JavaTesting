package loopStudy;

public class ForLoopStudy {


    static void main() {

        // i want to print 5 times good morning

        // start =1, incremnet  =1 condition <=5

        //for(initialization ,condition,increment)


        for (int a = 1; a <= 5; a++) {
            System.out.println("Goog morning");

        }
        System.out.println("====================================");


        //i wnat to print 2 table
        //  start =2, increment=2, condition (<=20)

        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);

        }
        System.out.println("====================================");

        // i wnat to print 5 table
        //initialization=5, incremnet=5,condition>=50


        for (int x = 5; x <= 50; x = x + 5) {
            System.out.println(x);

        }

System.out.println("====================================");
        // i want to print reverse table of 5
        // initialization=50, condition=>=5,increment =5

        for(int y=50; y>=5;y=y-5)
        {
            System.out.println(y);
        }
        System.out.println("====================================");







    }
}
