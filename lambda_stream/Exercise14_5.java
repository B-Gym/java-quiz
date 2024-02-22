package lambda_stream;

import java.util.*;

public class Exercise14_5 {
    public static void main(String[] args) {
        String[] strArr = { "aaa", "bb", "c", "dddd" };

        String result1 = Arrays.stream(strArr).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length)
                return s1;
            else
                return s2;
        });
        System.out.println(result1);

    }
}
