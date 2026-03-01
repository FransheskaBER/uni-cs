package date_and_time;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class NewDate {
    static public Date myDate = new Date();
    static public SimpleDateFormat myformat = new SimpleDateFormat("dd.MM.yyyy");
    static public String formattedDate = myformat.format(myDate);
    // static public Date dateAgain = myformat.parse(formattedDate);
    static public DateFormat df = DateFormat.getDateInstance();
    static public DateFormat tf = DateFormat.getTimeInstance();

    static public DateFormat df_1 = DateFormat.getDateInstance(DateFormat.SHORT);
    static public DateFormat tf_1 = DateFormat.getTimeInstance(DateFormat.MEDIUM);
    static public DateFormat tf_2 = DateFormat.getTimeInstance(DateFormat.FULL);



    public static void main(String[] args) {
        System.out.println(myDate);                 // Tue Jan 27 09:43:06 IST 2026
        System.out.println(formattedDate);          // 27.01.2026
        System.out.println(df.format(myDate));      // Jan 27, 2026
        System.out.println(df_1.format(myDate));    // 1/27/26
        System.out.println(tf_1.format(myDate));    // 9:56:11 AM
        System.out.println(tf_2.format(myDate));    // LONG: 9:56:11 AM IST - FULL: 9:56:38 AM Israel Standard Time


    }
}
