package Exercise;
class cylinder{
    private int radius;
    private int height;



    public void setRad(int r){
        radius=r;
    } public int getRad(){
        return radius;
    }
    public void setHeight(int h){
        height=h;
    } public int getHeight(){
        return height;
    }
    public double SA(){
        return 2*3.14*radius*height+2*3.14*radius*radius;
    }
    public double Vol(){
        return height*Math.PI*radius*radius;  //to get even more accurate value we can use Math.PI instead of 3.14
    }


}
public class getset_Cylinder {
    public static void main(String[] args) {
        cylinder measure=new cylinder();
        measure.setRad(5);
        measure.setHeight(7);
        System.out.println("The radius of cylinder is "+measure.getRad());
        System.out.println("The height of cylinder is "+measure.getHeight());
        System.out.println("The Surface area of of cylinder is "+measure.SA());
        System.out.println("The Volume of of cylinder is "+measure.Vol());
 // Using similar way we can find values of different shapes.
    }
}
