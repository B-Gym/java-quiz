package array;

public class Exercise5_3 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("sum=" + sum);
    }
}
