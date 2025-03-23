package Inheritance;

class Base{
     int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derived extends Base{  //"extends" keyword is used for INHERITANCE
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}



public class Inheritance {
    public static void main(String[] args) {
        derived d=new derived();
        d.setX(5);
        System.out.println("x is "+d.getX());  //As u can see X is not initialized or declared in derived class but is still can be accessed due to extend key word
        d.setY(10);
        System.out.println("Y is "+d.getY()); //Note:- Derived class can access base but base cannot access derived class.
    }
}
