package control_statement;

public class Exercise4_14 {
    public static void main(String[] args) {
        int answer = 50;
        int input = 0;
        int count = 0;
        boolean x = true;

        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요: ");
            input = s.nextInt();
            if (input == answer) {
                System.out.printf("맞췄습니다. \n시도횟수는 %d번 입니다.\n", count);
                x = false;
            } else if (input > answer) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("더 큰 수를 입력하세요.");
            }
        } while (x);
    }
}
