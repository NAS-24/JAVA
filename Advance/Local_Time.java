package Advance;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Local_Time {
    public static void main(String[] args) {

        LocalTime T=LocalTime.now();
        System.out.println(T);

        LocalDate D=LocalDate.now();
        System.out.println(D);

        LocalDateTime DT=LocalDateTime.now();
        System.out.println(DT);

    }

}
