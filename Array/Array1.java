package Array;

public class Array1 {
    public static void main(String[] args) {


         //Declaration and memory allocation
        // int[] marks=new int[5];

        //Declaration and then memory allocation
        int[] marks;
        marks=new int[5];
        //initialisation
        marks[0]=10;
        marks[1]=34;
        marks[2]=23;
        marks[3]=76;
        marks[4]=20;
        System.out.println(marks[4]);
        System.out.println(marks.length); //Length printing


        //Declaration,memory allocation and Initialisation (TOGETHER)
        int[] variable={10,34,35,23,76};
        System.out.println(variable[3]);

        //For strings
        String[] Names={"Naman","Aryan","LTCE","ARRAY"};
        System.out.println(Names[2]);

    }
}
