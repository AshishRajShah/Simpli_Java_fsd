package Phase1.Round_1.Assisted_Practice;

class Employee
{
	Employee()			//--- default constructor...
	{
		System.out.println("Hello Akshay...");
	}
	
	Employee(int id)	//---- parameterized  constructor..
	{
		System.out.println("Your employee id is ..." + id);
	}
}

public class Constructors{
	
	public static void main(String[] args) 
    {
        		
		Employee e = new Employee();
		Employee em = new Employee(13);
		
	}

}