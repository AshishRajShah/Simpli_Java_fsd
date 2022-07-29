package Phase1.Round_2.Assisted_Practice.Exception_Handling.Throws_Custom_Exception;

// -------------------------------      Voting Age      -----------------------

//--- Create Custom Exception......
class InvalidAgeException extends Exception {

    public InvalidAgeException(String s) {
        super(s);
    }
}

// --- Check Valid Age...........
class AgeValidation {
    public void validAge(int age) throws InvalidAgeException {
        if (age >= 18) {
            System.out.println("Valid Age for voting...");
        } else {
            throw new InvalidAgeException("Invalid age for voting...");
        }
    }
}

public class CustomException {
    public static void main(String[] args) throws InvalidAgeException //(throwws) exception could occur in it.
    {
        AgeValidation av = new AgeValidation();
        av.validAge(20);
    }
}
