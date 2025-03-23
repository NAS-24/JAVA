package Exercise;
import java.util.Scanner;
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34,....
public class Fibonacci {
    static int fib(int n){
        /*if(n==1){
        return 0;
        }
        else if(n==2){
        return 1;
        }
         */ //This can Also be written as
        if(n==1 || n==2){
            return n-1;
        } else {
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("The fibonacci of "+x+" is "+fib(x));
    }

}
