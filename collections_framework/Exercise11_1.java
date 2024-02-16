package collections_framework;

import java.util.ArrayList;

public class Exercise11_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> kyo = new ArrayList<>();
        ArrayList<Integer> cha = new ArrayList<>();
        ArrayList<Integer> hap = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        kyo.addAll(list1);
        kyo.retainAll(list2);

        cha.addAll(list1);
        cha.removeAll(kyo);

        hap.addAll(cha);
        hap.addAll(list2);

        System.out.println("list1=" + list1);
        System.out.println("list2=" + list2);
        System.out.println("kyo=" + kyo);
        System.out.println("cha=" + cha);
        System.out.println("hap=" + hap);

    }
}
