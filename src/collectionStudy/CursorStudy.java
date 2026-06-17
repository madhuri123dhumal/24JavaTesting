package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorStudy {
    static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(25);
        arrayList.add(98);
        arrayList.add(46);
        arrayList.add(37);
        arrayList.add(91);
        arrayList.add(26);
System.out.println(arrayList);


//for loop
        //ini=0      condition=object.size()-1   updation= ++

        System.out.println("=======For Loop");
        for(int i=0;i<=arrayList.size()-1;i++)
        {
            System.out.println(arrayList.get(i));//i=0-->max

        }
        System.out.println("=======For each Loop");

        for(Integer a1:arrayList)
        {
            System.out.println(a1);//i=0-->max

        }

        System.out.println("=======Iterator========");
        //Iterator Cursor

        Iterator<Integer> it= arrayList.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
      //  System.out.println(arrayList);

        System.out.println("====ListIterator");

        ListIterator<Integer> lit=arrayList.listIterator();
        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }
        System.out.println("==== Reverse  ListIterator previous");

        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }





    }
}
