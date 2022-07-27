package Phase1.Round_2.Assisted_Practice.Thread;

import java.util.Scanner;

// thread create....
class CountMoney extends Thread {
    int count = 0, n;

    public void run() {
        synchronized (this) // synchronised block...
        {
            for (int i = 1; i <= n; i++) {
                count += 100;
            }
            this.notify(); // 3. after process done it release the lock...
        }
    }
}

public class ThreadWait {
    public static void main(String[] args) throws InterruptedException {

        CountMoney cm = new CountMoney();

        System.out.println("--------    Live Show       ----------");
        System.out.println("per ticket Price  : 100 Rs.");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("How many ticket u want : ");
            int t = sc.nextInt(); // take input
            cm.n = t;
            cm.start(); // 2.after wait() calling.. it acquire the lock..and do process

            synchronized (cm) // synchronised block...
            {
                cm.wait(); // 1. it release the lock and transfer lock to 'cm obj class'..
                System.out.println("Total Money : " + cm.count); // now again main thread acquire the lock..
            }
        }
    }
}
