package date_time_formatting;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise10_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar day = Calendar.getInstance();

        do {
            System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)");
            System.out.print(">>> ");
            String input = in.nextLine();
            if (input.matches("\\d{4}/\\d{1,2}/\\d{1,2}")) {
                Matcher matcher = Pattern.compile("(\\d{4})/(\\d{1,2})/(\\d{1,2})").matcher(input);
                matcher.find();

                int y = Integer.valueOf(matcher.group(1));
                int m = Integer.valueOf(matcher.group(2)) - 1;
                int d = Integer.valueOf(matcher.group(3));
                day.set(y, m, d);

                SimpleDateFormat sdf = new SimpleDateFormat("입력하신 날짜는 E요일입니다.", Locale.KOREA);
                System.out.println(sdf.format(day.getTime()));
                break;
            }
        } while (true);

    }
}
