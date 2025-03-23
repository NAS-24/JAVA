package Exercise;

/* Similar way to find minimum.Just write int max=Integer.MAX_VALUE.We can also write Max=0 BUT to
take in Consideration of negative number we write (Integer .Max or Min)

int[] Arr={23,45,67,89,76,54};
        int max=Integer.MAX_VALUE;
        for(int element:Arr){
            if(element<max){
                max=element;            FOR MINIMUM


 */
public class MaxMinArr {

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);              //NOTE
        System.out.println(Integer.MAX_VALUE);              //NOTE

        int[] Arr={23,45,67,89,76,54};
        int max=Integer.MIN_VALUE;
        for(int element:Arr){
            if(element>max){
                max=element;
            }
        }
        System.out.println(max);
    }
}
