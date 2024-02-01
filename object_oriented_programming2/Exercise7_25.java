package object_oriented_programming2;

public class Exercise7_25 {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        Outer1.Inner1 i = o.new Inner1();
        System.out.println(i.iv);
    }
}

class Outer1 {
    class Inner1 {
        int iv = 100;
    }
}