package java_lang_package_and_util_classes;

public class Exercise9_9 {
    public static String deleteChar(String src, String delCh) {
        StringBuffer strBuf = new StringBuffer(src);

        for (int i = strBuf.length() - 1; i >= 0; i--) {
            for (int j = 0; j < delCh.length(); j++) {
                if (strBuf.charAt(i) == delCh.charAt(j)) {
                    // System.out.println("equals: " + strBuf.charAt(i));
                    strBuf.deleteCharAt(i);
                }
            }
        }

        return strBuf.toString();
    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> " + deleteChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)" + " -> " + deleteChar("(1 2 3 4\t5)", " \t"));
    }
}
