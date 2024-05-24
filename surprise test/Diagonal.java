import java.util.*;
class Diagonal{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random rnd = new Random();
       System.out.print("Enter the array size:");
       int n = scanner.nextInt();
       int[][] mat = new int[n][n];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               mat[i][j] = rnd.nextInt(100);
           }
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               System.out.print(mat[i][j]+" ");
           }
           System.out.println();
       }
       
       System.out.println("\n");
       int row = 0 ,col = 0;
       int temprow = 0,tempcol = 0;
       while(temprow != n-1 || tempcol != n-1){
           while(col<n && row >=0){
               System.out.print(mat[row][col]+" ");
               row--;
               col++;
           }
            System.out.println();
            if(temprow != n-1){
                temprow++;
             }else{
                tempcol++;
            }
            row = temprow;
            col = tempcol;
       }
       System.out.println(mat[row][col]);
    }
}