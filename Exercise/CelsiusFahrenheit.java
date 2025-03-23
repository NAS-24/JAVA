package Exercise;
import java.util.Scanner;

public class CelsiusFahrenheit {
    static int celsius(int n){
        int far=0;
        far=(n*9/5)+32;
        return far;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in Celsius");
        int x=sc.nextInt();
        System.out.println("Temperature in Fahrenheit is "+celsius(x));
    }
}
