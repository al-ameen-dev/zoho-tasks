import java.util.Scanner;

class SpiralMatrix{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = scanner.nextInt();
        
        int[][] mat = new int[n][n];
        
        int top = 0,bottom = n-1,left =0,right=n-1,temp = 1;
        int row = 0,col=0;
        while(left<=right){
            while(col<=right){
                mat[row][col++] = temp++;
            }
            col--;
            top++;
            row++;
            while(row<=bottom){
                mat[row++][col] = temp++;
            }
            row--;
            right--;
            col--;
            while(col>=left){
                mat[row][col--] = temp++;
            }
            col++;
            bottom--;
            row--;
            while(row>=top){
                mat[row--][col] = temp++;
            }
            row++;
            left++;
            col++;
        }
        for(int i= 0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}