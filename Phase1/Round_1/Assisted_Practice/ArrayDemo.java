package Phase1.Round_1.Assisted_Practice;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        //-----------------------  Single dimensional array.....    ------------------
        // Array declaration & initialization.....
        int a[] = new int[5];
        /*
         * or,
         * int b[] = {1,2,3,4,5}
         * 
         */
                    // ---------- Array input...
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------  single dimensional Array  -----------------");
        System.out.println("Enter 5 no. : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

                    // ---------- Array display...
         System.out.print("Your number is  : ");
         for (int i : a) {
             System.out.print(i + " ");
         }

        //-----------------------  Multi dimensional array.....    ------------------

        // Array declaration & initialization.....
        int b[][] = new int[2][3];

        int r,c;
        System.out.println("\n--------------  Multi dimensional Array  -----------------");
        System.out.print("Enter in how many row & column u want to perform operation  : ");
        r = sc.nextInt();
        c = sc.nextInt();

        System.out.println("Enter row & column value : ");
        for (int i = 0; i<r; i++) 
        {
            for(int j=0; j<c; j++)
            {
                b[i][j]= sc.nextInt();
            }
        }

        // ---------- Array display...
        System.out.print("Your number is  : ");
        for (int l[] : b) 
        {
            for(int m : l)
            {
                System.out.print(m + " ");
            }
            
        }

        sc.close();
    }
}
