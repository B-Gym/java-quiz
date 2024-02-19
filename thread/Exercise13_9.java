package thread;

import javax.swing.JOptionPane;

public class Exercise13_9 {
    public static void main(String[] args) {
        // 1) Runnable로 구현
        // Runnable r = new Exercise13_9_1();
        // Thread th1 = new Thread(r);
        // th1.start();

        // String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        // System.out.println("입력하신 값은 [" + input + "] 입니다.");
        // ((Exercise13_9_1) r).interrupt();

        // 2) Thread 상속
        Exercise13_9_2 th1 = new Exercise13_9_2();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 [" + input + "] 입니다.");
        th1.interrupt();
    }
}

class Exercise13_9_1 implements Runnable {
    boolean isInterrupted = false;

    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted) {
            System.out.println(i--);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

        System.out.println("카운트가 종료되었습니다.");
    }

    public void interrupt() {
        isInterrupted = true;
    }
}

class Exercise13_9_2 extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                interrupt();
            }
        }

        System.out.println("카운트가 종료되었습니다.");
    }
}