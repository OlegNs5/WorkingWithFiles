package ro.java.ctrln;
//import java.time.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalTime;


public class DateTime {
    public static void main(String[] args) {
        LocalDateTime localDataTime = LocalDateTime.now();
        System.out.println("Data curenta este: "+localDataTime);

        ZonedDateTime zonedDateTime = localDataTime.atZone(ZoneId.of("Europe/Bucharest"));
        System.out.println("Data si ora curenta in Bucuresti: "+zonedDateTime);

        System.out.println("Data si ora curenta in nano secunde in Bucuresti :" + zonedDateTime.getNano());

        System.out.println("Ziua din luna: "+zonedDateTime.getDayOfMonth());
        System.out.println("Ziua din saptamina este: "+zonedDateTime.getDayOfWeek());
        System.out.println("Ziua din an este :"+zonedDateTime.getDayOfYear());
        System.out.println("Ora este: "+zonedDateTime.getHour());
        System.out.println("Minute este: "+zonedDateTime.getMinute());
        System.out.println("Secunde este: "+zonedDateTime.getSecond());

        zonedDateTime = zonedDateTime.plusDays(10);
        System.out.println(zonedDateTime);

        zonedDateTime = zonedDateTime.plusYears(3);
        System.out.println(zonedDateTime);

        zonedDateTime = zonedDateTime.minusMonths(5);
        System.out.println(zonedDateTime);

        zonedDateTime = zonedDateTime.minusYears(3);
        System.out.println(zonedDateTime);

        zonedDateTime = zonedDateTime.plusMonths(5);
        System.out.println(zonedDateTime);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
