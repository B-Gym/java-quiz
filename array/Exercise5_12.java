package array;

import java.util.Scanner;

public class Exercise5_12 {
    public static void main(String[] args) {
        String[] words = { "chair", "computer", "integer" };
        String[] mean = { "의자", "컴퓨터", "정수" };
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray();

            System.out.printf("Q%d. %s의 뜻?.> ", i + 1, new String(question));
            String answer = scanner.nextLine();

            if (mean[i].equals(answer.trim())) {
                System.out.printf("정답입니다. %n%n");
                count++;
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다 %n%n", mean[i]);
            }
        }
        System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.", words.length, count);
    }
}
