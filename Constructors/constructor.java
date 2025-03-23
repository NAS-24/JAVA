package Constructors;

//similar to method. constructor can be overloaded
class my2ndEmployee{
    private int id;
    private String name;

    public my2ndEmployee(){ //Constructor 1
        id=52;
        name="naman";
    }
    public my2ndEmployee(String myName,int myId){  //Constructor 2
        id=myId;
        name=myName;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

}
public class constructor {
    public static void main(String[] args) {

        my2ndEmployee x=new my2ndEmployee("Aryan",52);//if arguments are not given it will take values of Constructor 1


        //using constructor we can directly invoke values into private without using setId or set name method
        System.out.println(x.getId());
        System.out.println(x.getName());
    }
}