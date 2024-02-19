package thread;

public class Exercise13_1 {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();

        // Runnable r = new Thread2();
        // Thread th2 = new Thread(r);
        Thread th2 = new Thread(new Thread2());

        th1.start();
        th2.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++)
            System.out.print('-');
    }
}

class Thread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 300; i++)
            System.out.print('|');
    }
}
