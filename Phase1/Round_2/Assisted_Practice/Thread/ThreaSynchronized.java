package Phase1.Round_2.Assisted_Practice.Thread;

//      --------------      Booked ticket with the help of Synchronization..... ------
class BookTkt {
    private int seats = 10;

    synchronized public void bookedTkt(int tkt) // synchronized keyword used..
    {
        if (tkt <= seats) {
            System.out.println("Congrats! you have successfully booked your ticket..");
            seats -= tkt;
            System.out.println("Seats available : " + seats);
        } else {
            System.out.println("Sorry! you can't booked ticket.... ");
            System.out.println("Seats available : " + seats);
        }
    }
}

public class ThreaSynchronized extends Thread {

    static BookTkt bt; // BookTkt refernce of object...
    int tkt;

    public void run() {
        bt.bookedTkt(tkt);
    }

    public static void main(String[] args) {

        bt = new BookTkt(); // BookTkt Obj. creation.....
        // Create Thread1............
        ThreaSynchronized thread1 = new ThreaSynchronized();
        thread1.tkt = 7;
        thread1.start();

        // Create Thread2............
        ThreaSynchronized thread2 = new ThreaSynchronized();
        thread2.tkt = 5;
        thread2.start();
    }
}
