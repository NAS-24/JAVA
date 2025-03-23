package Abstract_Interface;

interface Bicycle {
    // Interface methods are public and abstract by default.
    int a=45;  //You Can create Properties in Interface.
    void speedUp(int increment);
    void Brake(int decrement);
}
interface Vehicle {   //Multiple Interface methods can be created.
    // Interface methods are public and abstract by default.
    void crash();
    void safe();
}

class AvonCycle implements Bicycle,Vehicle{ //NOTE:- Multiple interface methods can be implemented.
    int speed = 7;

    public void random(){
        System.out.println("A random method , Not a part of interface.");
    }

    // Must declare methods as public when implementing an interface.
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void Brake(int decrement) {
        speed = speed - decrement;
    }

    public void crash(){
        System.out.println("Call Ambulance");
    }

    public void safe(){
        System.out.println("Continue Riding");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.random();
        // Example usage:
        ac.speedUp(5);
        System.out.println("Speed after speeding up: " + ac.speed);
        ac.Brake(3);
        System.out.println("Speed after braking: " + ac.speed);
        ac.crash();
        ac.safe();

        System.out.println(ac.a);

    // ac.a=454; NOTE:- You cannot change the properties as they are final by default i.e. CONSTANT
    }
}
