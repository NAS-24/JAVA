package Exercise;

public class ArraySum {
    public static void main(String[] args) {
        float sum=0.0f;
        float [] Array={28.1f,25.2f,29.8f,30.3f,40.3f};

       for(int i=0;i<Array.length;i++){
            System.out.println(Array[i]);
            sum +=Array[i];
        }
        System.out.println("Sum of these array are");
        System.out.println(sum);
    }


    }

