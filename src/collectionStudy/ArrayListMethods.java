package collectionStudy;

import java.util.ArrayList;

public class ArrayListMethods {

    static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); //interger type og arraylist
        arrayList.add(98);
        arrayList.add(51);
        System.out.println(arrayList);
        arrayList.add(1, 100);
        System.out.println(arrayList);
        arrayList.addFirst(87);
        System.out.println(arrayList);
        arrayList.addLast(80);
        System.out.println(arrayList);
        System.out.println("=================");
//        arrayList.clear();
//        System.out.println(arrayList);
        Object arrayListCloned = arrayList.clone();
        System.out.println("arrayListCloned->" + arrayListCloned);
        System.out.println("arrayList->" + arrayList);
//        arrayList.add(40);
//        System.out.println("arrayList"+arrayList);

        boolean Result = arrayList.equals(arrayListCloned);
        System.out.println("equal Result is " + Result);

        boolean Result1 = arrayList.contains(12);
        System.out.println("The Contains Result is " + Result1);

        Integer Result3 = arrayList.get(1);
        System.out.println("the get method check " + Result3);

        Integer Result4 = arrayList.getFirst();
        System.out.println("Check first get method " + Result4);

        Integer Result5 = arrayList.getLast();
        System.out.println("Check last get method " + Result5);

        int Result6 = arrayList.indexOf(100);
        System.out.println("Check the index of " + Result6);

//        arrayList.lastIndexOf(80);
//        System.out.println(arrayList);

        int SizeOfArrayList = arrayList.size();
        System.out.println("Size of array " + SizeOfArrayList);
        System.out.println("=====================");

        boolean Result7 = arrayList.isEmpty();
        System.out.println("chck the list empty or not " + Result7);
        System.out.println("actual list "+arrayList);
        arrayList.remove(4);
        System.out.println("after removing list "+arrayList);

        arrayList.removeFirst();
        System.out.println("Remove first " +arrayList);
        arrayList.removeLast();
        System.out.println("Remove Last "+arrayList);
        arrayList.add(25);
        arrayList.add(95);
        arrayList.add(45);
        System.out.println(arrayList);
        arrayList.set(3,150);
        System.out.println("check the set method "+arrayList);

    }
}
