package control_statement;

public class Exercise4_12 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%2d*%d=%-5d ", j, i, i * j);
            }

            System.out.println();

        }
    }
}
