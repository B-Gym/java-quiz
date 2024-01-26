package control_statement;

public class Exercise4_6 {
    public static void main(String[] args) {

        int result = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6) {
                    result++;
                    System.out.printf("i: %d , j: %d", i, j);
                    System.out.println();
                }

            }
        }

        System.err.println("눈의 합이 6이 되는 모든 경우의 수: " + result);
    }
}
