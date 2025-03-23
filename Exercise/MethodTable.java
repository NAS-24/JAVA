package Exercise;
import java.util.Arrays;
import java.util.Scanner;

public class MethodTable {
    static void table(int n){

        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        table(x);
    }
}
