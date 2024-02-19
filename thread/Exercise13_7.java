package thread;

public class Exercise13_7 {
    public static void main(String[] args) {
        Runnable r = new Thread6();
        Thread th1 = new Thread(r);
        th1.start();

        try {
            Thread.sleep(6 * 1000);
            ((Thread6) r).stop();
        } catch (Exception e) {
        }
        // System.out.println("stopped");
    }
}

class Thread6 implements Runnable {
    boolean stopped = false;

    public void run() {
        for (int i = 0; !stopped; i++) {
            System.out.println(i);

            try {
                Thread.sleep(3 * 1000);
            } catch (Exception e) {
            }
        }
        System.out.println("stopped");
    }

    public void stop() {
        stopped = true;
    }
}