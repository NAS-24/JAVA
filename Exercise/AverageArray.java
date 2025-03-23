package Exercise;

public class AverageArray {
    public static void main(String[] args) {
        int sum=0;
        float Average;
        int [] marks={24,34,20,45,23};

        for(int element:marks){
            sum+=element;

        }
        Average=sum/marks.length;
        System.out.println(Average);
    }
}
