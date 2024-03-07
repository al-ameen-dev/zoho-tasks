package combined_assignments1;
import java.util.*;

public class AverageWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of peoples:");
        int noOfPeoples = sc.nextInt();
        float sum = 0;
        System.out.print("Enter the weight one by one:");
        for(int i=0;i<noOfPeoples;i++)
            sum += sc.nextInt();
        sc.close();
        System.out.printf("The average weight of the %d peoples is %.1f:",noOfPeoples,sum/noOfPeoples);
    }
}
