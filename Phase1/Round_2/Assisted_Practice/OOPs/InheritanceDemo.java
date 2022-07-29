package Phase1.Round_2.Assisted_Practice.OOPs;
/* 
 *  Note : identify by  comment symbol...
 */
//--------------------		###############		Hybrid Inheritance	###############	...............

//----------------		Hierarchical Inheritance.......		-------------
abstract class Vehicle {
    int no_of_tyre;
    int speed = 200;

    public abstract void speed();

    public void show() {
        System.out.println("\t\t------------- Vehicle ----------");
    }

}

class Car extends Vehicle {
    public void speed() {
        System.out.println("\n-----------   Car  ---------------");
        System.out.println("The speed of car is : " + speed); // it inherits the speed from vehicle class..
    }
}

// ############################### Multilevel Inheritance  ##########################

// ............................... Single Inheritance ...................
class Bike extends Vehicle {

    public void speed() {
        speed = 140; // it inherits the speed from vehicle class..& re-initialize it..
        no_of_tyre = 2; // it inherits no_of_tyre var and we initialize it here..
        System.out.println("\n-----------   Bike  ---------------");
        System.out.println("The speed of Bike is : " + speed);
        System.out.println("No. of tyre : " + no_of_tyre);
    }

    public void show() {
        System.out.println("\t\t------------- Bike----------");
    }

}

// ---------- End Hierarchical Inheritance -------------

class Yamaha extends Bike {
    public void speed() {
        speed = 120;

        System.out.println("\n-----------   Yamaha Bike(extended from Bike) ---------------");
        super.show();
        System.out.println("The speed of car is : " + speed); // it inherits the speed from vehicle class..

    }

    public void show() {
        System.out.println("\t\t------------- Yamaha ----------");
    }
}

// .......... End Single Inheritance ...........

class Suzuki extends Yamaha {
    public void speed() {
        speed = 100;
        System.out.println("\n-----------   Suzuki Bike(extended from Yamaha) ---------------");
        super.show();
        System.out.println("The speed of car is : " + speed); // it inherits the speed from vehicle class..
    }
}

// ######### End Hybrid Inheritance ##########

// ------------ ############### Hybrid Inheritance ###############  ...................

public class InheritanceDemo {

    public static void main(String[] args) {

                // @@ Hybrid @@@@
        // Hierarchical.........
        Bike b = new Bike();
        b.speed();
        Vehicle c = new Car();
        c.speed();
                    // ..........(hierarchical)

        // ---- Multilevel...........
        // single......
        Bike y = new Yamaha();
        y.speed();
              // .........(single)

        Yamaha s = new Suzuki();
        s.speed();
                    // --------------(Multilevel)
        // @@@@(Hybrid)

    }
}
