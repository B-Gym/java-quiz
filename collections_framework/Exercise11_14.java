package collections_framework;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_14 {
    static ArrayList record = new ArrayList();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            switch (displayMenu()) {
                case 1:
                    inputRecord();
                    break;
                case 2:
                    displayRecord();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
            }
        }
    }

    static int displayMenu() {
        System.out.println("**************************************************");
        System.out.println("* 성적 관리 프로그램 *");
        System.out.println("**************************************************");
        System.out.println();
        System.out.println(" 1. 학생성적 입력하기 ");
        System.out.println();
        System.out.println(" 2. 학생성적 보기");
        System.out.println();
        System.out.println(" 3. 프로그램 종료 ");
        System.out.println();
        System.out.print("원하는 메뉴를 선택하세요.(1~3) : ");

        int menu = 0;
        String tmp = "";
        while (true) {
            tmp = s.nextLine().replaceAll(" ", "");
            if (isInteger(tmp)) {
                menu = Integer.valueOf(tmp);
                if (1 <= menu && menu <= 3) {
                    return menu;
                }
            }
            System.err.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요.");
            System.out.print("원하는 메뉴를 선택하세요.(1~3) : ");
        }

    }

    public static boolean isInteger(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static void inputRecord() {
        System.out.println("1. 학생성적 입력하기");
        System.out.println("이름,반,번호,국어성적,영어성적,수학성적'의 순서로 공백없이 입력하세요.");
        System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");

        while (true) {
            System.out.print(">>>");

            String input = s.nextLine();
            String[] temp = input.replaceAll(" ", "").split(",");
            if (s.nextLine().equalsIgnoreCase("q")) {
                break;
            } else if (temp.length != 6) {
                System.out.println("입력오류(입력 양식을 지키지 않음)입니다. 이름, 반, 번호, 국어성적, 영어성적, 수학성적'의 순서로 입력하세요.");
            } else {
                boolean isError = false;
                for (int i = 1; i < temp.length; i++) {
                    if (!isInteger(temp[i])) {
                        isError = true;
                        System.out.println("숫자 오류");
                        System.out.println("입력오류(유효하지 않은 값 입력)입니다. 이름, 반, 번호, 국어성적, 영어성적, 수학성적'의 순서로 입력하세요.");
                        break;
                    }
                }
                if (!isError) {
                    String name = temp[0];
                    int ban = Integer.valueOf(temp[1]);
                    int no = Integer.valueOf(temp[2]);
                    int kor = Integer.valueOf(temp[3]);
                    int eng = Integer.valueOf(temp[4]);
                    int math = Integer.valueOf(temp[5]);
                    record.add(new Student6(name, ban, no, kor, eng, math));
                    System.out.println("잘입력되었습니다. 입력을 마치려면 q를 입력하세요.");
                }
            }
        }
    }

    static void displayRecord() {
        int koreanTotal = 0;
        int englishTotal = 0;
        int mathTotal = 0;
        int total = 0;

        int length = record.size();

        if (length > 0) {
            System.out.println();
            System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");

            System.out.println("====================================================");
            for (int i = 0; i < length; i++) {
                Student6 student = (Student6) record.get(i);
                System.out.println(student);
                koreanTotal += student.kor;
                mathTotal += student.math;
                englishTotal += student.eng;
                total += student.total;
            }

            System.out.println("====================================================");

            System.out.println("총점: " + koreanTotal + " " + englishTotal + " " + mathTotal + " " + total);
            System.out.println();
        } else {
            System.out.println("====================================================");
            System.out.println(" 데이터가 없습니다.");
            System.out.println("====================================================");
        }

    }

}

class Student6 implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    int schoolRank;
    int classRank; // 반등수

    Student6(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        total = kor + eng + math;
    }

    int getTotal() {
        return total;
    }

    float getAvg() {
        return (int) ((getTotal() / 3f) * 10.0 + 0.5) / 10f;
    }

    public int compareTo(Object o) {
        if (o instanceof Student6) {
            Student6 tmp = (Student6) o;
            return tmp.total - this.total;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + getTotal()
                + "," + getAvg()
                + "," + schoolRank
                + "," + classRank;
    }
}