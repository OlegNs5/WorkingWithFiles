package ro.java.ctrln;

import java.util.Calendar;
import java.util.TimeZone;

public class ClaendarUsage {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
//        Calendar aClendar = new Clendar(); Nu putem instantia aceasta clasa pentru ca este abstracta

        System.out.println(calendar.getTime());//Metoda getTime ne arata data si ora, it's so cool

        Calendar calendarBucharest = Calendar.getInstance(TimeZone.getTimeZone("Europe/Bucharest"));
        System.out.println(calendarBucharest.getTime());

        System.out.println("Timpul in millesecunde un Bycuresti este: " + calendarBucharest.getTimeInMillis() + " " + System.currentTimeMillis());
        System.out.println("Luna cureta este: " + calendarBucharest.get(Calendar.MONTH));
        System.out.println("Ziua curenta este: " + calendarBucharest.get(Calendar.DAY_OF_WEEK));
        System.out.println("Ziua din luna este: " + calendarBucharest.get(Calendar.DAY_OF_MONTH));
        System.out.println("Ziua din an este: " + calendarBucharest.get(Calendar.DAY_OF_YEAR));

        System.out.println("Ora este : " + calendarBucharest.get(Calendar.HOUR));
        System.out.println(calendarBucharest.get(Calendar.MINUTE));
        System.out.println(calendarBucharest.get(Calendar.SECOND));

        calendarBucharest.add(Calendar.DATE,10);
        System.out.println("Data peste 10 zile este :"+calendarBucharest.getTime());

        calendarBucharest.add(Calendar.MONTH,5);
        System.out.println("Data peste 5 luni este :"+calendarBucharest.getTime());

        calendarBucharest.add(Calendar.YEAR,2);
        System.out.println("Data peste 2 ani este :"+calendarBucharest.getTime());

        calendarBucharest.add(Calendar.YEAR,-3);
        System.out.println("Data in urma cu 3 ani este :"+calendarBucharest.getTime());
    }
}
