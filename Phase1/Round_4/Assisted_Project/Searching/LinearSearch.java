package Assisted_Project.Searching;

import java.util.Scanner;

public class LinearSearch {
    Scanner sc = new Scanner(System.in);
    public void linearSearch()
    {
        System.out.println("--------------      Linear Search       --------------------");
        System.out.print("Enter the no. of  array : ");         // take size of array..
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the array value : ");         // insertion of array value...
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the Search element : ");      // searching key element
		int search = sc.nextInt();

        // Searching algorithm...
		for (int i = 0; i < n; i++) {

			if (arr[i] == search) {
				System.out.println("Element " + search + " is found at index " + i);
				break;
			}
		}
    }
    
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        ls.linearSearch();
    }
    
}
