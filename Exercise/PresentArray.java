package Exercise;

public class PresentArray {
    public static void main(String[] args) {

        int [] variable={45,23,47,87,32};
        int num=89;
        boolean isInArray=false;
        for(int element: variable){
            if(num==element){
                isInArray=true;
                break;
            }
        } if(isInArray){
            System.out.println("present");
        }else{
            System.out.println("Not Present");
        }
    }}
