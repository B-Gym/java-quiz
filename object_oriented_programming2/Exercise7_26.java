package object_oriented_programming2;

public class Exercise7_26 {
    public static void main(String[] args) {
        Outer2.Inner2 oi = new Outer2.Inner2();
        System.out.println(oi.iv);
    }
}

class Outer2 {
    static class Inner2 {
        int iv = 200;
    }
}