import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task16 {
    public static void main(String[] args) {
        int[] a,b;
        int s1,s2;
        Set<Integer> nodup = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array 1:");
        s1 = sc.nextInt();
        a = new int[s1];
        System.out.print("Enter the size of array 2:");
        s2 = sc.nextInt();
        b = new int[s2];
        System.out.print("Enter the elements of array 1:");
        for(int i=0;i<s1;i++)
            a[i] = sc.nextInt();
        System.out.print("Enter the elements of array 2:"); 
        for(int i=0;i<s2;i++)
            b[i] = sc.nextInt();
        sc.close();
        Arrays.sort(a);
        Arrays.sort(b);
        int[] merged = new int[a.length + b.length];
        System.arraycopy(a, 0, merged, 0, a.length);
        System.arraycopy(b, 0, merged, a.length, b.length);
        for(int i=0;i<merged.length;i++)
            nodup.add(merged[i]);
        System.out.println(Arrays.toString(nodup.toArray()));

    }
}
