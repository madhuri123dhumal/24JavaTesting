package loopStudy;

public class DoWhileStudy {

  //  i want to print the days
  //  initialization=1,condition=<=7,updation= 1
  static void main() {



    int test=1;
    do{

        System.out.println("the day "+test);
        test++;
    }while(test<=7);
      System.out.println("========================");


    //i want to print the 51 to 60 number
     // initialization=51,condition(<=60),updation= 1
      int a=51;
      do
      {
          System.out.println(a);
          a++;
      }while(a<=60);


        System.out.println("========================");


      // i want to print the reverse number of 100 to 81
      // initialization=100,condition(>=81),updation= a--

      int b=100;
      do
      {
          System.out.println(b);
          b--;
      }while(b>=81);






}
}
