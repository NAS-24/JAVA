package Advance;

//Create a class and add a method with @deprecated annotation. What is its effect on program execution?

//Create an interface and generate an instance from it.

//Write a program to generate multiplication table of a given number and write it to a file.




import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}

interface MyInt{
    void display();
}

public class Advance_PS2 {

    public static void main(String[] args) {
//        MyDeprecated d = new MyDeprecated();
//        d.meth1();
//        MyInt i = () -> System.out.println("I am display");

        int i = 19;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

