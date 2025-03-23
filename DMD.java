//Dynamic Method Dispatch



class Phone{
    public void on(){
        System.out.println("Turning on Phone....");
    }
    public void greet(){
        System.out.println("Good Morning");
    }

} class SmartPhone extends Phone{
    public void on(){
        System.out.println("Turning on SmartPhone....");
    }
    public void music(){
        System.out.println("Playing Music");
    }
}
public class DMD {
    public static void main(String[] args) {

        Phone obj=new SmartPhone(); //Allowed
        //SmartPhone obj=new Phone(); Not Allowed

        obj.on(); //SmartPhones Method "on" will print as it overrides Phones "on".
        //obj.music(); Not Allowed because reference is of Phone
        obj.greet();
    }
}






