package Phase1.Practice_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    public static void main(String[] args) {

        // ----------- ArrayList of Employee_email_Id.... --------

        List<String> email = new ArrayList<>();
        email.add("akshayraj@gmail.com");
        email.add("starpandey1998@gmail.com");
        email.add("asishraj@gmail.com");
        email.add("sonu18@gmail.com");
        email.add("akshra09_5@gmail.com");
        email.add("dinesh_kr.98@gmail.com");

        try (Scanner sc = new Scanner(System.in)) {

            // ------- take email input by user..........
            String emailId;
            System.out.print("Enter Employee EmailId : ");
            emailId = sc.next();

            // ------------ Check Email Validation --------------
            String regex = "[a-zA-z0-9_.-]+[@][a-z]+[.][a-z]{2,3}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(emailId);

            if (matcher.matches()) {
                System.out.println("\nValidation check...");
                System.out.println("\tyour email id is valid...\n");
                System.out.println("processing for search email from the db....\n");

                // ---------- Check email_id is available or not.........
                for (Object em : email) {

                    if (email.contains(emailId)) {
                        System.out.println("Your Company email Id  - \'" + em + "\' found !");
                        break;
                    } else {
                        System.out.println("Email Not found ! In the database...");
                        break;
                    }
                }
            } else {
                System.out.println("please enter valid email id...");
            }
        }
    }
}
