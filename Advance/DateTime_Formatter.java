package Advance;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//There are many more methods and format in Formatter which can be used,
// Use Oracle Java docs highly Recommended.

public class DateTime_Formatter {
    public static void main(String[] args) {

                LocalDateTime dt = LocalDateTime.now(); // This is the date
                System.out.println(dt);

                DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format
                DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

                String myDate = dt.format(df); // Creating date string using date and format
                System.out.println(myDate);

            }
        }
