package object_oriented_programming1;

public class Exercise6_23 {
    public static void main(String[] args) {
        int[] data = { 3, 2, 9, 4, 7 };
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));
        System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
    }

    private static int max(int[] data) {
        if (data == null || data.length == 0) {
            return -999999;
        }

        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (max < data[i])
                max = data[i];
        }
        return max;
    }
}
