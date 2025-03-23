package Inheritance;

class A{
    public void meth1(){
        System.out.println("Method 1 of class A");
    }

        }
class B extends A{
    @Override
    public void meth1(){      //This is known as method overriding
        System.out.println("Method 1 of class B");
    }
    //Note:- If parameters are put under meth1 than it will become method overloading
}

public class Method_Overriding {
    public static void main(String[] args) {

        A a=new A();
        a.meth1();

        B b=new B();  //Logically it should also print method in class A but due to method Overriding it only prints meth1 in its class.
        b.meth1();
    }
}





