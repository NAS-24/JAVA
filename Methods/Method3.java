package Methods;

public class Method3 {
    static int sum(int ...arr){
        int result=0;       //(int a,int ...arr) Here "int a" can be used to create a function bar
        for(int a:arr){
            result +=a;

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("VarArgs");
        System.out.println("The sum of nothing is: "+sum());
        System.out.println("The sum of 2,3,4,5 is: "+sum(2,3,4,5));
        System.out.println("The sum of 4,5,7,8,9,21 is "+sum(4,5,7,8,9,21));

    }
}
