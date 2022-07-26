package Phase1.Assisted_Practice;

import java.util.Scanner;

public class TypeCasting {
	
	public void implicit_conversion(int a)		//--- member function
	{
		System.out.println("Here integer is converted into double..(by implicit/widening conversion.)");
		double a_chng = a;					//--- implicit typeCasting
		System.out.println("double value : "+ a_chng);
	}
	
	public void explicit_conversion(int a)
	{
		System.out.println("Here integer is converted into char..(by explicit/Narrowing conversion.)");
		char a_chng = (char) a;				// explicit typeCasting
		System.out.println("Char value : "+ a_chng);
	}
	
	public static void main(String[] args) {
		
		int n,choose;
		Scanner sc = new Scanner(System.in);		// for taking input we used scanner..
		TypeCasting tc = new TypeCasting();		// creation of  object
		
		System.out.print("Enter the integer no. : ");
		n = sc.nextInt();
		
		System.out.println("Which type of typeCasting do u want to perform : ");
		System.out.println("1. Implicit typeCasting");
		System.out.println("2. Explicit typeCasting");
		System.out.print(">");
		choose = sc.nextInt();
		
		switch(choose)			// switch case...
		{
			case 1:
				tc.implicit_conversion(n);
				break;
			case 2:
				tc.explicit_conversion(n);
				break;
			default:
				System.out.println("invalid input");
		}
		sc.close();				
	}
}
