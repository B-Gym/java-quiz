package object_oriented_programming2;

public class Exercise7_23 {
    static double sumArea(Shape[] s) {
        double sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum += s[i].calcArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape[] arr = {
                new Circle(5.0),
                new Rectangle(3, 4),
                new Circle(1)
        };

        System.out.println("면적의 합: " + sumArea(arr));
    }
}
