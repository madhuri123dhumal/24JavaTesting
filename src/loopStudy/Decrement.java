package loopStudy;

public class Decrement {

    static void main(String[] args) {
         int p=40;
         int n=50;


         System.out.println(p);

         // POST Decrement first assign then decrement
        int l=p--;
        System.out.println(l);  //40
        System.out.println(p);  //39

        //pre decrement  first decrement then assign

        int m=--n;
        System.out.println("m>>>>"+m); //49
        System.out.println("n>>>>>"+n); //49







    }
}
