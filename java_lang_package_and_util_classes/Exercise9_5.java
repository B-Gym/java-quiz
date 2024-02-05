package java_lang_package_and_util_classes;

public class Exercise9_5 {
    public static int count(String src, String target) {
        int count = 0;
        int pos = 0;

        while (pos < src.length()) {
            int index = src.indexOf(target, pos);
            if (index == -1) {
                break;
            } else {
                pos += target.length();
                if (index != src.indexOf(target, pos)) {
                    // System.out.println("index: " + index + " pos: " + pos);
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
    }
}
