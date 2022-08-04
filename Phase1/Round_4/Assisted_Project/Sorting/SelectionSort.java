package Assisted_Project.Sorting;

import java.util.Scanner;

public class SelectionSort {
    Scanner sc = new Scanner(System.in);

    public void selectionSort() {
        System.out.println("--------------      Selection Sort       --------------------");
        System.out.print("Enter the no. of  array : "); // take size of array..
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array value : "); // insertion of array value...
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }
        // Logic...(choose smallest and put to its position.....)
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int tmp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = tmp;
        }

        // Display.....
        System.out.print("\n- After sorting the array.... \n   > Sorted Array : ");
        for (int i : arr)
            System.out.print(i + " ");

    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        ss.selectionSort();
    }

}
