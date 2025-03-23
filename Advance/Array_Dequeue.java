package Advance;

import java.util.ArrayDeque;

//There are many more methods in ArrayDequeue which can be used,
// Use Oracle Java docs highly Recommended
public class Array_Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(5);
        ad1.add(10);
        ad1.add(20);
        ad1.addFirst(1);
        ad1.addLast(100);

        for(int element:ad1){
            System.out.println(element);
        }
        System.out.println(ad1.size());
    }
}
