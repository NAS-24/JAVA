package Access_Modifiers;

class circle{
    private float radius;
    private float area;

    public void setRadius(float r){
        radius=r;
    }
    public float getRadius() {
        return radius;
    }public void setArea(float a){
        area=3.14f*radius*radius;
        if(area==a){
            System.out.println("The area is "+area);
        } else {
            System.out.println("The area is incorrect");
        }
    }


}
public class Access_Modifier2 {
    public static void main(String[] args) {

        circle Ci=new circle();

        Ci.setRadius(5);
        System.out.println("The radius is "+Ci.getRadius());
        Ci.setArea(78.5f); //Similar way can be used for circumference

    }
}
