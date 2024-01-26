package control_statement;

public class Exercise4_3 {
    public static void main(String[] args) {

        int total_sum = 0;
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            for (int k = 1; k <= i; k++) {
                sum += k;
            }
            total_sum += sum;
            sum = 0;
            i++;
        }

        System.out.println(total_sum);
    }
}
