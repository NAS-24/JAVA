package Exercise;

public class AddMatrix {
    public static void main(String[] args) {

        int[][] matrix1={{21,33,49},{50,54,34}};
        int[][] matrix2={{10,20,30},{40,50,60}};
        int[][] result={{0,0,0},{0,0,0}};


        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                result[i][j]=matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
