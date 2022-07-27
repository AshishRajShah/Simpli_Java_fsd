package Phase1.Round_2.Assisted_Practice.Thread;

class Welcome implements Runnable // thread created with Runnable Interface..
{
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Welcome.....");
            try {Thread.sleep(1000);} catch (Exception e) {};
        }
    }
}

public class ThreadSleep {

    public static void main(String[] args) {

        // annoymous runnable interface thread..
        Runnable ri = new Runnable() {
            public void run() {
                for (int i = 1; i < 5; i++) {
                    System.out.println("Congrats.....");
                    try {Thread.sleep(1000);} catch (Exception e) {};
                }
            }
        };

        Welcome wl = new Welcome();

        Thread t1 = new Thread(wl);
        Thread t2 = new Thread(ri);

        t1.start();
        t2.start();
    }
}
