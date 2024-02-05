package java_lang_package_and_util_classes;

public class Exercise9_6 {
    public static String fillZero(String src, int length) {
        if (src == null || src.length() == length) {
            return src;
        } else if (length <= 0) {
            return "";
        } else if (src.length() > length) {
            return src.substring(0, length);
        } else {
            char[] temp = new char[length];
            for (int i = 0; i < temp.length; i++) {
                if (i < src.length()) {
                    temp[i] = '0';
                } else {
                    temp[i] = src.charAt(i - src.length());
                }
            }
            return new String(temp);
        }
    }

    public static void main(String[] args) {
        String src = "12345";

        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
    }
}
