package array;

public class Exercise5_6 {
    public static void main(String[] args) {
        int[] coinUnit = { 500, 100, 50, 10 };

        int money = 2680;
        System.out.println("money=" + money);

        for (int i = 0; i < coinUnit.length; i++) {
            while (money / coinUnit[i] != 0) {
                int tmp = money / coinUnit[i];
                money %= coinUnit[i];
                System.out.printf("%d원: %d\n", coinUnit[i], tmp);
            }
        }
    }
}
