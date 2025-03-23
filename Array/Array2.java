package Array;

public class Array2 {
    public static void main(String[] args) {

        //Ways to print array Using For loop OR For-each Loop

        int[] variable={10,20,30,40,50,60};

        for(int i=0;i<variable.length;i++){
            System.out.println(variable[i]);  //This method is also known as Array traversal
        }

        //In reverse order
        System.out.println("\nIn Reverse order");
        for(int i = variable.length-1; i >=0; i--){
            System.out.println(variable[i]);
        }

        //Using For-Each loop
        System.out.println("\nPrinting using For each loop");
        for(int element: variable){
            System.out.println(element);
        }


    }
}
