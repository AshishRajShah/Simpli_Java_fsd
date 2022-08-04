package Assisted_Project;

import java.util.Scanner;

public class FourthSmallestElement {
    Scanner sc = new Scanner(System.in);

    public void fourthSmallest() {
        System.out.print("Enter the no. of  array : "); // take size of array..
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array value : "); // input value of array..
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) // now array is sorted...
        {
            for (int j = i + 1; j < n; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("Array is  : "); // array display...
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nthe Fourth Smallest number is : " + arr[3]);
    }

    public static void main(String[] args) {

        FourthSmallestElement fse = new FourthSmallestElement();
        fse.fourthSmallest();
    }
}
