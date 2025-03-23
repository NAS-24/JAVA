package Threads;

//Creating Thread by extending thread class.
class myThread1 extends Thread{
    @Override
     public void run(){
        int i=0;
        while (i<4000000) {
            System.out.println("Thread1 is Running");
            System.out.println("I am coding");
            i++;
        }
     }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<4000000) {
            System.out.println("Thread2 is Running");
            System.out.println("I am Still..");
            i++;
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
         myThread1 t1=new myThread1();
         myThread2 t2=new myThread2();
         t1.start();
         t2.start();

    }
}
