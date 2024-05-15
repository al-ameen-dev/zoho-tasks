package assignment5arrays;

import java.util.Scanner;

/*
 Write a program to generate the matrix with integers in spiral order.
 Get size N from the user and generate an NxN spiral matrix.
 */
public class program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n number to generate spiral matrix:");
        int N = scanner.nextInt();
        scanner.close();
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = N;
        int colEnd = N;
        int temp = 1;
        int[][] spiral = new int[N][N];

        while(rowStart<rowEnd && colStart < colEnd){
            int col = colStart,row = rowStart;
            while(col<colEnd){
                spiral[row][col++] = temp++;
            }
            colEnd--;
            row++;
            col--;
            while(row<rowEnd){
                spiral[row++][col] = temp++;
            }
            rowEnd--;
            row--;
            col--;
            while(col>=colStart){
                spiral[row][col--] = temp++;
            }
            col++;
            row--;
            colStart++;
            while(row>rowStart){
                spiral[row--][col] = temp++;
            }
            rowStart++;
        }
        printArray(spiral);

    }

    public static void printArray(int[][] spiral){
        for(int i=0;i<spiral.length;i++){
            for(int j=0;j<spiral.length;j++){
                System.out.print(spiral[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
