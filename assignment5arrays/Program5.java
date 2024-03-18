package assignment5arrays;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of persons:");
        int noOfPersons = scanner.nextInt();

        int[][] weights = new int[noOfPersons][];
        for(int i=0;i<noOfPersons;i++){
            System.out.print("Enter no of weights for the person "+(i+1)+": ");
            int w = scanner.nextInt();
            weights[i] = new int[w];
            for(int j=0;j<w;j++){
                System.out.print("Enter the weight "+(j+1)+":");
                weights[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        for(int i=0;i<noOfPersons;i++){
            System.out.println("Minimm weight of person "+(i+1)+":"+calcMinWeight(weights[i]));
        }
    }

    public static int calcMinWeight(int[] weight){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<weight.length;i++){
            if(min>weight[i]){
                min = weight[i];
            }
        }
        return min;
    }
}
