package operator;

public class Exercise3_3 {
    public static void main(String[] args) {
        int num = 10;
        String result = num == 0 ? "0" : num > 0 ? "양수" : "음수";
        System.out.println(result);
    }
}
