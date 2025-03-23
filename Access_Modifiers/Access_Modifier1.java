package Access_Modifiers;


class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name=n;
    } public String getName(){
        return name;
    } public void setId(int n){
        id=n;
    } public int getId(){
        return id;
    }

}
public class Access_Modifier1 {
    public static void main(String[] args) {

        MyEmployee em1=new MyEmployee();
        //em1.id=23;               (These shows error as private access modifier is used and
        //em1.name=Naman;                  it cannot be accessed directly)

        em1.setName("ARYAN SINHA");
        System.out.println("The name is "+em1.getName());
        em1.setId(52);
        System.out.println("The id is "+em1.getId());
    }
}
