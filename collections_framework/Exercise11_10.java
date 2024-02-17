package collections_framework;

import java.util.*;

public class Exercise11_10 {
    public static void main(String[] args) {
        // Set set = new HashSet();
        // HashSet은 저장된 순서를 보장하지 않으며 자체적인 저장방식에 따라 순서가 결정되기 때문에 HashSet을 사용해 생성한 랜덤한 순자의
        // 순서가 비숫한 위치에 나온다.
        // 따라서 숫자들의 순서가 매번 랜덤하게 나오도록 하려는 경우에는 HashSet보다 LinkedHashSet을 사용하는 편이 좋다.
        Set set = new LinkedHashSet();

        int size = 5;
        int[][] board = new int[size][size];

        for (int i = 0; set.size() < 25; i++) {
            set.add((int) (Math.random() * 30) + 1 + "");
        }

        Iterator it = set.iterator();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) it.next());
                System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}
