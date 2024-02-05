package java_lang_package_and_util_classes;

import java.util.Arrays;

public class Exercise9_10 {
    public static String format(String str, int length, int alignment) {
        int index = 0;
        if (length < str.length())
            return str.substring(0, length);

        char[] temp = new char[length];
        Arrays.fill(temp, ' ');

        switch (alignment) {
            case 0:
                for (int i = 0; i < str.length(); i++) {
                    temp[i] = str.charAt(i);
                }
                break;
            case 1:
                index = (length - str.length()) / 2;
                for (int i = 0; i < str.length(); i++) {
                    temp[index++] = str.charAt(i);
                }
                break;
            case 2:
                index = length - str.length();
                for (int i = 0; i < str.length(); i++) {
                    temp[index++] = str.charAt(i);
                }
                break;
            default:
                System.out.println("유효하지 않은 정렬값 입력");
                break;
        }
        return new String(temp);

    }

    public static void main(String[] args) {
        String str = "가나다";

        System.out.println(format(str, 7, 0)); // 왼쪽 정렬
        System.out.println(format(str, 7, 1)); // 가운데 정렬
        System.out.println(format(str, 7, 2)); // 오른쪽 정렬
    }
}
