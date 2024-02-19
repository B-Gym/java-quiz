package thread;

import java.util.Scanner;
import java.util.Vector;

public class Exercise13_8 {
    static Vector<String> words = new Vector<String>();
    static String[] data = { "뉴", "선우", "큐", "주연", "영훈", "상운", "제이콥", "주학년", "에릭", "케빈", "현재" };

    static int interval = 3 * 1000;

    WordGenerator wg = new WordGenerator();

    public static void main(String[] args) throws Exception {
        Exercise13_8 game = new Exercise13_8();

        game.wg.start();

        Vector words = game.words;

        while (true) {
            System.out.println(words);

            String prompt = ">>";
            System.out.println(prompt);

            Scanner s = new Scanner(System.in);
            String input = s.nextLine().trim();

            int idx = words.indexOf(input);

            if (idx != -1) {
                words.remove(idx);
            }
        }
    }
}

class WordGenerator extends Thread {
    public void run() {
        try {
            Thread.sleep(Exercise13_8.interval);
            int idx = (int) (Math.random() * Exercise13_8.data.length);
            Exercise13_8.words.add(Exercise13_8.data[idx]);
            Exercise13_8.main(null);
        } catch (Exception e) {
        }
    }
}