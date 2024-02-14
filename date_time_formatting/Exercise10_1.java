package date_time_formatting;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(today));

        Calendar cal = Calendar.getInstance();
        Date day = cal.getTime();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.");

        for (int i = 0; i < 12; i++) {
            for (int j = 1; j < 15; j++) {
                cal.set(2010, i, j);
                day = cal.getTime();
                if (sdf1.format(day).contains("2번째 Sun요일")) {
                    System.out.println(sdf1.format(day));
                }
            }
        }

    }
}
