package assignment6string;
import java.util.Scanner;

/*
Write a program to reverse the characters of a string.
 */
public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string:");
        String inputString = scanner.next();
        scanner.close();
        char[] reverse = inputString.toCharArray();
        int i=0,j=inputString.length()-1;
        while(i<j){
            char temp = reverse[i];
            reverse[i] = reverse[j];
            reverse[j] = temp;
            i++;
            j--;
        }
        System.out.println("The reversed String is :"+ new String(reverse));
    }
}
