package Methods;
import java.util.Scanner;

public class MethodRecursion {

    static long factorial(int n){
        if(n==0||n==1){
            return 1;
        } else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        System.out.println("The factorial of number "+x+" is "+factorial(x));



    }
}
