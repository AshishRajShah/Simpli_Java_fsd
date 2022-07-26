package Phase1.Assisted_Practice;

abstract class AnonymousInnerCls
{
  public abstract void display() ;

}

class Student
{
    int Roll_no;
    String name;

    Student(int Roll_no, String name)       //constructor....
    {
        this.Roll_no = Roll_no;
        this.name = name;
    }

    public void show()
    {
        System.out.println("Student Roll no. is : "+ Roll_no);
        System.out.println("Student Name is     : "+ name);
    }

    class InnerClass            //----inner class...(Student$InnerClass.class)
    {
        int company_id ;

        InnerClass(int company_id)
        {
            this.company_id = company_id;
        }

        public void show()
        {
            System.out.println("\nCompany id of the student is : "+ company_id);
        }
    }

}

public class InnerClassDemo {
    public static void main(String[] args) {

        Student s = new Student(1319709,"Akshay");
        s.show();

        //for Call inner class...
        Student.InnerClass in = s.new InnerClass(2110);
        in.show();

        //-----------       Anonymous Inner Class...
        AnonymousInnerCls ac = new AnonymousInnerCls() {
            public void display()
            {
                System.out.println("|t-------- Anonymous Inner Class  -----------");
            }
        };
        ac.display();
      
        
    }
}



