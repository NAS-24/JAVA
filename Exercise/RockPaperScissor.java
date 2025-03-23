package Exercise;
import java.util.Random;
import java.util.Scanner;


public class RockPaperScissor {
    public static void main(String[] args) {

        //0 for Rock
        //1 for Paper
        //2 for Scissor

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for Rock,1 for paper,2 for scissor");
        int userInput=sc.nextInt();

        Random r=new Random();
        int Computer=r.nextInt(3);
        System.out.println("Computer: "+Computer);
        if(Computer==0){
            System.out.println("Computer Chooses Rock");
        } else if(Computer==1){
            System.out.println("Computer Chooses Paper");
        } else{
            System.out.println("Computer Chooses Scissor");
        }


        if((userInput==0&&Computer==2)||(userInput==1&&Computer==0)||(userInput==2&&Computer==1)){
            System.out.println("You Win");
        } else if (userInput==Computer){
            System.out.println("DRAW");
        } else{
            System.out.println("Computer Win");
        }
    }
}
