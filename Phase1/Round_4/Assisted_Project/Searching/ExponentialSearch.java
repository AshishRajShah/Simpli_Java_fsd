package Assisted_Project.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {
    Scanner sc = new Scanner(System.in);

    public void exponentialSearch() {
        System.out.println("--------------      Exponential Search       --------------------");
        System.out.print("Enter the no. of  array : "); // take size of array..
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array value : "); // insertion of array value...
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Search element : "); // searching key element
        int key = sc.nextInt();

        // Sorting the array to implement binary or exponential search...
        Arrays.sort(arr);

        // Searching algorithm...
        if (arr[0] == key)
            System.out.println("Element " + key + " found in the list....");
        else {
            int j = 1;
            while (j < n && arr[j] <= key) {
                j *= 2; // exponential strategy...
            }

            // binary search...
            int start = j / 2, end = n, mid = 0, flag = 0;
            for (int i = j / 2; i < n; i++)
                while (start <= end) {
                    // mid = (start + end) / 2;
                    mid = start + (end-start)/ 2;

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
    }

    public static void main(String[] args) {
        ExponentialSearch es = new ExponentialSearch();
        es.exponentialSearch();
    }
}
