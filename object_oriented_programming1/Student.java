package object_oriented_programming1;

class Student {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    Student() {
    }

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public float getAverage() {
        return (float) ((int) (((float) getTotal() / 3) * 10 + 0.5) / 10.0);
    }

    public String info() {
        return "" + name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", "
                + getAverage();
    }
}
