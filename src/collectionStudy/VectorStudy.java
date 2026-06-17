package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

    static void main(String[] args) {

        Vector<Object> vector=new Vector<>();
        vector.add(36);
        vector.add("test");
        vector.add(null);
        vector.add(null);
        //vector.add(123);
       // vector.add(true);
        // vector.add('A');
        vector.add("test");
        System.out.println(vector);
        vector.add(63);
        System.out.println(vector);
        vector.add(2,11);
        System.out.println(vector);

System.out.println(vector.get(2));
vector.addElement(55);
        System.out.println(vector);
        System.out.println(vector.elementAt(0));
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.insertElementAt(500,3);
        System.out.println(vector);

        System.out.println("========for loop");
        for(int i=0;i<=vector.size()-1;i++)
        {
            System.out.println(vector.get(i));

        }

        System.out.println("==============for each loop=================");
for(Object v:vector)
{
 System.out.println(v);
}

        System.out.println("==============iterator=================");// only remove

       Iterator<Object> it= vector.iterator();

       while(it.hasNext())
       {
           System.out.println(it.next());
       }


       System.out.println("========List Iterator");//remove update add
        ListIterator<Object> lit=vector.listIterator();
        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }
        System.out.println("======== reversed List Iterator");

        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }


        System.out.println("===========Enumeration============");
        Enumeration<Object> ele = vector.elements();
        while (ele.hasMoreElements()) {
            System.out.println(ele.nextElement());//only read
        }


    }
}
