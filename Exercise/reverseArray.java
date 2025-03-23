package Exercise;

public class reverseArray {
    public static void main(String[] args) {
        int temp;
        int [] Array={34,23,56,75,45};
        int l=Array.length;
        int n=Math.floorDiv(l,2);

        for(int i=0;i<n;i++){
         temp=Array[i];
         Array[i]=Array[l-i-1];
         Array[l-i-1]=temp;
        }
        for(int element:Array){
            System.out.print(element +" ");
        }
    }
}
