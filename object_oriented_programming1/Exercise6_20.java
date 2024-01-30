package object_oriented_programming1;

public class Exercise6_20 {
    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }

    private static int[] shuffle(int[] original) {
        for (int i = 0; i < original.length; i++) {
            int index = (int) (Math.random() * original.length);
            int temp = original[0];
            original[0] = original[index];
            original[index] = temp;
        }

        return original;
    }
}
