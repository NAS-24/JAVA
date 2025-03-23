package Exercise;
//Setting radius and height using Constructor
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int r,int h){
        radius=r;
        height=h;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }

}
public class Construct_Cylinder {
    public static void main(String[] args) {
        Cylinder measure=new Cylinder(5,7);
        System.out.println("the radius of cylinder is "+measure.getRadius());
        System.out.println("the height of cylinder is "+measure.getHeight());

    }
}
