
import java.util.*;;
public class Task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String n = sc.next();
        sc.close();
        //int i=0,j=n.length()-1;
        for(int i=0;i<n.length();i++)
        {
            for(int j=0;j<n.length();j++)
            {
                if(i==j || i+j==n.length()-1)
                {
                    System.out.print(n.charAt(j));
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
            System.out.println();
    }
}
