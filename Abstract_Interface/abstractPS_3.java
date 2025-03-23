package Abstract_Interface;

//Create a class Telephone with ring(), lift(), and disconnect() methods as abstract methods.
// Create another class SmartTelephone and demonstrate polymorphism.

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
     void ring(){
         System.out.println("Ringing...");
     }
    void lift(){
        System.out.println("Picking Up...");
    }
    void disconnect(){
        System.out.println("disconnecting...");
    }
    void blast(){
        System.out.println("Boooom....");
    }
}

public class abstractPS_3 {
    public static void main(String[] args) {
        Telephone tel=new SmartTelephone();
        tel.lift();

        SmartTelephone st=new SmartTelephone();
        st.blast();
    }
}
