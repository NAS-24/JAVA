package Exercise;
class Square{
    int side;
    public int SQ_area(){
        return side*side;
    } public int SQ_perimeter(){
        return 4*side;
    }
}
class rectangle{
    int length;
    int breadth;

    public int Rec_area(){
        return length*breadth;
    }
    public int Rec_perimeter(){
        return 2*(length+breadth);
    }

}



public class Class2 {
    public static void main(String[] args) {

        Square side=new Square();
        rectangle side2=new rectangle();

        //Square
        side.side=8;
        System.out.println("The area of square is "+side.SQ_area());
        System.out.println("THe perimeter of square is "+side.SQ_perimeter());

        //Rectangle
        side2.length=6;
        side2.breadth=4;
        System.out.println("The area of rectangle is "+side2.Rec_area());
        System.out.println("The perimeter of rectangle is "+side2.Rec_perimeter());
    }

}
