package Advance;

import java.util.Calendar;
import java.util.Date; //Note:- Most of its methods are deprecated.
import java.util.TimeZone;

//There are many more methods in ArrayList which can be used,
// Use Oracle Java docs highly Recommended
public class Date_Time {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis()); //The value that is given is the
        // time in milliseconds passed from 1 jan 1970

        Date d=new Date(); //This is Date class
        System.out.println(d);  //It gives the current date


        System.out.println("Calendar Class");  //Calendar class 1.
        Calendar c= Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c);
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTimeZone());  //If getInstance is kept empty i.e.no id is given, then timZone will set to default i.e Asia/calcutta


    }
}
