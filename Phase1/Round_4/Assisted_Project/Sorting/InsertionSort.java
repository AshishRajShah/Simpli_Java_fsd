package Assisted_Project.Sorting;

import java.util.Scanner;

public class InsertionSort {
    Scanner sc = new Scanner(System.in);

    public void insertionSort() {
        System.out.println("--------------      Insertion Sort       --------------------");
        System.out.print("Enter the no. of  array : "); // take size of array..
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array value : "); // insertion of array value...
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // logic.....
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        
        // Display........
        System.out.print("\n- After sorting the array.... \n   > Sorted Array : ");
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        InsertionSort ss = new InsertionSort();
        ss.insertionSort();
    }
}
