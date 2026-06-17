package collectionStudy;

import java.util.Iterator;

public class LinkedHashSet {

    static void main(String[] args) {
        java.util.LinkedHashSet<Integer>linkedHashSet=new java.util.LinkedHashSet<>();
        linkedHashSet.add(23);
        linkedHashSet.add(23);
        linkedHashSet.add(45);
        linkedHashSet.add(80);
        linkedHashSet.add(98);
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);
        linkedHashSet.addFirst(70);
        linkedHashSet.addLast(100);
        System.out.println(linkedHashSet);
        System.out.println("the size of the element "+linkedHashSet.size());
        System.out.println("The get first element "+linkedHashSet.getFirst());
        System.out.println("The get last element "+linkedHashSet.getLast());
        System.out.println("remove the element "+linkedHashSet.remove(45));
        System.out.println("The remove the first element"+linkedHashSet.removeFirst());
        System.out.println(linkedHashSet);
        System.out.println("The remove the last element"+linkedHashSet.removeLast());
        System.out.println(linkedHashSet);
        //linkedHashSet.clear();
       // linkedHashSet.clone()
        //linkedHashSet.equals()

        // for linkedHashSet used for each and itertator
        System.out.println("=====FOR EACH LOOP");
        for (Integer ls:linkedHashSet)
        {
            System.out.println(ls);
        }
        System.out.println("====ITERATOR=====");
Iterator<Integer> it =linkedHashSet.iterator();
while(it.hasNext())
{
    System.out.println(it.next());
}


    }
}
