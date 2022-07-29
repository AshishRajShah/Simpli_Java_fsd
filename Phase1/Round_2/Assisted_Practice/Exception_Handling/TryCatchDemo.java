package Phase1.Round_2.Assisted_Practice.Exception_Handling;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int a =5,b=0;
            int c = a/b;
            System.out.println(a+"/"+b+" = "+c);
        } catch (Exception e) {
            System.err.println("Error : "+e);
        }finally
        {
            System.out.println(" it will run always whether exception occure or not..");
        }
    }  
}
