package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar2 {
    static GregorianCalendar calendar1 = new GregorianCalendar();
    static GregorianCalendar calendar2 = new GregorianCalendar(2013, 6, 9, 18, 29, 35);

    static int year = calendar1.get(Calendar.YEAR);
    static int month = calendar1.get(Calendar.MONTH);
    static int day = calendar1.get(Calendar.DAY_OF_MONTH);


    public static void main(String[] args) {
        calendar1.set(Calendar.YEAR, 2026);
        System.out.println(year);
        System.out.println(month); // you will get 0 because months are indexes so january is 0
        System.out.println(day);
    }
}
