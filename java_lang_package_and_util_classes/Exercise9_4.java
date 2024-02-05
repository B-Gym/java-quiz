package java_lang_package_and_util_classes;

public class Exercise9_4 {
    public static void main(String[] args) {
        printGraph(new int[] { 3, 7, 1, 4 }, '*');

    }

    static void printGraph(int[] dateArr, char ch) {
        for (int i = 0; i < dateArr.length; i++) {
            for (int j = 1; j <= dateArr[i]; j++) {
                System.out.print(ch);
            }
            System.out.println(dateArr[i]);
        }
    }
}
