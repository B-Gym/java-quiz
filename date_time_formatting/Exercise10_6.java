package date_time_formatting;

import java.util.Calendar;

/**
 * Exercise10_5
 */
public class Exercise10_6 {
    public static void main(String[] args) {
        Calendar birth = Calendar.getInstance();
        // Calendar future = Calendar.getInstance();

        birth.set(1998, 3, 26);

        System.out.println(getDays(birth));

    }

    static int getDays(Calendar past) {
        Calendar today = Calendar.getInstance();
        return getDays(past, today);
    }

    static int getDays(Calendar past, Calendar future) {
        long diff = (future.getTimeInMillis() - past.getTimeInMillis()) / 1000;
        int days = (int) (diff / (60 * 60 * 24));
        return days;
    }
}