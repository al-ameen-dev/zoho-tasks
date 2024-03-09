import java.util.*;
public class Task30 {
    public static void main(String[] args) {
        List<List<Integer>> diagonal = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix:");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        for(int i=0;i<2*size-1;i++)
        {
            diagonal.add(new ArrayList<>());
        }
        System.out.println("Enter the elements one by one:");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                diagonal.get(i+j).add(matrix[i][j]);
            }
        }
        //System.out.println(diagonal.toString());;
        for(List<Integer> list:diagonal)
            System.out.println(list.toString());
    }
}
