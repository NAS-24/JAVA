package Threads;

//1.Write a program to print "good morning" and "welcome" continuously on the screen in Java using Threads.
//2.Add a sleep method in the welcome thread of question 1 to delay its execution for 200 ms.
//3.Demonstrate getPriority() and setPriority() methods in Java Threads.
//4.How do you get the state of a given thread in Java?

class goodMorning extends Thread{
    int i=0;
    public void run () {
//        while (i < 40000000) {

            System.out.println("Good Morning");
//            i++;
//
//        }
    }
}
class welcome extends Thread{
    int i=0;
    public void run() {
//        while (i < 40000000) {
            System.out.println("Welcome");
//            try {
//                Thread.sleep(200);
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
//            i++;
//        }
    }
}

public class Thread_PS {
    public static void main(String[] args) {
        goodMorning gm=new goodMorning();
        welcome wel=new welcome();

        gm.setPriority(Thread.MAX_PRIORITY);
        wel.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Priority for good morning thread "+gm.getPriority());
        System.out.println("Priority for welcome thread "+wel.getPriority());
        System.out.println("State for good morning thread "+gm.getState());  //Gives output based on lifecycle of thread

        gm.start();
        wel.start();
    }
}
