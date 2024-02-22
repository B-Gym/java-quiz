package lambda_stream;

import java.util.Arrays;

public class Exercise14_6 {
    static int sum;

    public static void main(String[] args) {
        String[] strArr = { "aaa", "bb", "c", "dddd" };

        Arrays.stream(strArr).forEach((str) -> {
            sum += str.length();
        });

        System.out.println(sum);
    }
}
