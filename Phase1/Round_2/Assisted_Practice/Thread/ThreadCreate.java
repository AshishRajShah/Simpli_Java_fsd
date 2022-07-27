package Phase1.Round_2.Assisted_Practice.Thread;

//   ------------     Thread Implementation With Thread Class & Runnable Interface   --------------- 

class Thanku extends Thread { // thread created with Thread Class
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Thanku..");
        }
    }
}

class Welcome implements Runnable // thread created with Runnable Interface..
{
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Welcome.....");
        }
    }
}

public class ThreadCreate {

    public static void main(String[] args) {

        // Thread class thread created...
        Thanku t1 = new Thanku();

        // for Runnable interface thread we have to create a thread class Object..
        Welcome wl = new Welcome(); // create Congrats obj..
        Thread t2 = new Thread(wl);

        t1.start(); // start() calls run to create thread...
        t2.start();

    }

}
