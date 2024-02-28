package input_output;

import java.io.File;

public class Exercise15_3 {

    static int totalFiles = 0;
    static int totalDirs = 0;
    static int totalSize = 0;

    public static void main(String[] args) {

        File dir = new File("input_output");

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0);
        }

        countFiles(dir);

        System.out.println();
        System.out.println("총 " + totalFiles + "개의 파일");
        System.out.println("총 " + totalDirs + "개의 폴더");
        System.out.println("크기 " + totalSize + " byte");

    }

    static void countFiles(File dir) {
        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                totalDirs++;
                countFiles(files[i]);
            } else {
                totalSize += files[i].length();
                totalFiles++;
            }
        }
    }

}
