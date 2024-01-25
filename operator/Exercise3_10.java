package operator;

public class Exercise3_10 {
    public static void main(String[] args) {
        char ch = 'A';

        char lowerCase = (char) (ch < 97 ? ch + 32 : ch);

        System.out.println("ch: " + ch);
        System.out.println("ch to loweCase: " + lowerCase);
    }
}
