
//Write a Java program to create a class called "Person" with a name and age attribute.
// Create two instances of the "Person" class, set their attributes using the constructor,
// and print their name and age.

    class person {
        private int age;
        private String name;

        public person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }


    public class OOPS {
    public static void main(String[] args) {

        person p1 = new person(23, "Naman");
        person p2 = new person(10, "Someone");

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p2.getName());
        System.out.println(p2.getAge());


    }
}

// Write a Java program to create a class called "Dog" with a name and breed attribute.
//Create two instances of the "Dog" class, set their attributes using the constructor
//and modify the attributes using the setter methods and print the updated values.
//

 /*class DOG {
    private String name;
    private String breed;

    public DOG(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
public class OOPS{
    public static void main(String[] args) {
        DOG dog1=new DOG("Shubhankar","Human");
        DOG dog2=new DOG("Kiba","Bulldog");
        System.out.println(dog1.getName()+" is "+dog1.getBreed());
        System.out.println(dog2.getName()+" is "+dog2.getBreed());

        //Modifying it.
        dog1.setName("Shubhankar");
        dog1.setBreed("Koparkhairne");
        dog2.setName("Kiba");
        dog2.setBreed("Husky");

        //Printing it.
        System.out.println(dog1.getName()+" is "+dog1.getBreed());
        System.out.println(dog2.getName()+" is "+dog2.getBreed());

    }
}      */

//Write a Java program to create a class called "Rectangle" with width and height attributes.
//Calculate the area and perimeter of the rectangle.


 /* class Rectangle{
    int height;
    int width;

    public Rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }

    public int getArea() {
        return height*width;
    }

    public int getPerimeter() {
        return 2*(height+width);
    }
}



public class OOPS {
    public static void main(String[] args) {

        Rectangle r1=new Rectangle(6,4);
        System.out.println("Area is "+r1.getArea());
        System.out.println("Perimeter is "+r1.getPerimeter());


    }
} *\


  */
// Write a Java program to create a class called "Circle" with a radius attribute.
//You can access and modify this attribute. Calculate the area and circumference of the circle.


 /* class Circle{
    float radius;

public double getArea(){
    return Math.PI*radius*radius;
}
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
}
public class OOPS {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.radius=4;
        System.out.println("The Area is "+circle.getArea());
        System.out.println("The Circumference  is "+circle.getCircumference());
    }
} */

/*Write a Java program to create a class called "Book" with
 attributes for title, author, and ISBN, and methods to add and remove books from a collection.
 */

  /* import java.util.ArrayList;
 class Book{
    String title,author;
    long ISBN;

    public Book(String title,String author,long ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }

   public static ArrayList<Book> bookCollection=new ArrayList<Book>(); //In this list collection of book will be stored.

     public String getAuthor() {
         return author;
     }

     public String getTitle() {
         return title;
     }

     public long getISBN() {
         return ISBN;
     }

     public static void add(Book book){
         bookCollection.add(book);
     }

     public static void remove(Book book){
         bookCollection.remove(book);
     }

     public static ArrayList<Book> get(){
         return bookCollection;
     }
 }
public class OOPS {
    public static void main(String[] args) {
        Book book1=new Book("The Alchemist","Paulo Coelho",9788408052944L);
        Book book2=new Book("The Great Gatsby","F. Scott Fitzgerald",9781982144524L);

        Book.add(book1);
        Book.add(book2);

        ArrayList<Book> bookCollection=Book.get();
        System.out.println("List of Books");
        for(Book book:bookCollection){
            System.out.println(book.getTitle()+" "+book.getAuthor()+" "+book.getISBN());
        }

        Book.remove(book2);
        System.out.println("\nAfter removing "+book2.getTitle());
        System.out.println("List of books left in collection are");
        for(Book book:bookCollection){
            System.out.println(book.getTitle()+" written by "+book.getAuthor()+" with ISBN "+book.getISBN());
        }

    }
}    */


/*Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
 and methods to calculate and update salary.
 */

/* class Employee{
    String name;
    String Job;
    int salary;

    public Employee(String name,String Job,int salary){
        this.name=name;
        this.Job=Job;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return Job;
    }

    public int getSalary() {
        return salary;
    }

    public double salaryUpdate(double percentage){
        return salary+salary*percentage/100;

    }
}
public class OOPS {
    public static void main(String[] args) {

        Employee e1=new Employee("Aryan","Devops",60000);
        Employee e2=new Employee("Ankit","Data Analytics",70000);
        Employee e3=new Employee("Naman","Software",1000000);

        System.out.println("The employee "+e3.getName()+" in "+e3.getJob()+" currently gets "+e3.getSalary());
        System.out.println("The employee "+e3.getName()+" is promoted as boss and his salary is "+e3.salaryUpdate(7.5));

    }
}  */

/*Write a Java program to create a class called "Bank" with a collection of accounts and methods to add
and remove accounts, and to deposit and withdraw money.
Also define a class called "Account" to maintain account details of a particular customer.
 */

