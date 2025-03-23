package Inheritance;

class base1{
    base1(){
        System.out.println("I am a constructor in base1");
    }
    base1(int a){
        System.out.println("I am an overloaded constructor with value of a as "+a);
    }
}
class derived1 extends base1{
    derived1(){
        System.out.println("I am a constructor in derived1");
    }
    derived1(int a,int b){
        super(a);                           //This super keyword is used to call constructor with parameter from parent class.
        System.out.println("an overloaded constructor with value of a and b as "+a+" "+b);
    }

}
class derived2 extends derived1{
    derived2(){
        System.out.println("I am a constructor in derived2");
    }
    derived2(int a,int b,int c){
        super(a,b);
        System.out.println("derived2 constructor ith values "+a+" "+b+" "+c);
    }
}



//uncomment the below comments one at a time to understand the code.
    public class Constructor_in_Inheritance {
        public static void main(String[] args) {
            //base1 b=new base1();
            //derived1 d=new derived1();
            //derived2 d=new derived2();
            //base1 b=new base1(5);
            //derived1 d=new derived1(5,10);
            //derived2 d=new derived2(5,10,15);
        }
    }

