package collections_framework;

import java.util.*;

public class Exercise11_6 {
    static int getGroupCount(TreeSet tset, int from, int to) {
        int count = 0;
        Iterator it = tset.iterator();

        while (it.hasNext()) {
            Student2 tmp = (Student2) it.next();
            if (from <= tmp.getAvg() && tmp.getAvg() < to) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        TreeSet set = new TreeSet(new Comparator() {
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Student2 && o2 instanceof Student2) {
                    Student2 s1 = (Student2) o1;
                    Student2 s2 = (Student2) o2;
                    return s1.getAvg() < s2.getAvg() ? -1 : (s1.getAvg() == s2.getAvg() ? 0 : 1);
                }
                return -1;
            }
        });

        set.add(new Student2("홍길동", 1, 1, 100, 100, 100));
        set.add(new Student2("남궁성", 1, 2, 90, 70, 80));
        set.add(new Student2("김자바", 1, 3, 80, 80, 90));
        set.add(new Student2("이자바", 1, 4, 70, 90, 70));
        set.add(new Student2("안자바", 1, 5, 60, 100, 80));

        Iterator it = set.iterator();

        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
        System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
        System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
        System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
    }
}

class Student2 implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAvg() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public String toString() {
        return name + ", " + ban + ", " + no + " ," + kor
                + " ," + eng + " ," + math
                + " ," + getTotal() + " ," + getAvg();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student2) {
            Student2 tmp = (Student2) o;
            return name.compareTo(tmp.name);
        } else {
            return -1;
        }
    }
}