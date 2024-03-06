package march5tasks;
import java.util.Scanner;

public class LexicoLargest {
    public static void main(String[] args) {
        String[] strarr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings to be enetered:");
        int size = sc.nextInt();
        strarr = new String[size];
        System.out.println("Enter the string one by one:");
        for(int i=0;i<size;i++)
            strarr[i] = sc.next();
        sc.close();
        for(int i=0;i<size;i++)
        {
            char[] chararr = strarr[i].toCharArray();
            for(int j=0;j<chararr.length;j++)
            {
                for(int k=j+1;k<chararr.length;k++)
                {
                    if((int)chararr[j] < (int)chararr[k])
                    {
                        char temp = chararr[j];
                        chararr[j] = chararr[k];
                        chararr[k] = temp;
                    }
                }
            }
            strarr[i] = new String(chararr);
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(strarr[i]);
        }
    }
}
