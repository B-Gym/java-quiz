package date_time_formatting;

import java.text.DecimalFormat;

public class Exercise10_3 {
    public static void main(String[] args) {
        String num1 = "123,456,789.5";
        System.out.println("date: " + num1);

        double num2 = Double.valueOf(num1.replaceAll(",", ""));

        DecimalFormat df1 = new DecimalFormat("#");
        System.out.println("반올림: " + df1.format(num2));

        DecimalFormat df2 = new DecimalFormat("#,####");
        System.out.println("만단위: " + df2.format(num2));

    }
}
