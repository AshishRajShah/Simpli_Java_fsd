package Assisted_Project;

import java.util.Scanner;

public class MultiplyMatrices {
    Scanner sc = new Scanner(System.in);

    public void multiply() {
        System.out.print("--------------  Array 1 -----------------\n> row size : ");
        int r = sc.nextInt();
        System.out.print("\n>col size : ");
        int c = sc.nextInt();
        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];
        int arr3[][] = new int[r][c];

        System.out.println("Enter the value of array 1 : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the value of array 2 : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < c; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.print(arr3[i][j] + " "); 
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {

        MultiplyMatrices mm = new MultiplyMatrices();
        mm.multiply();
    }

}
