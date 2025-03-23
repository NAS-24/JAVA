package Advance;
/* WithOut Anonymous Class */
//@FunctionalInterface
//interface Animal{
//    void bark();
//}
//
//class Dog implements Animal{
//
//    @Override
//    public void bark() {
//        System.out.println("Dog barks!");
//    }
//}
//
//public class Annonymous{
//    public static void main(String[] args) {
//        Dog Bruno = new Dog();
//        Bruno.bark();
//    }
//}


//With Anonymous Class
@FunctionalInterface
interface Animal{
    void bark();
}

 public class Annonymous{
    public static void main(String[] args) {
        Animal Bruno = new Animal() {
            @Override
            public void bark() {
                System.out.println("Dog barks!");
            }
        };
        Bruno.bark();
    }
}
