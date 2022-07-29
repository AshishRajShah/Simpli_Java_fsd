package Phase1.Round_2.Assisted_Practice;
/*      `   -------------------------     Diamond Problem     ---------------------
 *  >   Problem     :
 *                when one class inherit two parent class and they have same function name then & if
 *                they r called in child class. then the compiler goes confused..and it creates 
 *                ambuiguity in the program..And this is called diamond problem..
 * 
 *  >   Solution    :
 *                  Create same name function in the child class. which r in parent class.
 *                  or,     >   use     -   ClassName/Interface.super.functionName()    
 *          
 *              Note :- 
 *                      Multiple inheritance is not supported in java. so we use interface
 *                      & try to resolve it..
 */

interface Flash {
    default public void speciality() // default method is available in interface..(not abstract method.)
    {
        System.out.println("- Flash has super speed running power...");
    }
}

interface Superman {
    default public void speciality() {
        System.out.println("- Superman has physical & flying power...");
    }
}

public class DiamondProblem implements Flash, Superman {
    public void speciality() // to avoid ambiguity create same as interface name function..
    {
        System.out.println("------------    Diamond Problem     ------------\n");
        System.out.println("Now You are ready to get SuperHero Power...");
        Flash.super.speciality(); // it will call Flash interface method...
        Superman.super.speciality(); // it will call Superman interface method...
        System.out.println("\nCongrats! now you have become a Superhero...");
    }

    public static void main(String[] args) {

        DiamondProblem dp = new DiamondProblem();
        dp.speciality();

    }
}
