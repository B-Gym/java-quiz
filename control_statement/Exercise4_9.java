package control_statement;

public class Exercise4_9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.valueOf(str.charAt(i) - 48);
        }
        System.out.println("sum=" + sum);
    }
}
