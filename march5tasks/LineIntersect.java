package march5tasks;
import java.util.Scanner;

public class LineIntersect {
    public static void main(String[] args) {
        int x1,y1,x2,y2,x3,y3,x4,y4,m1,m2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the line 1 start points(x,y):");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("Enter the line 1 end points(x,y):");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.print("Enter the line 2 start points(x,y):");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.print("Enter the line 2 end points(x,y):");
        x4 = sc.nextInt();
        y4 = sc.nextInt();
        sc.close();
        int p1 = y2-y1;
        int p2 = x2-x1;
        int p3 = y4-y3;
        int p4 = x4-x3;
        if(p1 == 0 || p2 == 0)
            m1 = 0;
        else
            m1 = (y2-y1)/(x2-x1);
        if(p3 == 0 || p4 == 0)
            m2 = 0;
        else
            m2 = (y4-y3)/(x4-x3);

        if(m1 != m2)
            System.out.println("Intersect");
        else
            System.out.println("Not Intersect");

    }
    
    
}
