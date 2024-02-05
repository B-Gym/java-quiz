package java_lang_package_and_util_classes;

public class Exercise9_8 {
    public static double round(double d, int n) {
        int temp = (int) Math.pow(10, n);
        return (int) (d * temp + 0.5) / (double) temp;
    }

    public static void main(String[] args) {
        System.out.println(round(3.1415, 1));
        System.out.println(round(3.1415, 2));
        System.out.println(round(3.1415, 3));
        System.out.println(round(3.1415, 4));
        System.out.println(round(3.1415, 5));
    }
}
