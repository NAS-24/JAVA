package Abstract_Interface;

//Create an interface TVRemote and use it to inherit another interface SmartTVRemote.
//Create a class TV which implements TVRemote interface

interface SmartTvRemote{
    void music();
    void ott();
}

interface TVremote extends SmartTvRemote{
    void on();
    void off();
}

class TV implements TVremote{
    public void on(){
        System.out.println("Switching On....");
    }
    public void off(){
        System.out.println("Switching off....");
    }
    public void music(){
        System.out.println("Play Music....");
    }
    public void ott(){
        System.out.println("Switching On Netflix....");
    }
}

public class interfacePS_4 {
    public static void main(String[] args) {
        TV tv=new TV();
        tv.on();
        tv.ott();
    }
}
