package Assisted_Project;

import java.util.Scanner;

public class StackDemo {
    static Scanner sc = new Scanner(System.in);
    int top = -1;

    // insert the element....
    public void push(int[] a) {
        if (top == a.length - 1) // overflow condition...
        {
            System.out.println("Stack is full...");
        } else {
            System.out.print("Insert the Element : ");
            int s = sc.nextInt();
            top++;
            a[top] = s;
        }

    }

    // delete the element from top...
    public void pop(int[] a) {
        if (top == -1) // underflow condition...
        {
            System.out.println("Stack is Empty so now deletion allowed...");
        } else {
            top--;
        }
    }

    // check stack is Empty or not.....
    public void isEmpty(int[] a) {
        if (top == -1) {
            System.out.println("True! your Stack is Empty..");
        } else {
            System.out.println("False! your Stack is not Empty..");
        }

    }

    // stack display.....
    public void display(int a[]) {
        if (top == -1) {
            System.out.println("Stack is Empty..");
        } else {
            System.out.println("your stack elemenmts are : ");
            for (int i = top; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        StackDemo sd = new StackDemo();

        System.out.print("enter the size of the stack : ");
        int size = sc.nextInt();
        int stack[] = new int[size];

        // -------- loop for infinite..round of operations..
        while (true) {
            System.out.println("\n------------    Stack Operation  -----------------");
            System.out.print("1. Push\n2. Pop\n3. isEmpty\n4. Display\n5. Exit\n> ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    sd.push(stack);
                    break;
                case 2:
                    sd.pop(stack);
                    break;
                case 3:
                    sd.isEmpty(stack);
                    break;
                case 4:
                    sd.display(stack);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Oops! Invalid Option..");
            }
        }
    }
}
