package Assignment4UnconditionalStatements;

/*
Write a program to print prime numbers between 1 to 30.
 */
public class Program2 {
    public static void main(String[] args) {
        System.out.println("prime numbers between 1 to 30:");
        for(int i=2;i<=30;i++)
        {
            int count = 0;
            for(int j=1;j<=i;j++)
            {
                if(i % j == 0)
                    count++;
            }
            if(count == 2)
                System.out.print(i+" ");
        }
    }
}
