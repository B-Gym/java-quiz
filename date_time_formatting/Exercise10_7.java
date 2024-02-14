package date_time_formatting;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercise10_7 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        for (int i = 18; i <= 28; i++) {
            cal.set(2016, 11, i);
            if (cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 4 && cal.get(Calendar.DAY_OF_WEEK) == 3) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                System.out.println(sdf.format(cal.getTime()));
                break;
            }
        }

    }
}
