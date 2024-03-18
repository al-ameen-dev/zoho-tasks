package assignment5arrays;

public class Program2 {
    public static void main(String[] args) {
        int[][] matrix =  {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] matrix2 = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix2[i][j] = matrix[j][i];
            }
        }
        System.out.println("Before transpose:");
        printArray(matrix);
        System.out.println("After transpose:");
        printArray(matrix2);
    }

    public static void printArray(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
