package assignment5arrays;
import java.util.Scanner;

import string3.SameEnds;

/*
 Initialize a jagged array with N rows with weights of N persons.
 Each person can have different number of weights. Write
      (i) A function to enter the weight of any user at any time.
      (ii) A function to calculate the minimum weight of the nth person.
 */
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of persons:");
        int noOfPersons = scanner.nextInt();

        int[][] weights = new int[noOfPersons][];
        for(int i=0;i<weights.length;i++){
            weights[i] = new int[1];
        }

        exit: while(true){
            System.out.println("Enter '1' to add weights. '2' to calculate min weight. '3' to print weight. '4' to quit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the person index:");
                    int personIndex = scanner.nextInt();
                    System.out.print("Enter the weight:");
                    int weight = scanner.nextInt();
                    addWeight(weights, (personIndex-1), weight);
                    break;
                case 2:
                    System.out.print("Calculate min weight for person (index):");
                    personIndex = scanner.nextInt();
                    System.out.println("Min weight:"+calcMinWeight(weights[personIndex-1]));
                    break;
                case 3:
                    for(int i=0;i<noOfPersons;i++){
                        printWeights(weights[i]);
                    }
                    break;
                case 4:
                    break exit;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    public static void addWeight(int[][] weights,int personIndex,int weight)
    {
        int len = weights[personIndex].length;
        if (personIndex < 0 || personIndex >= weights.length)
        {
           System.out.println("Invalid person index!");
           return;
        }
        int[] newArray = new int[len+1];
        weights[personIndex][len-1] = weight;
        System.arraycopy(weights[personIndex], 0, newArray, 0, weights[personIndex].length);
        weights[personIndex] = newArray;
    }

    public static void printWeights(int[] weight){
        for(int i=0;i<weight.length-1;i++){
            System.out.print("Person "+(i+1)+" weight:"+weight[i]+" ");
        }
        System.out.println();
    }
    public static int calcMinWeight(int[] weight){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<weight.length-1;i++){
            if(min>weight[i]){
                min = weight[i];
            }
        }
        return min;
    }
}
