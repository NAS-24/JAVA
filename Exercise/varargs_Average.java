package Exercise;


public class varargs_Average {
    static int array(int ...arr){
        int sum=0;
        int Avg=0;
        for(int x:arr){
            sum=sum+x;
            Avg=sum/arr.length;

        } return Avg;

    }

    public static void main(String[] args) {
        System.out.println("The Average of following no is "+array(2,3,4,5,6));
    }
}
