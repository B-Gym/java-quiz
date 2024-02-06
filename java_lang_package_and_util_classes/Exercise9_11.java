package java_lang_package_and_util_classes;

import java.util.Scanner;

public class Exercise9_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
        int start = sc.nextInt();
        int end = sc.nextInt();

        if (!(2 <= start && start <= 8) || !(3 <= end || end <= 9) || start > end) {
            System.out.println("단의 범위는 2와 9사이의 값이어야 합니다. 또한 시작 단이 끝 단의 수보다 크면 안됩니다.");
        } else {
            for (int i = start; i <= end; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d * %d = %d \n", i, j, i * j);
                }
                System.out.println();
            }
        }

    }
}
