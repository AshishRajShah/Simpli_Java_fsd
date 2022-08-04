package Assisted_Project.Sorting;

import java.util.Scanner;

public class MergeSort {
    static Scanner sc = new Scanner(System.in);

    public void divide(int arr[], int lb, int ub) {
      
        if (lb < ub) {
           int mid = lb + (ub - lb) / 2;
            divide(arr, lb, mid);
            divide(arr, mid + 1, ub);
            conquer(arr, lb, mid, ub);
        }
    }

    public void conquer(int arr[], int lb, int mid, int ub) 
    {
        int[] b = new int[ub-lb+1];
        int i = lb, k = 0, j = mid + 1;

        while (i <= mid && j <= ub) {
            if (arr[i] >= arr[j]) {
                b[k] = arr[j];
                j++;
            } else {
                b[k] = arr[i];
                i++;
            }
            k++;
        }

        if (i > mid) {
            while (j <= ub) {
                b[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while(i<=mid){
                b[k] = arr[i];
                i++;
                k++;
                
            };
        }

        for(int m=lb; m<=ub;m++)
        {
            arr[m] = b[m];
        }   

    }

    public void mergeSort(int[] arr, int lb, int ub) {

        divide(arr, lb, ub);

    }

    public static void main(String[] args) {
        System.out.println("--------------      Merge Sort       --------------------");
        System.out.print("Enter the no. of  array : "); // take size of array..
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array value : "); // insertion of array value...
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lb = 0, ub = n - 1;
        MergeSort ms = new MergeSort();
        ms.mergeSort(arr, lb, ub);
      

        for(int a : arr)
        {
            System.out.print(a+" ");
        }
    }
}
