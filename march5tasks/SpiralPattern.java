package march5tasks;
import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int[][] mat = new int[num][num];
        int temp = 1,i,j;
        int row=0,col =0;
        int rowShift=-1;
        for(i=0;i<num;i++)
        {
            for(j=0;j<num;j++)
            {
                if(i==j)
                    mat[i][j] = temp++;
            }
            if(i == num-1 && j==num-1)
            {
                row = i-1;
                col = j;
                while(mat[row][col]==0){
                    while(row>rowShift){
                        mat[row][col]=temp++;
                        row--;
                    }
                    row++;
                    col--;

                }
            }
        }
        for(i=0;i<num;i++)
        {
            for(j=0;j<num;j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
