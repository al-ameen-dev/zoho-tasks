package march5tasks;
import java.util.*;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        sc.close();
        int[][] mat = new int[num][num];
        int colStart = 0, colEnd = num, val = 1;
        int rowStart = 0, rowEnd = num;
        while(colStart < colEnd && rowStart < rowEnd)
        {
            int row = rowStart, col = colStart;
            while(colStart < colEnd && col < colEnd && row < rowEnd)
                mat[row++][col++] = val++;
            row = row-2;
            col = col-1;
            rowEnd--;
            while(row >=rowStart)
            {
                mat[row--][col] = val++;
            }
            col = col-1;
            row = row +1;
            colEnd--;
            while(col > colStart)
            {
                mat[row][col--] = val++;
            }
            rowStart++;
            colStart+=2;

        }

        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
}
