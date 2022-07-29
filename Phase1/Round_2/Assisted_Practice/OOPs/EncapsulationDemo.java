package Phase1.Round_2.Assisted_Practice.OOPs;

// ------------------------------       Encapsulation.......        -------------------
class Employee
{
    private int EmpID;                      // Data members..
    private String EmpName;

    public int getEmpID() {                 // member functions....
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public void get()                  
    {
        System.out.println("Employee id     : "+EmpID);
        System.out.println("Employee Name   : "+EmpName);
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {
        Employee e1 = new Employee();
    
        //setting the employee details.........
        e1.setEmpID(101);
        e1.setEmpName("Akshay");

        //getting the details of employee...
        System.out.println("Employee Id   : "+e1.getEmpID());
        System.out.println("Employee Name : "+e1.getEmpName());
    }

    
}
