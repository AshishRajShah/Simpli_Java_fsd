package Phase1.Round_2.Assisted_Practice.OOPs;

// -------------------------        Class And Object        ------------------------

class Student               // class - It is a blueprint...
{
    private int rollNo;
    private String name;

    Student(int rollNo, String name)        // constructor...used to initializes the data member....
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void studentDetails()        // public used to access private data member...
    {
        System.out.println("Student Roll No. is : "+rollNo);
        System.out.println("Student Name is     : "+name);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        
        Student s1 = new Student(101, "Akshay");     // s1 & s2 r two object of student class..
        Student s2 = new Student(102, "Raj");

        System.out.println("-------------   Details of Student 1    ------------");
        s1.studentDetails();
        System.out.println("-------------   Details of Student 2    ------------");
        s2.studentDetails();
    }


    
    
}
