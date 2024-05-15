package assignment5arrays;

/*
Write a program to implement matrix multiplication.
 */
public class Program3 {
    public static void main(String[] args) {
        int[][] matrix1 = {{2,3,4},{5,6,7},{8,9,10}};
        int[][] matrix2 = {{2,3,4},{5,6,7},{8,9,10}};
        int[][] matrix3 = new int[3][3];

        System.out.println("matrix 1");
        printArray(matrix1);
        System.out.println("matrix 2");
        printArray(matrix2);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix3[i][j] = 0;
                for(int k=0;k<3;k++){
                    matrix3[i][j] = matrix1[i][k]*matrix2[k][j];
                }
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printArray(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
