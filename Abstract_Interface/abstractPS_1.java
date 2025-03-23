package Abstract_Interface;

//Create an abstract class Pen with methods write() and refill() as abstract methods.
//Use the Pen class from Q1 to create a concrete class FountainPen with additional method changeNib().

 abstract class Pen{

    abstract public void Write();
    abstract public void Refill();
}
class FountainPen extends Pen{

    public void ChangeNib(){
        System.out.println("Changing Nib.....");
    }
     public void Write(){
         System.out.println("Writing.....");
     }
    public void Refill(){
        System.out.println("Refilling.....");
    }
}

public class abstractPS_1 {
    public static void main(String[] args) {

          FountainPen fp=new FountainPen();
          fp.ChangeNib();
          fp.Write();
          fp.Refill();
    }
}
