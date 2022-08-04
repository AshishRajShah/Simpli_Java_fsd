package Assisted_Project;

import java.util.Scanner;

public class QueueDemo {

    static Scanner sc = new Scanner(System.in);
    int front = -1;
    int rear = -1;

    // insert the element....
    public void enqueue(int[] a) {
        if (rear == a.length - 1) // overflow condition...
        {
            System.out.println("Queue is full...");
        } else {
            System.out.print("Insert the Element : ");
            int s = sc.nextInt();
            front = 0;
            rear++;
            a[rear] = s;
        }

    }

    // delete the element from top...
    public void dequeue(int[] a) {
        if ((front == -1 && rear == -1) || front > rear) // underflow condition...
        {
            System.out.println("Queue is Empty so now deletion allowed...");
        } else {
            front++;
        }
    }

    // check queue is Empty or not.....
    public void isEmpty(int[] a) {
        if ((front == -1 && rear == -1) || front > rear) {
            System.out.println("True! your Queue is Empty..");
        } else {
            System.out.println("False! your Queue is not Empty..");
        }

    }

    // queue display.....
    public void display(int a[]) {
        if ((front == -1 && rear == -1) || front > rear) {
            System.out.println("Queue is Empty..");
        } else {
            System.out.println("your Queue elemenmts are : ");
            for (int i = front; i <= rear; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        QueueDemo qd = new QueueDemo();

        System.out.print("enter the size of the Queue : ");
        int size = sc.nextInt();
        int queue[] = new int[size];

        // -------- loop for infinite..round of operations..
        while (true) {
            System.out.println("\n------------    Queue Operation  -----------------");
            System.out.print("1. Enqueue\n2. Dequeue\n3. isEmpty\n4. Display\n5. Exit\n> ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    qd.enqueue(queue);
                    break;
                case 2:
                    qd.dequeue(queue);
                    break;
                case 3:
                    qd.isEmpty(queue);
                    break;
                case 4:
                    qd.display(queue);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Oops! Invalid Option..");
            }
        }
    }

}
