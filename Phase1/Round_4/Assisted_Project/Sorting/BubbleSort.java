package Assisted_Project.Sorting;

import java.util.Scanner;

public class BubbleSort {
    Scanner sc = new Scanner(System.in);
    public void bubbleSort()
    {
        System.out.println("--------------      Bubble Sort       --------------------");
        System.out.print("Enter the no. of  array : "); // take size of array..
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array value : "); // insertion of array value...
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Logic...(adjacent column swap until big element reach at his last position..)

        for(int i=0; i<arr.length-1;i++)
        {
            for(int j=0; j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        // Display........
        System.out.print("\n- After sorting the array.... \n   > Sorted Array : ");
        for(int i : arr)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort();
    }
}
