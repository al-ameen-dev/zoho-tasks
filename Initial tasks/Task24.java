import java.util.*;
public class Task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        int count =1;
        for(int i=1,c=1;i<n && c<n;i++,c= c+i)
            count++;
        int val = 1;
        for(int i=0;i<=count;i++)
        {
            for(int space =0;space<count-i;space++)
                System.out.print(" ");
            for(int j=0;j<i && val<=n;j++)
                System.out.print(val++ +" ");
            System.out.println();
        }
    }
}
