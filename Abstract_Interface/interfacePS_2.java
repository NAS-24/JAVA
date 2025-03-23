package Abstract_Interface;

//Create a class Monkey with jump() and bite() methods.
// Create a class Human which inherits this Monkey class
// and implements BasicAnimal interface with eat() and sleep() methods.
//Demonstrate polymorphism using Monkey class



interface BasicAnimal {

    void eat();

    void Sleep();
}

    class Monkey{
        void jump(){
            System.out.println("Jumping....");
        }
        void bite(){
            System.out.println("Biting....");
        }
    }

    class Human extends Monkey implements BasicAnimal{
        public void eat(){
            System.out.println("Eating...");
        }
        public void Sleep(){
            System.out.println("Sleeping...");
        }
    }



public class interfacePS_2 {
    public static void main(String[] args) {
        Monkey M=new Human();
        M.jump();
//        M.Sleep(); Will give error due to Concept of Polymorphism.

        Human H=new Human();
        H.eat();
        H.bite();
    }
}
