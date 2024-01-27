package array;

public class Exercise5_7 {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("USAGE: java Exercise5_7");
            System.exit(0);
        }

        // vsCode에서 args[]값을 출력하려면
        // 1) 좌측 ActiveBar에서 실행 및 디버그 클릭
        // 2) launch.json 파일 만들기
        // 3) 나열된 값들 중에서 args[] 출력을 원하는 메인클래스에 해당하는 배열에서 args 타입을 추가하여 값을 입력한다.
        // {
        // "type": "java",
        // "name": "Exercise5_7",
        // "request": "launch",
        // "mainClass": "array.Exercise5_7",
        // "projectName": "java-quiz_9f7ebc82",
        // "args": "3510" <-- 여기에 입력하면 된다.
        // },

        int money = Integer.parseInt(args[0]);

        System.out.println("money=" + money);

        int[] coinUnit = { 500, 100, 50, 10 };
        int[] coin = { 5, 5, 5, 5 };

        for (int i = 0; i < coinUnit.length; i++) {
            int coinNum = 0;
            if ((money / coinUnit[i]) > coin[i]) {
                money -= (coinUnit[i] * coin[i]);
                coinNum = coin[i];
                coin[i] = 0;
            } else {
                coinNum = money / coinUnit[i];
                coin[i] -= coinNum;
                money -= (coinUnit[i] * coinNum);
            }
            System.out.println(coinUnit[i] + "원: " + coinNum);
        }

        if (money > 0) {
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0);
        }

        System.out.println("=남은 동전의 개수=");

        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원: " + coin[i]);
        }
    }
}
