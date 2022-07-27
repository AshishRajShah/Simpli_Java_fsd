package Phase1.Assisted_Practice;

class MthdOverride {
    public void display(String s) {
        System.out.println("it's a : " + s);
    }
}

public class MethodsDemo extends MthdOverride {

    public void introOfMethod() // (methods : function which r in a class)
    {
        System.out.println("-----------     Methods Ways Of Calling..      --------- \n");
    }

    // ------ method Overloading.. --------------
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b;
    }
    // ------------ End

    // ----------- method Overriding.. ------------
    @Override
    public void display(String s) {
        System.out.println("it's a  : " + s);
    }
    // ------------ End

    public static void main(String[] args) {

        MethodsDemo md = new MethodsDemo();
        md.introOfMethod(); // normal method

        // ------ method Overloading.. --------------

        int sum = md.sum(5, 6); // Call by value....
        int sum1 = md.sum(5, 6, 7);
        System.out.println("\n---------- Method Overloading ........");
        System.out.println("Call By Value........\n");
        System.out.println("The sum of 5 & 6 is : " + sum);

        System.out.println("The sum of 5,6,7 is : " + sum1);

        // ------ method Overriding.. --------------
        System.out.println("\n----------    ---Method Overriding ........     ---------");
        System.out.println("MthdOverride Class display.....");
        MthdOverride mo = new MthdOverride();
        mo.display("Normal method");

        System.out.println("\nMethodsDemo Class display......");
        md.display("Method Overriding");

    }
}
