package Assisted_Project.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    Scanner sc = new Scanner(System.in);

    public void binarySearch() {
        System.out.println("--------------      Binary Search       --------------------");
        System.out.print("Enter the no. of  array : "); // take size of array..
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array value : "); // insertion of array value...
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Search element : "); // searching key element
        int key = sc.nextInt();

        // Sorting the array to implement binary search...
        Arrays.sort(arr);

        // Searching algorithm...
        int start = 0, end = n, mid = 0, flag = 0;
        for (int i = 0; i < n; i++) 
        while(start<=end){
            mid = (start + end) / 2;

            if (arr[mid] == key) {
                flag = 1;
                break;
            } else if (arr[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }
        if (flag == 1)
            System.out.println("Element " + key + " found in the list....");
        else
            System.out.println("Element not found in the list...");
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        bs.binarySearch();
    }

}
