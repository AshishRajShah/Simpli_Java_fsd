package Phase1.Round_2.Assisted_Practice.OOPs;

abstract class Person {             // abstract class....
    public abstract void run();

    public void walk() {
        System.out.println("All person can walk..");
    }
}

class Man extends Person {          
    @Override                       // override abstract method by defining here...
    public void run() {             
        System.out.println("Any man can Run....");
    }

    public void write() {
        System.out.println("");
    }

}

public class AbstractionDemo {

    public static void main(String[] args) {
        Man p = new Man();                  // object creation.....
        System.out.println("Man Inherit Person Characteristics.... ");
        p.walk();
        p.run();
        p.write();
    }
}
