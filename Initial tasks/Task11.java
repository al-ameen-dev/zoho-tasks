import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
    
    String res = "";
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string:");
    String str = sc.nextLine();
    sc.close();
    int i=0;
    while(i<str.length())
    {
        int count = 0;
        char currentChar = str.charAt(i);
        i++;
        while(i<str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9')
        {
            count = count * 10 + (str.charAt(i) - '0');
            i++;
        }
        for(int j=0;j<count;j++)
        {
            res += currentChar;
        }
    }
    System.out.print(res);   
    }
}
