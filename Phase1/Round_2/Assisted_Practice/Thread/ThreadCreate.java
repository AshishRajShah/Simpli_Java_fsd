package Phase1.Round_2.Assisted_Practice.Thread;

/*   ----------------------------     Thread      --------------------- 
 * 
 *   > Implementation ways:
 *           i. Thread (class)
 *          ii. Runnable (Interface) \ annonymous function(with the help pf Runnable Interface..)
 * 
 *   Note: -
 *          - to create a Thread there is 4 step compulsory...
 *               > i. - extends Thread Class/ implements Runnable interface 
 *                                  (Threads implement Runnable Interface...internally..)
 * 
 *               > ii. - Create Class Object...
 * 
 *               > iii. - Run thread task in 'run()' method.
 *                                  ( run() is Runnable Interface method..
 *                                     also,  run is a functionalInterface method...)
 *      
 *               > iv. - execute start() method...
 *                                  ( start() is a Thread Class method.. )
 * 
 *  >   Thread class 'sleep()' method must be in try-cache/handled with throws InterruptedException..
 *  
 *  >   Thread Executions...
 *              -  Performing single task from single thread.....
 *                        >  1 run() or 1 star() method..
 *              -  Performing single task from multiple thread...
 *                        >  1 run() or random star() method..
 *              -  Performing multiple task from single thread...   ->  (not possible)
 *              -  Performing multiple task from multiple thread...
 *                        > random run() or random star() method..
 *       
 *  >   Thread Constructors....
 *              -   Thread()    
 *                      eg:- Thread t = new Thread();
 *              -   Thread(Runnable target)   
 *                      eg:- Runnable obj = new className();  
 *                           Thread t = new Thread(obj);
 *              -   Thread(String)   
 *                      eg:- Thread t = new Thread(string);
 *                                      string is used to for naming Thread
 *              -   Thread(Runnable target,String)   
 *                      eg:- Runnable obj = new className();  
 *                           Thread t = new Thread(obj,string);
 *              -   Thread(ThreadGroup grp,Runnable target)   
 *              -   Thread(ThreadGroup grp,String)   
 *              -   Thread(ThreadGroup grp,Runnable target,String)   
 *              -   Thread(ThreadGroup grp,Runnable target,longStackSize)   
 * 
 *  >    Thread Methods..........
 *              -   Basic     >   run()   - start()   - currentThread()   - isAlive()
 *                              --- currentThread() is a static Method..
 *              
 *              -   Naming    >   getName()   -setName()    // for thread name..
 *              -   Dameon    >   isDeamon()  -setDeamon(boolean on)
 *                             Note:-       
 *                                      -   It provides service to the threads..
 *                                      -   garbage collector,finalizer (use as..)
 *                                      -   main thread can't be set as deamon..
 *              -   Priority  >   getPriority()  -setPriority(int n)
 *                              -- 1 > low  5 > normal  10 > Max
 *              -   Prevent   >   sleep()  - yield()   - join()
 * 
 *                              -- yield()  >  stops current executing thread & give chance to
 *                                              another thread..
 *                                                  * internally it used sleep(java 5)
 *                                                  * hint provide to thread scheduler(java 6)
 *                                        Syntax :-
 *                                                  public static native void yield()
 *                                                                      ----------------
 * 
 *                              -- join()  >  if a thread wants to wait for another thread to complete
 *                                            its task....
 *                                        Syntax :-
 *                                                  public final synchronised void join()
 * 
 *      
 *              -   Interrupt >   interrupt()  - interrupted()   - isInterrupted()
 *                    - Note :-
 *                            >   It is used to interrupt an executing thread...
 *                            >   It will only work when thread is in waiting or sleep state...
 *                            >   throw interrupted Exception...
 *                            >   interrupted & isInterrupted both r used to check wheather a thread
 *                                is interrupted or not...
 *                       -   Difference:-
 *                             > interrupted clear the interrupted status from true to false if
 *                                thread is interrupted...while is interrupted doesn't... 
 *                             > interrupted change the result ifcalled twice while is interrupted doesn't.. 
 * 
 *              > Objects class :-
 *                   -   Inter-Thread Communication      > wait()    - notify()  -notifyAll()     
 * 
 *  >   Thread Synchronization.... 
 *                  It is the process by which we control the accessibility of multiple threads 
 *                  to a particular shared  resource.   
 *                          eg : money transfer, ticket book etc.
 *                  -   used by synchronzed keyword...in any method..
 *          >   Advantages.....
 *                      - thread interference..
 *                      - data inconsistency..
 *          >   DisAdvantages.....
 *                      - Performance Problem..
 *                      - Increase the waiting time period of threads..
 *              
 *                               ___Types Of Syncronization__
 *                              /                            \
 *                      Process sync.                    ____Thread Sync.____
 *             (not in java multi-threading..)          /                    \
 *                                             Mutual Exclusive             Cooperation
 *                                         (acheived by 3 ways..)       (Inter-threaded Communication)
 *                                          1. Sync. method                 1. wait()  
 *                                          2. Sync. Block(specific part)   2. notify()
 *                                          3. Static sync.                 3. notifyAll()
 * 
 *                      >   sync. Block.....
 *                                       - object level lock..(specific block)
 *                                          use :- 
 *                                                  synchronize(this/obj)
 *                                                   { 
 *                                                      if...else..
 *                                                    }
 *                                  Note :-  sync. method/Block give data inconsistency if multiple obj
 *                                              is created...(to overcome static syn. used...)
 *                      >   static synchronozed.....
 *                                       - class level lock..can be used for multiple objects..
 *                      
 *                      >   wait().....
 *                                  if any thread calls it, it causes the current thread to release the
 *                                  lock & wait until other thread invokes the notify() or notifyAll()
 *                                  method for this object, or a specified amount of time has elapsed...
 * 
 *                      >   notify().....
 *                                  it is used to wakeup a single thread and releases the object lock..
 * 
 *                      >   notifyAll().....
 *                                  it is used to wakeup all thread that r in waiting state...
 *  
 * 
 */

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
