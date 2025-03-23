package Threads;

//Creating Thread by Implementing Runnable Interface.
class myThreadRunnable1 implements Runnable{

    public void run(){
        int i=0;
        while (i<4000000) {
            System.out.println("Thread1 is Running....1");

            i++;
        }
    }
}
class myThreadRunnable2 implements Runnable{

    public void run(){
        int i=0;
        while (i<4000000) {
            System.out.println("Thread2 is Running....2");

            i++;
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        myThreadRunnable1 bullet1=new myThreadRunnable1();
        Thread gun1=new Thread(bullet1);

        myThreadRunnable2 bullet2=new myThreadRunnable2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}

