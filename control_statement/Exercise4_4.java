package control_statement;

public class Exercise4_4 {
    public static void main(String[] args) {

        int sum = 0;
        int num = 1;
        while (sum < 100) { // 무한 반복
            sum += num;
            num++;
            if (num % 2 == 0)
                num *= -1;
            break;
        }
    }
}
