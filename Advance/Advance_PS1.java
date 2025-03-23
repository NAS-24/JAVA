package Advance;
//Create an ArrayList and store names of 10 students inside it. Print it using a for-each loop.

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Advance_PS1 {
    public static void main(String[] args) {
        ArrayList<String> student=new ArrayList<>();
        student.add("S1");
        student.add("S2");
        student.add("S3");
        student.add("S4");
        student.add("S5");
        student.add("S6");
        student.add("S7");
        student.add("S8");
        student.add("S9");
        student.add("S10");

        for(String element:student){
            System.out.println(element);

        }
        // Use the Date class in Java to print time in the following format: 21:47:02
        Date date=new Date();
        System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());


//        Repeat using the Calendar class.
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));


//        Repeat using the java.time API.
        LocalTime lt=LocalTime.now();
        System.out.println(lt.getHour()+":"+lt.getMinute()+":"+lt.getSecond());

//        Create a Set in Java. Try to store duplicate elements
//        inside this Set and verify that only one instance is stored.

        HashSet<Integer> set=new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(9);
        set.add(5);
        for(int i:set){
            System.out.println(i);
        }
    }
}
