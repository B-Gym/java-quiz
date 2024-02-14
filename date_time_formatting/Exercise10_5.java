package date_time_formatting;

import java.util.Calendar;

public class Exercise10_5 {
    static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();

        if (yyyymmdd1.length() != yyyymmdd2.length() || yyyymmdd1.length() < 8 || yyyymmdd2.length() < 8) {
            return 0;
        }

        toCal.set(Integer.valueOf(yyyymmdd1.substring(0, 4)), Integer.valueOf(yyyymmdd1.substring(4, 5)),
                Integer.valueOf(yyyymmdd1.substring(6)));
        fromCal.set(Integer.valueOf(yyyymmdd2.substring(0, 4)), Integer.valueOf(yyyymmdd2.substring(4, 5)),
                Integer.valueOf(yyyymmdd2.substring(6)));

        // SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        // System.out.println("to: " + s.format(toCal.getTime()));
        // System.out.println("from: " + s.format(fromCal.getTime()));
        int diff = (int) (toCal.getTimeInMillis() - fromCal.getTimeInMillis()) / 1000 / (60 * 60 * 24);

        return diff;
    }

    public static void main(String[] args) {
        String[][] tc = { { "20010103", "20010101" }, { "20010103", "20010103" }, { "20010103", "200103" } };

        for (int i = 0; i < tc.length; i++) {
            System.out.println(getDayDiff(tc[i][0], tc[i][1]));
        }
    }
}
