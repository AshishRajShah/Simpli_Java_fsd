package Phase1.Round_2.Assisted_Practice.OOPs;

//--------------------------------		Overloading		------------------------
// *	type the arguments..
// *    no. of arguments...
// *	Order of Parameters..

class OverloadingDemo {

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b;
	}

	public double sum(double a, double b) {
		return a + b;
	}

	public int sum(double a, int b) {
		return (int) a + b;				//typeCasting double to int...
	}
}

// ------------
//--------------------------------		Overriding		------------------------
class Human {
	public void walk() {
		System.out.println("Human can Walk...");
	}
}

class OverridingDemo extends Human {
	@Override
	public void walk() {								// override the parent class method here...
		System.out.println("All Living beings can breathe....");
	}

}

public class PolymorphismDemo {

	public static void main(String[] args) {

//--------------------------			Overloading......		
		OverloadingDemo pd = new OverloadingDemo();

		double r1 = pd.sum(5.2, 1.6);
		int r2 = pd.sum(5, 6);
		int r3 = pd.sum(5.1, 1);
		int r4 = pd.sum(5, 1, 6);
		System.out.println("-----------------------    Overloading   ---------------------");
		System.out.println("result r1 : " + r1);
		System.out.println("result r2 : " + r2);
		System.out.println("result r3 : " + r3);
		System.out.println("result r4 : " + r4);
		
//--------------------------			Overriding......
		OverridingDemo od = new OverridingDemo();
		System.out.println("\n-----------------------    Overriding   ---------------------");
		od.walk();
		

	}

}
