package Threads;

//Below are commonly used constructor of thread class.
//1.Thread(String name)
//2.Thread(Runnable,String name)

class myThr1 extends Thread{
    public myThr1(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thread...1");

    }
}
class myThr2 implements Runnable{

    public void run(){
        System.out.println("Thread...2");
    }
}

public class Thread_Class {
    public static void main(String[] args) {
        myThr1 t1=new myThr1("Naman"); //Thread(String name);
        t1.start();
        System.out.println("ID of the following thread is " +t1.getId()); //Every thread has its own ID.
        System.out.println("Name of the following thread is " +t1.getName()); //We can give name to each thread using thread constructor.

        System.out.println("\n");
        myThr2 t2=new myThr2();
        Thread TH=new Thread(t2,"Aryan");  //Thread(Runnable,String name);
        TH.start();
        System.out.println("ID of the following thread is " +TH.getId()); //Every thread has its own ID.
        System.out.println("Name of the following thread is " +TH.getName());


    }
}
