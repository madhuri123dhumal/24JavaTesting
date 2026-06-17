package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

    static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("test");
        hashSet.add("test");
        hashSet.add("test"); // dublicate not allowed
        hashSet.add(null); // null allowed only one time
        hashSet.add(null);
        hashSet.add("Selenium");
        hashSet.add("Automation");
        System.out.println(hashSet); //order insertion randomly
        hashSet.add("FullStack");
        System.out.println(hashSet);
        hashSet.remove("test");
        System.out.println(hashSet);
        System.out.println("The size of the list is "+hashSet.size());
        //hashSet.clear();
        System.out.println("The contain check "+ hashSet.contains("madhuri"));
        System.out.println(hashSet);
        System.out.println ("The check emply or not " +hashSet.isEmpty());
        System.out.println(hashSet);

        //traversing through hash set
        //for loop is not used beacause for loop is index based in set index not allow
        //list itereator not used bacaused list iterator only suppory list(I) impl class
        //enum is not used beacuse it only support legacy means vector class
        //******itertaor is allowed bacaused they are universal
        //***** for each loop is used its not on index based
        System.out.println("=======FOR EACH LOOP");
        for(String hs:hashSet)
        {
            System.out.println(hs);
        }
        System.out.println("=======ITERATOR");

       Iterator<String> it=hashSet.iterator();

       //if i want to randome element that time used the next method
        //suppose i want selenium that time i print
        it.next(); // point to null
        it.next();//point to Automation
        System.out.println(it.next()); //point to selenium


        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
