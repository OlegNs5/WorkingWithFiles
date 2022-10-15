package ro.java.ctrln;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class DateTimeAPIFormat {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Data si ora locala este: " + localDateTime);

        LocalDate localDate = LocalDate.now();
        System.out.println("Data locala este: " + localDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        System.out.println(localDateTime.format(dateTimeFormatter));
        System.out.println(localDate.format(dateFormatter));

        String localDateTimeString = "13-Oct-2022 11:31:23";
        String localDateString = "23-Oct-2022";

        System.out.println("localDateTimeString este: " + localDateTime.parse(localDateTimeString, dateTimeFormatter));
//        System.out.println("localDateTimeString: "+ localDateTimeString);
        System.out.println("localDateString este: " + localDate.parse(localDateString, dateFormatter));
    }
}