package Phase1.Round_1.Practice_Project;

import java.util.Scanner;

public class Calculator{
	Scanner sc = new Scanner(System.in);
	
	public void add()
	{
		int n,result=0;
		System.out.print("\n---------  Addition  ----------- \n");
		System.out.print("How many no. u want to Add : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i :arr)
		{
			result += i; 
		}
		System.out.println("Addition Result : > "+ result);
		
	}
	public void sub()
	{
		int a,b,result;
		System.out.print("\n---------  Subtraction  ----------- \nEnter the number  : ");
		a = sc.nextInt();
		b = sc.nextInt();
		result = a-b;
		System.out.println("Subtraction Result : > "+ result);
		
	}
	
	public void mul()
	{
		int n,result=1;
		System.out.print("\n---------  Multiplication  ----------- \n");
		System.out.print("How many no. u want to multiply : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i :arr)
		{
			result *= i; 
		}
		System.out.println("Multiplication Result : > "+ result);
		
	}
	public void div()
	{
		int a,b;
		float result;
		System.out.print("\n---------  Division  ----------- \nEnter the number  : ");
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			result = (float) a/b;
			System.out.println("Quotient > "+ result);
		}
		catch(Exception e)
		{
			System.err.println("error : "+ e);
		}
	}

	public static void main(String[] args) {
		
		int choice;
		try (Scanner sc = new Scanner(System.in)) {
            Calculator c = new Calculator();
            while(true)
            {
            	System.out.println("---------------------    Calculator    ---------------------\n");
            	System.out.println("- 1. Addition \n- 2. Subtraction \n- 3. Multiplication \n- 4. Division\n- 5. Exit");
            	System.out.print("\nChoose Operations : ");
            	choice = sc.nextInt();
            
            	switch(choice)
            	{
            		case 1:
            			c.add();
            			break;
            		case 2:
            			c.sub();
            			break;
            		case 3:
            			c.mul();
            			break;
            		case 4:
            			c.div();
            			break;
            		case 5:
            			 System.exit(0);
            		default:
            			System.out.println("Invalid Choice!choose option from the above..");
            	}
            }
        }
	}
	
}
