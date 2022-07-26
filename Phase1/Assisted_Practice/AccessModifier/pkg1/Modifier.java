package Phase1.Assisted_Practice.AccessModifier.pkg1;

class DefaultModifier {
    int a; // here both class & instance var.has default Acees modifier..
}

class publicModifier {
    public String name; // name is a public access modifier
}

class privateModifier {
    private String number; // number is a private aceess modifier

}

class protectedModifier {
    protected String company; // company is protected aceess modifier
}

public class Modifier { // it's a public acess modifiers..

    int id;
    private String name; // it's a private access modifier
    public String cllg;
    protected static String location;
    
    public static void main(String[] args) 
    {
        // default.......
        DefaultModifier d = new DefaultModifier(); // default modifier is accessible in same pkg

        // public.......
        publicModifier pb = new publicModifier(); 
        pb.name = "akshay";                       // public modifier is accessible in same pkg

        // private........
        privateModifier pr = new privateModifier();
        // pr.number=40;                             // private modifier is not accessible in same pkg

        Modifier m = new Modifier();        //--- note... Modifier class private instance variable
        m.name ="akshay";                   // name is accesible only same class.. 

        // protected.......
        protectedModifier pro = new protectedModifier();
        pro.company ="Life";                 // protected modifier is accessible in same pkg
                            
    }
}
