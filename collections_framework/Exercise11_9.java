package collections_framework;

import java.util.*;

public class Exercise11_9 {
    public static void calculateSchoolRank(List list) {
        Collections.sort(list);

        int length = list.size();

        for (int i = 0; i < length; i++) {
            Student5 s1 = (Student5) list.get(i);
            s1.schoolRank = 1;
            for (int j = 0; j < length; j++) {
                Student5 s2 = (Student5) list.get(j);
                if (s1.total < s2.total) {
                    s1.schoolRank++;
                }
            }
        }
        // System.out.println("end");
    }

    public static void calculateClassRank(List list) {
        Collections.sort(list, new ClassTotalComparator());

        int length = list.size();

        for (int i = 0; i < length; i++) {
            Student5 s1 = (Student5) list.get(i);
            s1.classRank = 1;
            for (int j = 0; j < length; j++) {
                Student5 s2 = (Student5) list.get(j);
                if (s1.ban == s2.ban && s1.total < s2.total) {
                    s1.classRank++;
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student5("이자바", 2, 1, 70, 90, 70));
        list.add(new Student5("안자바", 2, 2, 60, 100, 80));
        list.add(new Student5("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student5("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student5("김자바", 1, 2, 80, 80, 90));

        calculateSchoolRank(list);
        calculateClassRank(list);

        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class ClassTotalComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student5 && o2 instanceof Student5) {
            Student5 s1 = (Student5) o1;
            Student5 s2 = (Student5) o2;
            if (s1.ban == s2.ban) {
                return s1.total > s2.total ? -1 : 1;
            } else {
                return s1.ban > s2.ban ? 1 : -1;
            }
        } else
            return -1;
    }
}

class Student5 implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int total;
    int schoolRank;
    int classRank;

    Student5(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        total = kor + eng + math;
    }

    int getTotal() {
        return total;
    }

    float getAvg() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public int compareTo(Object o) {
        // System.out.println("compareTo");
        if (o instanceof Student5) {
            Student5 tmp = (Student5) o;
            return tmp.total - this.total;
        } else
            return -1;
    }

    public String toString() {
        return name + ", " + ban + ", " + no + " ," + kor
                + " ," + eng + " ," + math
                + " ," + getTotal() + " ," + getAvg() + ", " + schoolRank + ", " + classRank;
    }

}
