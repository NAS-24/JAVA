package Advance;

//import java.util.ArrayList
import java.util.*;
//There are many more methods in ArrayList which can be used,
// Use Oracle Java docs highly Recommended
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(1); //add method is used to add
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        System.out.println("Array List l1");
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)); //get method is used here
            System.out.print(", ");
        }

        System.out.println("\n\nArray List l2");
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        for(int element:l2){  //for each loop used
            System.out.print(element);
            System.out.print(", ");
        }

        System.out.println("\n\nArray List l1 and l2");
        l1.addAll(l2);  //can also add the index where the following l2 should begin from
//        l1.retainAll(l2);  this methods removes all l1 from l2.
        for(int element:l1){
            System.out.print(element);
            System.out.print(", ");
        }

    }
}
