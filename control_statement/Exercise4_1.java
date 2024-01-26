package control_statement;

public class Exercise4_1 {
    public static void main(String[] args) {

        // 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
        int x = 11;
        if (10 < x && x < 20)
            System.out.println("int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식");

        // 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
        char ch = 'x';
        if (ch != ' ')
            System.out.println("char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식");

        // 3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
        if (ch == 'x' || ch == 'X')
            System.out.println("char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식");

        // 4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
        if ('0' <= ch && ch <= '9')
            System.out.println("char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식");

        // 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
        if ('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z')
            System.out.println("char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식");

        // 6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
        int year = 2024;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
            System.out.println("int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식");

        // 7. boolean형 변수 powerOn가 false일 때 true인 조건식
        boolean powerOn = false;
        if (!powerOn)
            System.out.println("boolean형 변수 powerOn가 false일 때 true인 조건식");

        // 8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
        String str = "yes";
        if (str.equals("yes"))
            System.out.println("문자열 참조변수 str이 “yes”일 때 true인 조건식");
    }
}
