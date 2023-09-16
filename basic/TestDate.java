package basic;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDate {
    public static void main(String[] args) throws ParseException{
        LocalDateTime localDateTime = LocalDateTime.now();
       DateTimeFormatter formatterLocalDateTime =
               DateTimeFormatter.ofPattern("YYYY-MM-dd hh:mm:ss");
       String result = formatterLocalDateTime.format(localDateTime);
                       System.out.println("\nYYYY-MM-DD hh:mm:ss: " + result);
    }
    
}
