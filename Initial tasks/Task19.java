import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {
        int[][] mat = {{2,3,4},
                        {5,6,7},
                        {8,9,10}};
        int [][] newarr = new int[mat[0].length][mat.length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                newarr[mat.length-1-j][i] = mat[i][j];
            }
        }
        for(int[] a:newarr)
            System.out.println(Arrays.toString(a));
    }
}
