package Exercise;

//Here Sorted means Ascending Order

public class SortedArr {
    public static void main(String[] args) {

        int[] Arr={1,2,3,4,5,6};
        boolean isSorted=true;

        for(int i=0;i<Arr.length-1;i++){
            if(Arr[i]>Arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        } else{
            System.out.println("NOt Sorted");
        }
    }
}
