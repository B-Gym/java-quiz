package operator;

public class Exercise3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float C = (float) 5 / 9 * (fahrenheit - 32);
        float celcius = (float) ((int) (C * 100 + 0.5) / 100.0);

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celcius: " + celcius);
    }
}
