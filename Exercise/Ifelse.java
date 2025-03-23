package Exercise;
import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Marks is out of 100
        System.out.println("Enter your marks of subject 1");
        int s1=sc.nextInt();
        System.out.println("Enter your marks of subject 2");
        int s2=sc.nextInt();
        System.out.println("Enter your marks of subject 3");
        int s3=sc.nextInt();
        float avg=((s1+s2+s3)/300f)*100;
        System.out.println(avg);
        if(avg>=40 && s1>=33 && s2>=33 && s3>=33)
        {
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
}
