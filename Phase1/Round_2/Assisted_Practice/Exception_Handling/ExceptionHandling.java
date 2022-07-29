package Phase1.Round_2.Assisted_Practice.Exception_Handling;

import java.util.Scanner;

// -------------------------------      Atm Withdrawal      -----------------------

//--- Create Custom Exception......
class InsufficientBalException extends Exception {

    public InsufficientBalException(String s) {
        super(s);
    }
}

// --- Check Sufficient balance ...........
class AmountWithdraw {
    static int bank_amount = 10000; // static method used..to reflect changes if happen..

    public void moneyDebit(int money) throws InsufficientBalException { // throws use...
        if (money <= bank_amount) {
            System.out.println("withraw money Successfully.....");
            bank_amount -= money;

        } else {
            throw new InsufficientBalException("Insufficient Balance....."); // throw use..
        }
    }
}

public class ExceptionHandling {

    public static void main(String[] args) {

        AmountWithdraw aw = new AmountWithdraw();

        try (Scanner sc = new Scanner(System.in)) // try-catch block....
        {
            System.out.println("------------------     WELCOME TO HDFC ATM      -------------");
            System.out.println("Enter the Withdraw amount : ");
            int money = sc.nextInt();
            aw.moneyDebit(money);
        } catch (Exception e) {
            System.err.println("error ! : " + e);
        } finally                   // finally used whether money debited or not show remaining price..
        { 
            System.out.println("Your Bank balance is  : " + AmountWithdraw.bank_amount);
        }

    }

}
