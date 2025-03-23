package Exercise;
import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Who are you?");
        String name=sc.nextLine();
        System.out.println("Hi "+name+" Hope you are having a Good day.");
    }

}
