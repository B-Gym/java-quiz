package collections_framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Exercise11_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);

        HashSet<Integer> set = new HashSet<>(list); // list내 중복 요소 제거 [3, 6, 2, 7]
        TreeSet<Integer> tset = new TreeSet<>(set); // set내 요소 정렬 [2, 3, 6, 7]
        Stack<Integer> stack = new Stack<>();
        stack.addAll(tset);

        while (!stack.empty()) {
            System.out.println(stack.pop()); // 7 > 6 > 3 > 2
        }
    }
}
