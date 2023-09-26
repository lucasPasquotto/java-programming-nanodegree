package lesson4.datesAndCalendars;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatesAndCalendar {
    public static void main(String[] args) {
        //DatesAndCalendar.displayCurrentDate();
        //DatesAndCalendar.displaySetDate();
        DatesAndCalendar.displayChangedFormatDate();
    }

    public static void displayCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        Date date = new Date();
        System.out.println(date);
        calendar.setTime(date);
        System.out.println(calendar.getTime());
    }

    public static void displaySetDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2031, Calendar.FEBRUARY, 2);
        Date date = calendar.getTime();
        System.out.println(date);
    }

    public static void displayChangedFormatDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2031, Calendar.JUNE ,2);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = calendar.getTime();
        System.out.println(format.format(date));
    }
}
