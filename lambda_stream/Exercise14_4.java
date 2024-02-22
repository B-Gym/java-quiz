package lambda_stream;

interface MyFunction {
    void dice(int start, int end, int caseNum);
}

public class Exercise14_4 {
    public static void main(String[] args) {

        MyFunction f = (start, end, caseNum) -> {
            for (int i = start; i <= end; i++) {
                for (int j = start; j <= end; j++) {
                    if (i + j == caseNum) {
                        System.out.printf("[%d, %d]\n", i, j);
                    }
                }
            }
        };

        f.dice(1, 6, 6);

    }
}
