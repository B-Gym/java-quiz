package object_oriented_programming1;

public class Exercise6_19 {
    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change: " + str); // ABC123
    }

    public static void change(String str) {
        str += "456";
        // System.out.println(str);
    }
}
