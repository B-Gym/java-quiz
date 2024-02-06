package java_lang_package_and_util_classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise9_14 {
    public static void main(String[] args) {
        String[] phoneNumArr = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"
        };

        ArrayList<String> list = new ArrayList<String>();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            String input = s.nextLine().trim();

            // 입력값이 유효하지 않은 경우 실행할 로직
            if (input.equals("")) {
                continue;
            } else if (input.equalsIgnoreCase("Q")) {
                System.exit(0);
            }

            // 입력값이 유효한 경우 실행할 로직
            for (String num : phoneNumArr) {
                String temp = num.replaceAll("-", "");
                if (temp.contains(input)) {
                    list.add(num);
                }
            }

            if (list.size() > 0) {
                System.out.println(list);
                list.removeAll(list);
            } else {
                System.out.println("일치하는 번호가 없습니다.");
            }
        }

    }
}
