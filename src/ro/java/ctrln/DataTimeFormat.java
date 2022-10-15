package ro.java.ctrln;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataTimeFormat {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd-MMM-yyyy HH:m:ss");
        System.out.println(simpleDateFormat.format(date));

        String someDateString=("05-Mai-2018 06:26:34");

//        simpleDateFormat.parse()
        try {
            Date someDate = simpleDateFormat.parse(someDateString);
            System.out.println(someDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
