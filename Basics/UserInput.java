package Basics;

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter User Input");
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number in Integer form:");
         int a=sc.nextInt();
         System.out.println("Enter the number in float form:");
         float b=sc.nextFloat();
         float sum=a+b;
          System.out.print("The Sum is:");
          System.out.println(sum);


        //Other methods of Scanner Class
           System.out.println("Enter value of c");
         boolean c=sc.hasNextInt();    //hasnext is also used to take input
          System.out.println("Validity of C as int");
          System.out.println(c);

          //To check below code comment out other half code
        String str=sc.nextLine();
        System.out.println(str);


    }
}
