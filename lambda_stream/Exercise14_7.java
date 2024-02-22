package lambda_stream;

import java.util.*;

interface MyFunction2 {
    void rottoNum();
}

public class Exercise14_7 {
    public static void main(String[] args) {
        MyFunction2 f = () -> {
            HashSet<Integer> set = new HashSet<>();
            while (set.size() != 6) {
                int temp = (int) (Math.random() * 46);
                set.add(temp);
            }

            ArrayList<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            for (int n : list) {
                System.out.println(n);
            }
        };

        f.rottoNum();
    }

}
