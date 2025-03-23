package Methods;

public class Method2 {           //METHOD OVERLOADING

    static void foo(){                   // It is void return type
        System.out.println("Good morning");
    }
    static void foo(int a){
        System.out.println("Good Afternoon "+a);
    }
    static void foo(int a,int b){
        System.out.println("Good evening "+a);
        System.out.println("Good night "+b);
    }

    public static void main(String[] args) {

        foo();                           // These are Arguments.
        foo(3000);
        foo(3000,4000);
    }
}
//Note:Argument is Actual.