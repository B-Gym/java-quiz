package collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exercise11_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동", 1, 1, 100, 100, 100));
        list.add(new Student("남궁성", 1, 2, 90, 70, 80));
        list.add(new Student("김자바", 1, 3, 80, 80, 90));
        list.add(new Student("이자바", 1, 4, 70, 90, 70));
        list.add(new Student("안자바", 1, 5, 60, 100, 80));

        Collections.sort(list);
        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
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

    public int compareTo(Object o) {
        return compareTo((Student) o);
    }

    public int compareTo(Student s) {
        String thisVal = this.name;
        String anotherVal = s.name;

        return (thisVal.charAt(0) < anotherVal.charAt(0) ? -1 : (thisVal == anotherVal ? 0 : 1));
    }

}
