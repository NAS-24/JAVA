class Employee{           //class of employee(written before "public class CLASS" )
    int id;                          //id,salary,name are Attribute inside employee class
     int salary;
     String name;

    public void printdetails(){     //Void return method (nothing will be returned)
        System.out.println("The name of employee is "+name);
        System.out.println("The id is "+id);

    }
    public int getsalary(){   //data type return method
        return salary;
    }
}



public class CLASS {
    public static void main(String[] args) {

        Employee EM1=new Employee();   //Instantiation of new employee object
        Employee EM2=new Employee();   //Instantiation of new employee object

        //Setting attributes for EM1
        EM1.id=52;
        EM1.salary=10;
        EM1.name="Naman";

        //Setting attributes for EM2
        EM2.id=21;
        EM2.salary=10;
        EM2.name="Aryan";

        //Instead of writing sout and printing each and every detail individually void method is used.
        EM1.printdetails();  //recalling void return type method
        EM2.printdetails();  //recalling void return type method

        System.out.println("The salary of EM1 is "+EM1.getsalary()); //recalling int return method
        System.out.println("The salary of EM2 is "+EM2.getsalary()); //recalling int return method
    }
}
