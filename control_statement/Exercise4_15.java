package control_statement;

public class Exercise4_15 {
    public static void main(String[] args) {
        int number = 12321;
        int number_length = ("" + number).length() - 1;
        int tmp = number;
        int result = 0;

        while (tmp != 0) {
            result += (tmp % 10) * (int) Math.pow(10, number_length);
            tmp /= 10;
            number_length--;
        }

        if (number == result) {
            System.out.println(number + "는 회문수 입니다.");
        } else {
            System.out.println(number + "는 회문수가 아닙니다.");
        }
    }
}
