package Advance;

import java.util.HashSet;

/* Methods related to hashing in java
  1.HashSet
  2.HashMap
  3.LinkedHashMap
  4.HashTable
 */

//There are many more methods in HashSet which can be used,
// Use Oracle Java docs highly Recommended

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> HS=new HashSet<>(10,0.5f);
        HS.add(10);
        HS.add(11);
        HS.add(12);
        HS.add(13);
        System.out.println(HS);
    }
}
