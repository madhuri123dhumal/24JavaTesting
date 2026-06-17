package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

    static void main(String[] args) {

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(23);
        linkedList.add(23);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(89);
        linkedList.add(150);
        System.out.println(linkedList);
        linkedList.add(3,800);
        System.out.println(linkedList);
        System.out.println(linkedList.get(5));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.addFirst(11);
        System.out.println(linkedList);
        linkedList.addLast(50);
        System.out.println(linkedList);
        //clone
        System.out.println(linkedList.contains(50));
        System.out.println(linkedList.offer(500)); //offere sames as a contains method
        linkedList.offerFirst(36);
        linkedList.offerLast(70);
        System.out.println(linkedList);
        //peak retrive but not removed

        System.out.println(linkedList.peek()); //retrived but not remove
        System.out.println("peak the firsr elemement " +linkedList.peekFirst()); //peak the first element
        System.out.println("peak the last element "+ linkedList.peekLast()); //peak the last  element
        System.out.println(linkedList);
        //poll retrive but removed //list is empty is display null
        System.out.println("the pop the element "+linkedList.poll());
        System.out.println(linkedList);
        //poll first  retrive but removed //list is empty is display null

        System.out.println("The poll the first element "+linkedList.pollFirst());
        System.out.println(linkedList);
        //poll last retrive but removed//list is empty null display
        System.out.println("The peek the last elememt "+linkedList.pollLast());
        System.out.println(linkedList);

        linkedList.poll();
        System.out.println(linkedList);

        // traversing forloop ,for each ,iterator listiterator

        System.out.println("==========FOR LOPP");
        for(int i=0;i<=linkedList.size()-1;i++)
        {
         System.out.println(linkedList.get(i));
        }

        System.out.println("====FOR EACH LOOP");
        for(Integer l1:linkedList)
        {
            System.out.println(l1);
        }

        System.out.println("=======Iterator");
        Iterator<Integer> it=linkedList.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("==========LIST ITERATOR");
        ListIterator<Integer> lit=linkedList.listIterator();
        while(lit.hasNext())
        {
         System.out.println(lit.next());
        }
        System.out.println("=====Reversed Listiterator");
        while(lit.hasPrevious())
        {
         System.out.println(lit.previous());   
        }


    }
}
