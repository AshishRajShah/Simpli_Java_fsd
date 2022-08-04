package Assisted_Project;

import java.util.Scanner;

public class SumOfElements {

    public int sum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfElements soe = new SumOfElements();
        System.out.println("--------------      Sum Of Elements in Range....    ---------------");
        System.out.print("Enter the start range : ");
        int st = sc.nextInt();
        System.out.print("Enter the end range : ");
        int ed = sc.nextInt();

        int sum = soe.sum(ed) - soe.sum(st - 1);
        System.out.println("Sum of elements in Range L(" + st + ") to R(" + ed + ") is : " + sum);

        sc.close();
    }
}
