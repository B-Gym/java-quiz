package objec_oriented_programming;

public class Exercise6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDistance(2, 2));
    }
}

class MyPoint {
    int x, y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x1, int y1) {
        int sum = (int) (Math.pow(x1 - this.x, 2) + Math.pow(y1 - this.y, 2));
        return Math.sqrt(sum);
    }
}