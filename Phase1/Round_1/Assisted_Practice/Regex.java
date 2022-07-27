package Phase1.Round_1.Assisted_Practice;

//          ---------------------           Valid Name Check       -------------------
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String name;
            String regex = "[a-z A-Z]+";
            System.out.println(" ------------       Valid Name Check    -----------\n");
            System.out.print("Enter a name : ");
            name = sc.nextLine();

            Pattern p = Pattern.compile(regex); // compile the regex pattern..

            Matcher match = p.matcher(name); // match name with regex pattern..

            if (match.matches()) // it return true/false a/c to match result..
            {
                System.out.println("Hello " + name + ", your name is valid..");
            } else {
                System.out.println("Please enter valid name...");
            }
        }
    }
}
