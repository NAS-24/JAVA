package Constructors;

class MyMainEmployee{
    private int id;
    private String name;

     MyMainEmployee(){      //CONSTRUCTOR
        id = 0;
        name = "Your-Name-Here";
    }


    public String getName(){
        return name;
    }


    public int getId(){
        return id;
    }
}

public class con {
    public static void main(String[] args) {

        MyMainEmployee harry = new MyMainEmployee();

        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
