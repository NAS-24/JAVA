package Exercise;

class Employee{
    int salary;
    String name;

   public int salary() {
       return salary;

   } public String getName(){
       return name;

    } public void setName(String n){
       name=n;
    }
}

public class Class1 {
    public static void main(String[] args) {

        Employee EM1=new Employee();
        EM1.salary=100;
        EM1.setName("Naman");
        System.out.println("the name is "+EM1.getName());
        System.out.println("the salary is "+EM1.salary());
    }
}
