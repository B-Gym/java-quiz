package object_oriented_programming;

public class Exercise6_6 {
    static double getDistance(int x, int y, int x1, int y1) {
        int sum = (int) (Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
