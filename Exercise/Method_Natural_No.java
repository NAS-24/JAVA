package Exercise;
import java.util.Scanner;

public class Method_Natural_No {
    static int sum(int n){
        if(n==1){                         //Base Condition
            return 1;
        } else{
            return n+sum(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(sum(x));
    }
}
