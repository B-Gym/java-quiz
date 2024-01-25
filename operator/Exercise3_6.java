package operator;

public class Exercise3_6 {
    public static void main(String[] args) {
        int num = 24;
        int result1 = (num / 10 + 1) * 10 - num;
        int result2 = 10 - (num % 10);
        System.out.println(result1);
        System.out.println(result2);
    }
}
