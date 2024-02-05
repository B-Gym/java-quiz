package java_lang_package_and_util_classes;

public class Exercise9_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        path = fullPath.substring(0, fullPath.lastIndexOf("\\"));
        fileName = fullPath.substring(fullPath.lastIndexOf("\\") + 1);

        System.out.println("fullPath:" + fullPath);
        System.out.println("path:" + path);
        System.out.println("fileName:" + fileName);
    }
}
