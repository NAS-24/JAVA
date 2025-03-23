package Advance;

//import java.util.LinkedList;
import java.util.*;

//LinkedList is mostly Similar to ArrayList,
// But there are few methods which are in linkedList and not in ArrayList for Eg:- addLast();

//There are many more methods in LinkedList which can be used,
// Use Oracle Java docs highly Recommended

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList();
        l1.add(1); //add method is used to add
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.addLast(20); //The following method is not available in ArrayList
        l1.addFirst(11);
        System.out.println("Linked List l1");
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)); //get method is used here
            System.out.print(", ");
        }

        System.out.println("\n\nLinked List l2");
        LinkedList<Integer> l2=new LinkedList();
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        for(int element:l2){  //for each loop used
            System.out.print(element);
            System.out.print(", ");
        }

        System.out.println("\n\nLinked List l1 and l2");
        l1.addAll(l2);  //can also add the index where the following l2 should begin from
        for(int element:l1){
            System.out.print(element);
            System.out.print(", ");
        }

    }
}



