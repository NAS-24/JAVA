package Threads;

class myThread3 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<4000000) {
            System.out.println("Thread1 is Running....1");
            i++;
        }
    }
}
class myThread4 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<4000000) {
            System.out.println("Thread2 is Running....2");
            i++;
        }
    }
}
class myThread5 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<4000000) {
            System.out.println("Thread5 is Running....3");
            i++;
        }
    }
}
class myThread6 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<4000000) {
            System.out.println("Thread6 is Running.....4");
            i++;
        }
    }
}
public class Thread_Priority {
    public static void main(String[] args) {
        myThread3 t1=new myThread3();
        myThread4 t2=new myThread4();
        myThread5 t3=new myThread5();
        myThread6 t4=new myThread6();

        t1.setPriority(Thread.MAX_PRIORITY);  //MAX_priority=10
        t2.setPriority(Thread.NORM_PRIORITY); //NORM_PRIORITY=5
        t3.setPriority(Thread.MIN_PRIORITY);   //MIN_PRIORITY=1
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
