package Exercise; //Percent Calculator out of 5 subjects
import java.util.Scanner;
        public class PercentCal {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Total Maximum Marks:");
                int max=sc.nextInt();
                System.out.println("Enter Your Marks:");
                System.out.print("English");
                float E=sc.nextFloat();
                System.out.print("Maths");
                float M=sc.nextFloat();
                System.out.print("Hindi");
                float H=sc.nextFloat();
                System.out.print("Science");
                float S=sc.nextFloat();
                System.out.print("Marathi");
                float MA=sc.nextFloat();

                float percent=((E+M+H+S+MA)/max)*100;
                System.out.println("The percent you got is:");
                System.out.println(percent);






            }
}
