package date_time_formatting;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Exercise10_2
 */
public class Exercise10_2 {

    static int paycheckCount(Calendar from, Calendar to) {
        int payDay = 21;
        int fromDay = from.get(Calendar.DAY_OF_MONTH);
        int toDay = to.get(Calendar.DAY_OF_MONTH);
        int monDiff = (int) (((to.getTimeInMillis() - from.getTimeInMillis()) / 1000) / (60 * 60 * 24 * 7 * 4));

        if ((to.getTimeInMillis() - from.getTimeInMillis()) / 1000 < 0 || from == null || to == null) {
            return 0;
        } else if ((to.getTimeInMillis() - from.getTimeInMillis()) / 1000 == 0 && toDay == payDay) {
            return 1;
        } else if (fromDay <= payDay && toDay >= payDay) {
            return ++monDiff;
        } else if (fromDay > payDay && toDay < payDay) {
            return --monDiff;
        }

        return monDiff;
    }

    static void printResult(Calendar from, Calendar to) {
        Date fromDate = from.getTime();
        Date toDate = to.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + " : " + paycheckCount(from, to));
        System.out.println();
    }

    public static void main(String[] args) {
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();

        fromCal.set(2010, 0, 1);
        toCal.set(2010, 0, 1);
        printResult(fromCal, toCal);

        fromCal.set(2010, 0, 21);
        toCal.set(2010, 0, 21);
        printResult(fromCal, toCal);

        fromCal.set(2010, 0, 1);
        toCal.set(2010, 2, 1);
        printResult(fromCal, toCal);

        fromCal.set(2010, 0, 1);
        toCal.set(2010, 2, 23);
        printResult(fromCal, toCal);

        fromCal.set(2010, 0, 23);
        toCal.set(2010, 2, 21);
        printResult(fromCal, toCal);

        fromCal.set(2011, 0, 22);
        toCal.set(2010, 2, 21);
        printResult(fromCal, toCal);

    }
}