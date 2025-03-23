package Abstract_Interface;

abstract class parent {
    // Abstract class: Cannot be instantiated directly.
    public parent() {
        System.out.println("Constructor of parent");
    }

    // Abstract method: Any subclass must implement this method.
    abstract public void greet();
}

class base extends parent {
    // Concrete implementation of the abstract method from 'parent' class.
    public void greet() {
        System.out.println("Namaskaram");
    }
}

abstract class base2 extends parent {
    // This class does not implement the abstract 'greet' method from 'parent',
    // so it's marked as abstract. It can still have concrete methods.

    public void method() {
        System.out.println("No greetings");
    }
}

public class absClass {
    public static void main(String[] args) {
        // Abstract classes cannot be instantiated directly.
        // parent p = new parent(); // Error: parent is abstract.

        // Similarly, 'base2' is abstract and cannot be instantiated.
        // base2 b2 = new base2(); // Error: base2 is abstract.

        // Instantiating 'base' class, which provides the implementation of 'greet'.
        base b = new base();
        b.greet(); // Calls the implemented 'greet' method.
    }
}

